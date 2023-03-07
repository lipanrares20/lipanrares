package Sem_2.cts.s02.principii_clean_code.clase;

public class Student extends Aplicant {
	protected String facultate;
	protected int an_studii;
	
	
	public String getFacultate() {
		return facultate;
	}
	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	public int getAn_studii() {
		return an_studii;
	}
	public void setAn_studii(int an_studii) {
		this.an_studii = an_studii;
	}

	public static int sumaFinantata=20;

	public static void setSumaFinantata(int sumaFinantata) {
		Student.sumaFinantata = sumaFinantata;
	}

	public Student() {
		super();
		
	}
	
	public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int an_studii) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.facultate = facultate;
		this.an_studii = an_studii;
	}
	@Override
	public String toString() {
		return "Student: "+super.toString()+"Facultate=" + facultate + ", An_studii=" + an_studii ;
	}

	@Override
	public String afisareFinantare() {
		return ("Studentul "+super.afisareFinantare(Student.sumaFinantata));
	}
	
}
