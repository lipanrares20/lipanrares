package ro.ase.decorator.models;

public interface ICard {
    public void payOnline(double sum);
    public void payPOS(double sum);
}
