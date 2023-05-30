package ro.ase.unitTests.models;

import org.junit.jupiter.api.Test;

import ro.ase.unitTests.mocks.StabMinor;
import ro.ase.unitTests.mocks.StabPerson;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

class PachetTuristicTest {
    @Test
    void testPoateRezerva() {
        IPersoana client1 = new StabPerson();
        PachetTuristic pachetTuristic = new PachetTuristic(client1, "Punta cana", 3500.00);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    void minorNuPoateRezerva() {
        IPersoana client1 = new StabMinor();
        PachetTuristic pachetTuristic = new PachetTuristic(client1, "Costinesti", 560.00);
        assertTrue(pachetTuristic.poateRezerva());
    }

//    private int getValoare() {
//        return 10;
//    }
//
//    private boolean getBoolean() {
//        return true;
//    }
//
//    private List<Object> getLista() {
//        List<Object> lista = new ArrayList<>();
//        lista.add(6);
//        return lista;
//    }
//
//    private List<Object> getListaNULL() {
//        return null;
//    }
//
//    @Test
//    public void testDemonstrativ() {
//        assertEquals(10, getValoare());
//        assertEquals(true, getBoolean());
//        assertTrue(getBoolean());
//        assertFalse(!getBoolean());
//        assertNotNull(getLista());
//        assertNull(getListaNULL());
//    }


}