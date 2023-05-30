package ro.ase.unitTests.mocks;

import ro.ase.unitTests.models.IPersoana;

public class StabPerson implements IPersoana  {
    @Override
    public String getSex() {
        return "M";
    }

    @Override
    public int getVarsta() {
        return 21;
    }

    @Override
    public boolean checkCNP() {
        return false;
    }
}
