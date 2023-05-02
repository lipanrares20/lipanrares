package ro.ase.composite.models;

public class Loc implements IComponentaAbstracta{
    public Loc(int rand, int numar) {
        this.rand = rand;
        this.numar = numar;
    }

    private int rand;
    private int numar;
    @Override
    public void adaugaNod(IComponentaAbstracta nod) throws Exception {
        throw new Exception("Not yet implemented");
    }

    @Override
    public void stergeNod(IComponentaAbstracta nod) throws Exception {
        throw new Exception("Not yet implemented");
    }

    @Override
    public IComponentaAbstracta getNodCopil(int index) throws Exception {
        throw new Exception("Not yet implemented");
    }

    @Override
    public void afiseazaComponenta(String indentare) {
        System.out.println(indentare+"LOCUL: "+this.numar+" , RANDUL: "+this.rand);
    }
}