package ro.ase.unitTests.mocks;

import ro.ase.unitTests.models.IPersoana;

public class StabMinor implements IPersoana  {
    @Override
    public String getSex() {
        return "F";
    }

    @Override
    public int getVarsta() {
        return 15;
    }

    @Override
    public boolean checkCNP() {
        return false;
    }
}
