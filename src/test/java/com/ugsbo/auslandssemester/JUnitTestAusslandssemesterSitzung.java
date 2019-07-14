package com.ugsbo.auslandssemester;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ugsbo.entscheider.Entscheider;

public class JUnitTestAusslandssemesterSitzung {

	

	//USA als Destination
	@Test
	public void KategorieDestinationUSA() {
		Sitzung test = new Sitzung("Mustermann", "Max", 2, "USA");
		String erwartet = "USA";
		String b = test.kategorieDestination();
		assertEquals("Antwortstring sollte USA sein",erwartet,b);
		
	}

}
