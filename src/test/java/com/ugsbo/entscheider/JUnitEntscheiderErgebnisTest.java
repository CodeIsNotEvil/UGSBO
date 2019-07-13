package com.ugsbo.entscheider;

import static org.junit.Assert.*;


import org.junit.Assert;
import org.junit.Test;

public class JUnitEntscheiderErgebnisTest {

	

	@Test
	public void test() {
		Assert.assertTrue("" == Entscheider.ergebnis(1,1,12,3,1,1,1,1));
		Assert.assertTrue(Entscheider.skalaTest(11) >= 1 || Entscheider.skalaTest(11)<= 10 );
		Assert.assertTrue(0 == Entscheider.pruefen(2) || 1 == Entscheider.pruefen(2));
		//fail("Not yet implemented");
	}

}
