package singleton.ase.cts;

public class Papa {
    private String nume;
    private int nrAniInFunctie;
    private int alCatalea;

    private static Papa papa = new Papa("Benedict", 2, 267);

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrAniInFunctie() {
        return nrAniInFunctie;
    }

    public void setNrAniInFunctie(int nrAniInFunctie) {
        this.nrAniInFunctie = nrAniInFunctie;
    }

    public int getAlCatalea() {
        return alCatalea;
    }

    public void setAlCatalea(int alCatalea) {
        this.alCatalea = alCatalea;
    }

    private Papa(String nume, int nrAniInFunctie, int alCatalea) {
        this.nume = nume;
        this.nrAniInFunctie = nrAniInFunctie;
        this.alCatalea = alCatalea;
    }

    public static Papa getInstance() {
        return Papa.papa;
    }

}
