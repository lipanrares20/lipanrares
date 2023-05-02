package ro.ase.proxy.models;

public class Proxy implements ICasaDeBilete {

    ICasaDeBilete casaDeBilete;

    public Proxy(ICasaDeBilete casaDeBilete) {
        this.casaDeBilete = casaDeBilete;
    }

    @Override
    public void vindeBilet(Client client) {
        if(client.getVarsta() > 14) {
            casaDeBilete.vindeBilet(client);
        } else {
            System.out.println("Clientul "+client+" e prea tanar.");
        }
    }
}
