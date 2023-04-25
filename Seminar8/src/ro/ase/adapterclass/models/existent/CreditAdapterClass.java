package ro.ase.adapterclass.models.existent;

import ro.ase.adapterclass.models.nou.CreditLeasing;

public class CreditAdapterClass extends CreditLeasing implements ICredit {
    @Override
    public void oferaCredit(double sum) {
        super.obtineLeasing(sum);
    }
}
