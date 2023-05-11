package ro.ase.observer.main;

import ro.ase.observer.models.Client;
import ro.ase.observer.models.IClient;
import ro.ase.observer.models.IRestaurant;
import ro.ase.observer.models.Restaurant;

public class Main {
    public static void main(String[] args) throws Exception {
        IClient GigiBecali = new Client("Gigi Becali");
        IClient MeranEugen = new Client("Meran Eugen");
        IClient DorinAndrei = new Client("Dorin Andrei");

        Restaurant restaurant = new Restaurant("Trattoria");
        restaurant.abonareClient(GigiBecali);
        restaurant.abonareClient(MeranEugen);
        restaurant.abonareClient(DorinAndrei);
        restaurant.dezabonareClient(DorinAndrei);
        restaurant.notificareClienti("Avem mici ieftini!");
        restaurant.adaugareDiscount("20");



    }
}
