package singleton.registry.ase.cts;

import java.util.HashMap;
import java.util.Map;

public class Firma {
    private String nume;
    private int varsta;
    private int numarAngajati;
    private static Map<String, Firma> firme= new HashMap<>();

    private Firma(String nume, int varsta, int numarAngajati) {
        this.nume = nume;
        this.varsta = varsta;
        this.numarAngajati = numarAngajati;
    }

    public synchronized static Firma getFirma(String numeFirma) {
        if(!firme.containsKey(numeFirma)) {
            Firma firma = new Firma(numeFirma, 0,0);
            firme.put(numeFirma, firma);
        }
        return firme.get(numeFirma);
    }

    public void Angajare() {
        this.numarAngajati++;
    }

    @Override
    public String toString() {
        return "Firma{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", numarAngajati=" + numarAngajati +
                '}';
    }
}
