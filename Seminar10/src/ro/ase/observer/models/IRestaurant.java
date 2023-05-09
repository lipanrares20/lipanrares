package ro.ase.observer.models;

import ro.ase.observer.models.IClient;

import java.util.List;

public interface IRestaurant {
    public void abonareClient(IClient client);
    public void dezabonareClient(IClient client) throws Exception;
    public void notificareClienti(String mesaj);
}
