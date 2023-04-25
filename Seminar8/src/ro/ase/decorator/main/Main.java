package ro.ase.decorator.main;

import ro.ase.decorator.models.*;

public class Main {
    public static void main(String[] args) {
        ICard creditCard = new CreditCard();
        creditCard.payOnline(200);
        creditCard.payPOS(500);

        AbstractDecorator decorator = new CardContactless(creditCard);
        decorator.payContactless(700);

        AbstractDecorator decoratorVirtual = new CardContactlessVirtual(creditCard);
        decoratorVirtual.payContactless(800);

    }
}
