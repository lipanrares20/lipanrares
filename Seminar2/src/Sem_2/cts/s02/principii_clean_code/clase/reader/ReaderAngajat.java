package Sem_2.cts.s02.principii_clean_code.clase.reader;

import Sem_2.cts.s02.principii_clean_code.clase.Angajat;
import Sem_2.cts.s02.principii_clean_code.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderAngajat extends ReaderAplicant{
    @Override
    public List<Aplicant> readAplicants(String file) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (scanner.hasNext()) {
            Angajat angajat=new Angajat();
            super.readAplicantFromFile(scanner,angajat);
            angajat.setSalariu(scanner.nextInt());
            angajat.setOcupatie(scanner.next());
            angajati.add(angajat);
        }
        scanner.close();
        return angajati;
    }
}
