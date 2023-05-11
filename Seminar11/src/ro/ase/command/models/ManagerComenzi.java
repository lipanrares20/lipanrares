package ro.ase.command.models;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
    private List<ICommand> comenzi;

    public ManagerComenzi() {
        this.comenzi = new ArrayList<>();
    }

    public void invoicaComanda(ICommand command) {
        comenzi.add(command);
    }

    public void executaComanda() {
        this.comenzi.get(0).execute();
        this.comenzi.remove(this.comenzi.get(0));
    }
}
