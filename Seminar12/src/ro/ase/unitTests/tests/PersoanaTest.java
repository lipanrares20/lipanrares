package ro.ase.unitTests.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import ro.ase.unitTests.models.IPersoana;
import ro.ase.unitTests.models.Persoana;

class PersoanaTest {

	@Test
	void testGetVarsta() {
		IPersoana persoana = new Persoana("Maria", "6011023432345");
		assertEquals(21, persoana.getVarsta());
	}
	
	@Test
	void testGetVarstaError() {
		IPersoana persoana = new Persoana("Mihai", "5230524432345");
		assertThrows(NotBornException.class,new Executable() {
			
			@Override
			public void execute() throws Throwable {
				// TODO Auto-generated method stub
				persoana.getVarsta();		
			}
		});
	}

}
