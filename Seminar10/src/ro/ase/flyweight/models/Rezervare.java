package ro.ase.flyweight.models;

//starea temporare

public class Rezervare {
    private int nrMasa;
    private int nrPersoane;
    private String ora;

    public Rezervare(int nrMasa, int nrPersoane, String ora) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.ora = ora;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public String getOra() {
        return ora;
    }

    @Override
    public String toString() {
        return " si a rezervat masa "+this.nrMasa+" unde vor sosi un numar de "+this.nrPersoane+
                " persoane, la ora "+this.ora;
    }
}
