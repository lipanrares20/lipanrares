package Sem_2.cts.s02.principii_clean_code.main;

import java.io.FileNotFoundException;
import java.util.List;

import Sem_2.cts.s02.principii_clean_code.clase.Aplicant;
import Sem_2.cts.s02.principii_clean_code.clase.reader.ReaderAngajat;
//Comm ptr. commit

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		ReaderAngajat readerAngajat=new ReaderAngajat();
		try {
			listaAngajati = readerAngajat.readAplicants("angajati.txt");
			for(Aplicant angajat:listaAngajati) {
				System.out.println(angajat.toString());
				angajat.afisareFinantare();
				angajat.afisareStatus();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
