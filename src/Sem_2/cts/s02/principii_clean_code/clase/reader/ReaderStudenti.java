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
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<>();

        while (input2.hasNext()) {
            Student student=new Student();
            super.readFromFile(input2,student);
            student.setAn_studii(input2.nextInt());
            student.setFacultate(input2.next());
            studenti.add(student);
        }

        input2.close();
        return studenti;
    }
}
