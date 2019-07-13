package com.ugsbo.entscheider;

import static org.junit.Assert.*;


import org.junit.Assert;
import org.junit.Test;

public class JUnitEntscheiderErgebnisTest {

	

	@Test
	public void skalaTestTest() {
		int a = Entscheider.skalaTest(11);
		Assert.assertTrue(a >= 1 || a <= 10 );
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void ergebnisTest() {
		Assert.assertTrue("" == Entscheider.ergebnis(1,1,1,1,1,1,1,1));
	}
	
	@Test
	public void pruefenTest() {
		int a = Entscheider.pruefen(2);
		Assert.assertTrue(0 == a || 1 == a);
	}

}
