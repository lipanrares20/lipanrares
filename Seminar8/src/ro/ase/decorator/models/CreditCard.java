package ro.ase.decorator.models;

public class CreditCard implements ICard {

    @Override
    public void payOnline(double sum) {
        System.out.println("Plata e facuta online. S-a debitat cu "+sum);
    }

    @Override
    public void payPOS(double sum) {
        System.out.println("Plata e facuta on-site, la POS. S-a debitat cu "+sum);
    }
}
