package ro.ase.proxy.models;

public class CasaDeBilete implements ICasaDeBilete {
    @Override
    public void vindeBilet(Client client) {
        System.out.println("Bilet vandut clientului "+client.getNume());
    }
}
