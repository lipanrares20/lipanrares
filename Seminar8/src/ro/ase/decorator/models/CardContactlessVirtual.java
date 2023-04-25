package ro.ase.decorator.models;

public class CardContactlessVirtual extends AbstractDecorator {
    public CardContactlessVirtual(ICard card) {
        super(card);
    }

    @Override
    public void payContactless(double sum) {
        System.out.println("S-a platit cu card contactless virtual. S-a debitat cu "+sum);
    }
}
