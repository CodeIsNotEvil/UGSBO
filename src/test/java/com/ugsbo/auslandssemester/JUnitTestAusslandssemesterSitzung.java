package com.ugsbo.auslandssemester;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ugsbo.entscheider.Entscheider;

public class JUnitTestAusslandssemesterSitzung {

	// USA als Destination
	@Test
	public void KategorieDestinationUSA() {
		Sitzung test = new Sitzung("Mustermann", "Max", 2, "USA");
		String erwartet = "USA";
		String b = test.kategorieDestination();
		assertEquals("Antwortstring sollte USA sein", erwartet, b);

	}

	// Asien als Destination
	@Test
	public void KategorieDestinationAsien() {
		Sitzung test = new Sitzung("Mustermann", "Max", 2, "Asien");
		String erwartet = "Asien";
		String b = test.kategorieDestination();
		assertEquals("Antwortstring sollte Asien sein", erwartet, b);

	}

	// Neuseeland als Destination
	@Test
	public void KategorieDestinationNeuseeland() {
		Sitzung test = new Sitzung("Mustermann", "Max", 2, "Neuseeland");
		String erwartet = "Asien";
		String b = test.kategorieDestination();
		assertEquals("Antwortstring sollte Asien sein", erwartet, b);

	}

	// Australien als Destination
	@Test
	public void KategorieDestinationAustralien() {
		Sitzung test = new Sitzung("Mustermann", "Max", 2, "Australien");
		String erwartet = "Asien";
		String b = test.kategorieDestination();
		assertEquals("Antwortstring sollte Asien sein", erwartet, b);

	}

	// Europa als Destination
	@Test
	public void KategorieDestinationEuropa() {
		Sitzung test = new Sitzung("Mustermann", "Max", 2, "Europa");
		String erwartet = "Europa";
		String b = test.kategorieDestination();
		assertEquals("Antwortstring sollte Europa sein", erwartet, b);

	}

}
