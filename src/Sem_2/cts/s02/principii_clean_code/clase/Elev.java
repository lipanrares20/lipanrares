package Sem_2.cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	
	public int getClasa() {
		return clasa;
	}
	public void setClasa(int i) {
		this.clasa = i;
	}
	public String getTutore() {
		return tutore;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}

	public static int sumaFinantata=30;

	public static void setSumaFinantata(int sumaFinantata) {
		Elev.sumaFinantata = sumaFinantata;
	}

	@Override
	public String toString() {
		return "Elev: "+super.toString()+ "Clasa=" + clasa + ", Tutore=" + tutore;

	}
	
	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}
	@Override
	public String afisareFinantare() {
		return ("Elevul "+super.afisareFinantare(Elev.sumaFinantata));
	}
	
}
