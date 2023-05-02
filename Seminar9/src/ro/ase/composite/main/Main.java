package ro.cts.composite.main;

import ro.ase.composite.models.IComponentaAbstracta;
import ro.ase.composite.models.Loc;
import ro.ase.composite.models.Tribuna;

public class Main {
    public static void main(String[] args) throws Exception {
        IComponentaAbstracta tribunaP=new Tribuna("Tribuna Principala");
        IComponentaAbstracta tribunaC=new Tribuna("Tribuna Copii");
        IComponentaAbstracta tribunaA=new Tribuna("Tribuna Adulti");

        IComponentaAbstracta loc1=new Loc(2,1);
        IComponentaAbstracta loc2=new Loc(2,2);
        IComponentaAbstracta loc3=new Loc(2,3);

        tribunaP.adaugaNod(tribunaC);
        tribunaP.adaugaNod(tribunaA);
        tribunaC.adaugaNod(loc1);
        tribunaA.adaugaNod(loc2);
        tribunaP.adaugaNod(loc3);
        tribunaP.afiseazaComponenta(" ");
    }
}