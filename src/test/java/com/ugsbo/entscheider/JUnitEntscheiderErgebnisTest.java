package com.ugsbo.entscheider;

import static org.junit.Assert.*;


import org.junit.Assert;
import org.junit.Test;

public class JUnitEntscheiderErgebnisTest {

	

	@Test
	public void skalaTestTest() {
		int a = Entscheider.skalaTest(11);
		Assert.assertTrue(a >= 1 || a <= 10 );
		
	}
	
	@Test
	public void ergebnisTest() {
		String a = Entscheider.ergebnis(1,1,1,1,1,1,1,1);
		Assert.assertTrue(a == "Ich kann doch nicht fuer dich entscheiden, dass musst du schon selber wissen." );
		String b = Entscheider.ergebnis(21,1,1,3,2,1,1,4);
		Assert.assertTrue(b == "Naja, dann geh halt nach Hause und ruh dich aus.");
	}
	
	@Test
	public void pruefenTest() {
		int a = Entscheider.pruefen(2);
		Assert.assertTrue(0 == a || 1 == a);
	}
	
	@Test
	public void fragen() {
		String a = Entscheider.fragen();
		Assert.assertTrue(a == "" );
	}

}
