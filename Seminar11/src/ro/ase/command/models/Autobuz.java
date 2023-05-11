package ro.ase.command.models;

public class Autobuz implements IAutomobil {
    private int numar;

    public Autobuz(int numar) {
        this.numar = numar;
    }

    @Override
    public void plecareInCursa(int nrLinie) {
        System.out.println("Autobuzul cu numarul "+this.numar+" a plecat pe linia "+nrLinie);
    }
}
