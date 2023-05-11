package ro.ase.command.main;

import ro.ase.command.models.Autobuz;
import ro.ase.command.models.CommandPlecareInCursa;
import ro.ase.command.models.IAutomobil;
import ro.ase.command.models.ManagerComenzi;

public class Main {
    public static void main(String[] args) {
        ManagerComenzi managerComenzi = new ManagerComenzi();
        IAutomobil autobuzulMagic = new Autobuz(0);
        managerComenzi.invoicaComanda(new CommandPlecareInCursa(10, autobuzulMagic));
        managerComenzi.invoicaComanda(new CommandPlecareInCursa(7, new Autobuz(2)));
        managerComenzi.invoicaComanda(new CommandPlecareInCursa(11, autobuzulMagic));
        managerComenzi.invoicaComanda(new CommandPlecareInCursa(11, new Autobuz(3)));
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.invoicaComanda(new CommandPlecareInCursa(8, new Autobuz(3)));
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();

    }
}
