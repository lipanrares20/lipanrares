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
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (input2.hasNext()) {
            Angajat angajat=new Angajat();
            super.readFromFile(input2,angajat);
            angajat.setSalariu(input2.nextInt());
            angajat.setOcupatie(input2.next());
            angajati.add(angajat);
        }
        input2.close();
        return angajati;
    }
}
