package singleton.ase.cts;

public class Director {

    private String nume;
    private int varsta;

    private static Director instanta = null;

    private Director(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public static Director getInstance(String nume) {
        if(Director.instanta==null) {
            Director.instanta = new Director(nume, 30);
        }
        return Director.instanta;
    }

    @Override
    public String toString() {
        return "Director{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
