package ro.ase.observer.models;

public class Client implements IClient {
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(this.nume+" ai primit urmatoarea notificare: \n"+mesaj);
    }
}
