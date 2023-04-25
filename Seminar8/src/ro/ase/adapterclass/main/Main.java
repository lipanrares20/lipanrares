package ro.ase.adapterclass.main;

import ro.ase.adapterclass.models.existent.CreditAdapterClass;
import ro.ase.adapterclass.models.existent.CreditIpotecar;
import ro.ase.adapterclass.models.existent.ICredit;
import ro.ase.adapterclass.models.nou.CreditLeasing;
import ro.ase.adapterobject.models.CreditAdapterObject;

public class Main {
    public static void afiseazaCredit(ICredit credit, double sum) {
        credit.oferaCredit(sum);
    }

    public static void main(String[] args) {
        ICredit creditIpotecar = new CreditIpotecar();
        afiseazaCredit(creditIpotecar, 200);

        CreditLeasing creditLeasing = new CreditLeasing();
        CreditAdapterClass creditAdapterClass = new CreditAdapterClass();
        afiseazaCredit(creditAdapterClass, 600);

        ICredit adapterObject = new CreditAdapterObject(creditLeasing);
        afiseazaCredit(adapterObject, 5700);
    }
}
