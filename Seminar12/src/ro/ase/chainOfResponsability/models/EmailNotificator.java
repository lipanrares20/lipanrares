package ro.ase.chainOfResponsability.models;

public class EmailNotificator extends Notificare{

	public EmailNotificator(Notificare nextNotificare) {
		super(nextNotificare);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trimiteNotificare(Client client, String mesaj) {
		// TODO Auto-generated method stub
		if (client.getEmail() != null) {
			System.out.println("Clientul " + client.getNume() + " ai primit email cu mesajul: " + mesaj);
		} else if (super.getSuccesor() != null) {
			super.getSuccesor().trimiteNotificare(client, mesaj);
		}
		else {
			System.out.println("Nu se poate trimite notificarea");
		}
	}

}
