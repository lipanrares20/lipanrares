package ro.ase.decorator.models;

public abstract class AbstractDecorator implements ICard {
    private ICard card;

    public abstract void payContactless(double sum);

    public AbstractDecorator(ICard card) {
        this.card = card;
    }

    @Override
    public void payOnline(double sum) {
        card.payOnline(sum);
    }

    @Override
    public void payPOS(double sum) {
        card.payPOS(sum);
    }
}
