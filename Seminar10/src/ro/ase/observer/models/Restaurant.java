package ro.ase.observer.models;

import ro.ase.observer.models.IClient;
import ro.ase.observer.models.IRestaurant;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant {
    private String numeRestaurant;
    public List<IClient> listaClienti;

    public Restaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
        listaClienti = new ArrayList<>();
    }

    @Override
    public void abonareClient(IClient client) {
        if(!listaClienti.contains(client)) {
            listaClienti.add(client);
        }
    }

    @Override
    public void dezabonareClient(IClient client) throws Exception {
        if(listaClienti.contains(client)) {
            listaClienti.remove(client);
        } else {
            throw new Exception("Clientul nu era abonat.");
        }
    }

    @Override
    public void notificareClienti(String mesaj) {
        for(IClient client: listaClienti) {
            client.primesteNotificare("Restaurantul "+this.numeRestaurant+" va notifica "+ mesaj);
        }
    }

    public void adaugaMeniuNou() {
        notificareClienti("S-a adaugat un meniu nou");
    }

    public void adaugareDiscount(String discount) {
        notificareClienti("A scazut pretul produselor cu "+discount+"%!");
    }
}
