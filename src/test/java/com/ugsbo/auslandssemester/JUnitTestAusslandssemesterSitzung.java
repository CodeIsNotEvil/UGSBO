package com.ugsbo.auslandssemester;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ugsbo.entscheider.Entscheider;

public class JUnitTestAusslandssemesterSitzung {
	
//Tests zu Methode kategorieDestination
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
	
	//Tests zu Methode kategorieInMonaten
	// mehr als 12 Moante
	@Test
	public void KategorieInMonatenGroesserZwoelf() {
		Sitzung test = new Sitzung("Mustermann", "Max", 13, "Europa");
		int erwartet = 4;
		int b = test.kategorieInMonaten();
		assertEquals("erwartet int 4", erwartet, b);

	}

	// weniger als drei Monate
	@Test
	public void KategorieInMonatenKleinerDrei() {
		Sitzung test = new Sitzung("Mustermann", "Max", 2, "Europa");
		int erwartet = 1;
		int b = test.kategorieInMonaten();
		assertEquals("erwartet int 4", erwartet, b);

	}

	// zwischne zwei und fuenf
	@Test
	public void KategorieInMonatenZwischenZweiFuenf() {
		Sitzung test = new Sitzung("Mustermann", "Max", 4, "Europa");
		int erwartet = 2;
		int b = test.kategorieInMonaten();
		assertEquals("erwartet int 4", erwartet, b);

	}

	// zwischne fuenf und zwoelf
	@Test
	public void KategorieInMonatenZwischenFuenfZwoelf() {
		Sitzung test = new Sitzung("Mustermann", "Max", 12, "Europa");
		int erwartet = 3;
		int b = test.kategorieInMonaten();
		assertEquals("erwartet int 4", erwartet, b);

	}
	
	//Tests zu Methode learningAgreement
	
	@Test
	public void learningAgreementTest1() {
		String erwartet = "Jetzt musst du dich noch nicht über das Learning Agreement informieren.";
		String b = Sitzung.learningAgreement(4);
		assertEquals("erwartet Antwortstring", erwartet, b);

	}
	
	@Test
	public void learningAgreementTest2() {
		String erwartet = "Jetzt musst du dich noch nicht über das Learning Agreement informieren.";
		String b = Sitzung.learningAgreement(3);
		assertEquals("erwartet Antwortstring", erwartet, b);

	}
	
	@Test
	public void learningAgreementTest3() {
		String erwartet = "Jetzt solltest du dich über das Learning Agreement informieren. Was musst du wissen? Wer muss es unterzeichnen? Wo musst du es abgeben?";;
		String b = Sitzung.learningAgreement(2);
		assertEquals("erwartet Antwortstring", erwartet, b);

	}
	
	public void learningAgreementTest4() {
		String erwartet = "Wenn du jetzt noch kein Learning Agreement hast ist das seltsam. Frag so schnell es geht mal jemanden ob du eins brauchst.";
		String b = Sitzung.learningAgreement(1);
		assertEquals("erwartet Antwortstring", erwartet, b);

	}
	
	

}
