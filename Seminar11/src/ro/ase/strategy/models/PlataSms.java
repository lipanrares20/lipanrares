package ro.ase.strategy.models;

public class PlataSms implements ITipPlata {
    @Override
    public void plateste(double pretBilet) {
        System.out.println("Plata a fost efectuata prin SMS. S-a debitat cu "+pretBilet);
    }
}
