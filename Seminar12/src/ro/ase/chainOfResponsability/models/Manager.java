package ro.ase.chainOfResponsability.models;

public class Manager extends Notificare {

	public Manager(Notificare nextNotificare) {
		super(nextNotificare);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trimiteNotificare(Client client, String mesaj) {
		// TODO Auto-generated method stub
		System.out.println("Clientul " + client.getNume() + " nu are date de contact.");
	}

}
