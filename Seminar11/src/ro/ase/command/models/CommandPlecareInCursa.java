package ro.ase.command.models;

public class CommandPlecareInCursa implements ICommand {
    private int nrLinie;
    private IAutomobil automobil;

    public CommandPlecareInCursa(int nrLinie, IAutomobil automobil) {
        this.nrLinie = nrLinie;
        this.automobil = automobil;
    }

    @Override
    public void execute() {
        automobil.plecareInCursa(this.nrLinie);
    }
}
