package ro.ase.facade.models;

public class Client {
    private String cnp;
    private String nume;

    public Client(String nume, String cnp) {
        this.nume = nume;
        this.cnp = cnp;
    }

    public String getNume() {
        return nume;
    }

    public String getCnp() {
        return cnp;
    }
}
