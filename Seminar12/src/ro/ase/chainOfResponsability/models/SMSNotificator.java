package ro.ase.chainOfResponsability.models;

public class SMSNotificator extends Notificare {

	public SMSNotificator(Notificare nextNotificare) {
		super(nextNotificare);
	}

	@Override
	public void trimiteNotificare(Client client, String mesaj) {
		if (client.getNrTelefon() != null) {
			System.out.println("Clientul " + client.getNume() + " ai primit sms cu mesajul: " + mesaj);
		} else if (super.getSuccesor() != null) {
			super.getSuccesor().trimiteNotificare(client, mesaj);
		}
		else {
			System.out.println("Nu se poate trimite notificarea");
		}
	}

}
