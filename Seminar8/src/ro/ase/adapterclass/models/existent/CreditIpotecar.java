package ro.ase.adapterclass.models.existent;

public class CreditIpotecar implements ICredit {
    @Override
    public void oferaCredit(double sum) {
        System.out.println("A fost oferit credit in valoare de: "+sum);
    }
}
