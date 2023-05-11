package ro.ase.strategy.models;

public class Calator {
    private String nume;
    private double bani;
    private ITipPlata metodaPlata;

    public Calator(String nume, double bani) {
        this.nume = nume;
        this.metodaPlata = new PlataCardCalatorii();
        this.bani = bani;
    }

    public ITipPlata getMetodaPlata() {
        return metodaPlata;
    }

    public void setMetodaPlata(ITipPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void platesteBilet(double tarifBilet) {
        if(bani>tarifBilet) {
            this.metodaPlata.plateste(tarifBilet);
            bani -= tarifBilet;
        } else {
            System.out.println("Sari rapid pana nu vine controlul!");
        }
    }
}
