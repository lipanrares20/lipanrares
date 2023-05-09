package ro.ase.flyweight.models;

import java.util.HashMap;
import java.util.Map;

//fabrica clienti
public class BazaDeDateClienti {
    private Map<String, IClient> clienti;

    public BazaDeDateClienti() {
        clienti= new HashMap<>();
    }

    public IClient getClient(String nume, String nrTelefon, String adresaEmail) {
        if(!clienti.containsKey(nrTelefon)) {
            Client client = new Client(nume, nrTelefon, adresaEmail);
            clienti.put(nrTelefon, client);
        }
        return clienti.get(nrTelefon);
    }
}
