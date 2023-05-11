package ro.ase.strategy.models;

public class PlataCardBancar implements ITipPlata {
    @Override
    public void plateste(double pretBilet) {
        System.out.println("Plata a fost efectuata cu cardul bancar. S-a debitat cu "+pretBilet);
    }
}
