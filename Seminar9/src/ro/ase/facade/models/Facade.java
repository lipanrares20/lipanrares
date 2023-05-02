package ro.ase.facade.models;

public class Facade {
    Politia politia;

    public Facade() {
        politia = new Politia();
    }
    public void permiteIntrarea(Client client, Bilet bilet) {
        if(client.getNume()==bilet.getNumeCumparator()) {
            if(politia.areCazier(client.getCnp())) {
                System.out.println("Chemati politia pentru infractorul "+client.getNume());
            } else {
                System.out.println("Sa intre "+client.getNume());
            }
        } else {
            System.out.println("Nu este biletul lui.");
        }
    }
}
