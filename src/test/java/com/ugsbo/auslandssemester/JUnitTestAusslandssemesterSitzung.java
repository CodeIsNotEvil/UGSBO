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

	// mehr als 12 Moante
	@Test
	public void KategorieInMonatenGroesserZwoelf() {
		Sitzung test = new Sitzung("Mustermann", "Max", 13, "Europa");
		int erwartet = 4;
		String b = test.kategorieInMonaten();
		assertEquals("erwartet int 4", erwartet, b);

	}

	// weniger als drei Monate
	@Test
	public void KategorieInMonatenKleinerDrei() {
		Sitzung test = new Sitzung("Mustermann", "Max", 2, "Europa");
		int erwartet = 1;
		String b = test.kategorieInMonaten();
		assertEquals("erwartet int 4", erwartet, b);

	}

	// zwischne zwei und fuenf
	@Test
	public void KategorieInMonatenZwischenZweiFuenf() {
		Sitzung test = new Sitzung("Mustermann", "Max", 4, "Europa");
		int erwartet = 2;
		String b = test.kategorieInMonaten();
		assertEquals("erwartet int 4", erwartet, b);

	}

	// zwischne fuenf und zwoelf
	@Test
	public void KategorieInMonatenZwischenFuenfZwoelf() {
		Sitzung test = new Sitzung("Mustermann", "Max", 12, "Europa");
		int erwartet = 3;
		String b = test.kategorieInMonaten();
		assertEquals("erwartet int 4", erwartet, b);

	}

}
