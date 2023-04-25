package ro.ase.adapterobject.models;

import ro.ase.adapterclass.models.existent.CreditAdapterClass;
import ro.ase.adapterclass.models.existent.ICredit;
import ro.ase.adapterclass.models.nou.CreditLeasing;

public class CreditAdapterObject implements ICredit {
    private CreditLeasing creditLeasing;
    public CreditAdapterObject(CreditLeasing credit) {
        this.creditLeasing = credit;
    }
    @Override
    public void oferaCredit(double sum) {
        this.creditLeasing.obtineLeasing(sum);
    }
}
