package ro.ase.unitTests.fakes;

import ro.ase.unitTests.models.IPersoana;

public class FakePerson implements IPersoana {
    private String getSexValue;
    private int getVarstaValue;
    private boolean getCheckCNPValue;

    public void setGetSexValue(String getSexValue) {
        this.getSexValue = getSexValue;
    }

    public void setGetVarstaValue(int getVarstaValue) {
        this.getVarstaValue = getVarstaValue;
    }

    public void setGetCheckCNPValue(boolean getCheckCNPValue) {
        this.getCheckCNPValue = getCheckCNPValue;
    }

    @Override
    public String getSex() {
        return getSexValue;
    }

    @Override
    public int getVarsta() {
        return getVarstaValue;
    }

    @Override
    public boolean checkCNP() {
        return getCheckCNPValue;
    }
}
