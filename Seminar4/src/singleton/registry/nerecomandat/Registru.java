package singleton.registry.nerecomandat;

import java.util.HashMap;
import java.util.Map;

public class Registru {
    private static Map<String, Firma> firme = new HashMap<>();

    public static Firma getFirma(String numeFirma) {
        if(firme.containsKey(numeFirma)) {
            Firma firma = new Firma(numeFirma, 0);
            firme.put(numeFirma, firma);
        }
        return firme.get(numeFirma);
    }
}
