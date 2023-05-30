package ro.ase.unitTests.models;

import org.junit.jupiter.api.Test;
import ro.ase.unitTests.fakes.FakePachet;

import static org.junit.jupiter.api.Assertions.*;

class AgentieTurismTest {
    @Test
    void shouldHaveGoodPrice() {
        FakePachet fakePachet = new FakePachet();
        fakePachet.setSpecialPrice(500.00);

        FakePachet fakePachet2 = new FakePachet();
        fakePachet.setSpecialPrice(200.00);

        FakePachet fakePachet3 = new FakePachet();
        fakePachet.setSpecialPrice(300.00);

        AgentieTurism agentieTurism = new AgentieTurism();
        agentieTurism.adaugaPachet(fakePachet);
        agentieTurism.adaugaPachet(fakePachet2);
        agentieTurism.adaugaPachet(fakePachet3);
    }

}