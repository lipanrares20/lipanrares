package Sem_2.cts.s02.principii_clean_code.clase.reader;

import Sem_2.cts.s02.principii_clean_code.clase.Aplicant;
import Sem_2.cts.s02.principii_clean_code.clase.Elev;
import Sem_2.cts.s02.principii_clean_code.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderElev extends ReaderAplicant {
    @Override
    public List<Aplicant> readAplicants(String file) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (scanner.hasNext()) {
            Elev elev=new Elev();
            super.readAplicantFromFile(scanner,elev);
            elev.setClasa(scanner.nextInt());
            elev.setTutore(scanner.next());
            elevi.add(elev);
        }
        scanner.close();
        return elevi;
    }
}
