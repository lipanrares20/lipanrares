package ro.ase.prototype.models;

public class Client implements IAbstractInterface {
    private String nume;
    private String nrTelefon;
    private String adresaEmail;

    private Client(){};

    public Client(String nume, String nrTelefon, String adresaEmail) {
        if(nume.length() > 2) {
            this.nume = nume;
        } else {
            throw new IllegalArgumentException();
        }
        this.nrTelefon = nrTelefon;

        if(adresaEmail.contains("@")) {
            this.adresaEmail = adresaEmail;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public IAbstractInterface createADeepCopy() {
        Client client = new Client();
        client.nume = this.nume;
        client.nrTelefon = this.nrTelefon;
        client.adresaEmail = this.adresaEmail;
        return (IAbstractInterface)client;
    }

    @Override
    public IAbstractInterface createACopy() throws CloneNotSupportedException {
        return (IAbstractInterface)this.clone();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", adresaEmail='").append(adresaEmail).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
