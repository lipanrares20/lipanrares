package ro.ase.composite.models;


public interface IComponentaAbstracta {
    public void addNod(IComponentaAbstracta nod);
    public void stergeNod(IComponentaAbstracta nod);
    public void getNod(int index);
    public void afiseazaComponenta(String indentare);

}
