package ro.ase.chainOfResponsability.models;

public abstract class Notificare {
	private Notificare nextNotificare;

	public abstract void trimiteNotificare(Client client, String mesaj);

	public Notificare(Notificare nextNotificare) {
		super();
		this.nextNotificare = nextNotificare;
	}

	public Notificare getSuccesor() {
		return nextNotificare;
	}

	public void setSuccesor(Notificare nextNotificare) {
		this.nextNotificare = nextNotificare;
	}
	
	
}
