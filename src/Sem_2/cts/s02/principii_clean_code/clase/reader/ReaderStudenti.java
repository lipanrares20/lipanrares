package Sem_2.cts.s02.principii_clean_code.clase.reader;

import Sem_2.cts.s02.principii_clean_code.clase.Aplicant;
import Sem_2.cts.s02.principii_clean_code.clase.Elev;
import Sem_2.cts.s02.principii_clean_code.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderStudenti extends ReaderAplicant{
    @Override
    public List<Aplicant> readAplicants(String file) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<>();

        while (scanner.hasNext()) {
            Student student=new Student();
            super.readAplicantFromFile(scanner,student);
            student.setAn_studii(scanner.nextInt());
            student.setFacultate(scanner.next());
            studenti.add(student);
        }

        scanner.close();
        return studenti;
    }
}
