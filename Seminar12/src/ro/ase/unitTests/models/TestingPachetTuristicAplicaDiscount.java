package ro.ase.unitTests.models;

import org.junit.jupiter.api.Test;
import ro.ase.unitTests.fakes.FakePerson;

import static org.junit.jupiter.api.Assertions.*;

class TestingPachetTuristicAplicaDiscount {

    @Test
    void shouldApplyDiscountForSeniors() {
        FakePerson persoanaFake = new FakePerson();
        persoanaFake.setGetCheckCNPValue(true);
        persoanaFake.setGetVarstaValue(66);
        persoanaFake.setGetSexValue("M");
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Maldive", 1000.00);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(900, pachetTuristic.getPret());
    }

    @Test
    void shouldNotApplyDiscountForSeniors() {
        FakePerson persoanaFake = new FakePerson();
        persoanaFake.setGetVarstaValue(20);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Maldive", 2000.00);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(pachetTuristic.getPret(), pachetTuristic.getPret());
    }

}