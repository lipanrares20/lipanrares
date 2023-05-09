package ro.ase.flyweight.models;

//stare constanta
public class Client implements IClient {
    private String nume;
    private String nrTelefon;
    private String adresaEmail;

    public Client(String nume, String nrTelefon, String adresaEmail) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresaEmail = adresaEmail;
    }

    @Override
    public void afiseazaDetaliiRezervare(Rezervare rezervare) {
        System.out.println("Clientul "+this.nume+" cu numarul "+this.nrTelefon+
                " are adresa de email "+this.adresaEmail+"\n"+
                rezervare.toString());
    }
}
