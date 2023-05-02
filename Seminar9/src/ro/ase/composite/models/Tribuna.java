package ro.ase.composite.models;

import java.util.ArrayList;
import java.util.List;

public class Tribuna implements IComponentaAbstracta{
    private String nume;
    private List<IComponentaAbstracta> listaComponente;

    public Tribuna(String nume) {
        this.nume = nume;
        listaComponente=new ArrayList<>();
    }

    @Override
    public void adaugaNod(IComponentaAbstracta nod) throws Exception {
        listaComponente.add(nod);
    }

    @Override
    public void stergeNod(IComponentaAbstracta nod) throws Exception {
        listaComponente.remove(nod);
    }

    @Override
    public IComponentaAbstracta getNodCopil(int index) throws Exception {
        return listaComponente.get(index);
    }

    @Override
    public void afiseazaComponenta(String indentare) {
        System.out.println(indentare+"Tribuna "+this.nume+ " contine:");
        for(IComponentaAbstracta componentaAbstracta:listaComponente)
        {
            componentaAbstracta.afiseazaComponenta(indentare+"     ");
        }
    }
}