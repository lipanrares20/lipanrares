package ro.ase.unitTests.fakes;

import ro.ase.unitTests.models.IPachet;

public class FakePachet implements IPachet {
    private double specialPrice;

    public void setSpecialPrice(double specialPrice) {
        this.specialPrice = specialPrice;
    }

    @Override
    public boolean poateRezerva() {
        return false;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

    @Override
    public Double getPret() {
        return specialPrice;
    }
}
