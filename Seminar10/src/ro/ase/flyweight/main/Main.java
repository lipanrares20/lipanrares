package ro.ase.flyweight.main;

import ro.ase.flyweight.models.BazaDeDateClienti;
import ro.ase.flyweight.models.Client;
import ro.ase.flyweight.models.IClient;
import ro.ase.flyweight.models.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare masa1 = new Rezervare(1,1,"08:00");
        Rezervare masa2 = new Rezervare(2,2,"15:00");
        Rezervare masa3 = new Rezervare(3,4,"20:00");

        BazaDeDateClienti bazaDeDateClienti = new BazaDeDateClienti();

        IClient client1 = bazaDeDateClienti.getClient("Gigi Becali", "0707070707", "gigica@fcsteaua.ro");
        IClient client2 = bazaDeDateClienti.getClient("Meran Eugen", "0707070700", "fortza@steaua.ro");
        IClient client3 = bazaDeDateClienti.getClient("", "0707070700", null);

        client1.afiseazaDetaliiRezervare(masa1);
        client2.afiseazaDetaliiRezervare(masa2);
        client3.afiseazaDetaliiRezervare(masa3);
    }
}
