package singleton.mains;

import singleton.registry.nerecomandat.Firma;
import singleton.registry.nerecomandat.Registru;

public class MainRegistryNerecomandate {
    public static void main(String[] args) {
        Firma firma1 = Registru.getFirma("SC Vasile Traian SRL");
        System.out.println(firma1);
    }
}
