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

	// Tests zu Methode kategorieInMonaten
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

	// Tests zu Methode learningAgreement

	@Test
	public void learningAgreementTest1() {
		Sitzung test = new Sitzung("Mustermann", "Max", 13, "Europa");
		String erwartet = "Jetzt musst du dich noch nicht über das Learning Agreement informieren.";
		String b = test.learningAgreement(4);
		assertEquals("erwartet Antwortstring", erwartet, b);

	}

	@Test
	public void learningAgreementTest2() {
		Sitzung test = new Sitzung("Mustermann", "Max", 12, "Europa");
		String erwartet = "Jetzt musst du dich noch nicht über das Learning Agreement informieren.";
		String b = test.learningAgreement(3);
		assertEquals("erwartet Antwortstring", erwartet, b);

	}

	@Test
	public void learningAgreementTest3() {
		Sitzung test = new Sitzung("Mustermann", "Max", 5, "Europa");
		String erwartet = "Jetzt solltest du dich über das Learning Agreement informieren. Was musst du wissen? Wer muss es unterzeichnen? Wo musst du es abgeben?";
		;
		String b = test.learningAgreement(2);
		assertEquals("erwartet Antwortstring", erwartet, b);

	}

	@Test
	public void learningAgreementTest4() {
		Sitzung test = new Sitzung("Mustermann", "Max", 1, "Europa");
		String erwartet = "Wenn du jetzt noch kein Learning Agreement hast ist das seltsam. Frag so schnell es geht mal jemanden ob du eins brauchst.";
		String b = test.learningAgreement(1);
		assertEquals("erwartet Antwortstring", erwartet, b);

	}

	// Tests zur Methode wohnen
	@Test
	public void wohnenTest1() {
		Sitzung test = new Sitzung("Mustermann", "Max", 1, "Europa");
		String erwartet = "Jetzt ist es schon fast zu spät um nach einer Wohnung zu suchen";
		String b = test.wohnen(1);
		assertEquals("erwartet ein Antwortstring", erwartet, b);

	}

	@Test
	public void wohnenTest2() {
		Sitzung test = new Sitzung("Mustermann", "Max", 5, "Europa");
		String erwartet = "Jetzt wird es höchste Zeit nach einer Wohung zu schauen.";
		String b = test.wohnen(2);
		assertEquals("erwartet ein Antwortstring", erwartet, b);

	}

	@Test
	public void wohnenTest3() {
		Sitzung test = new Sitzung("Mustermann", "Max", 12, "Europa");
		String erwartet = "Jetzt informier dich definitiv schon mal wie es mit Wohnen ist. Manchmal gibt es Webseiten auf denen man über die Zeit Punkte sammelt.";
		String b = test.wohnen(3);
		assertEquals("erwartet ein Antwortstring", erwartet, b);

	}

	@Test
	public void wohnenTest4() {
		Sitzung test = new Sitzung("Mustermann", "Max", 15, "Europa");
		String erwartet = "Schau dich am besten schon mal nach Wohnungen um. Manchmal gibt es Webseiten auf denen man über die Zeit Punkte sammelt.";
		String b = test.wohnen(4);
		assertEquals("erwartet ein Antwortstring", erwartet, b);

	}

	// Tests zur Methode packen

	@Test
	public void packenTest1() {
		Sitzung test = new Sitzung("Mustermann", "Max", 1, "Europa");
		String erwartet = "Jetzt solltest du definitiv eine Liste schreiben und so langsam mal anfangen.";
		String b = test.packen(1);
		assertEquals("erwartet ein Antwortstring", erwartet, b);

	}

	@Test
	public void packenTest2() {
		Sitzung test = new Sitzung("Mustermann", "Max", 6, "Europa");
		String erwartet = "Wenn du magst kannst schonmal anfangen eine Liste zu schreiben.";
		String b = test.packen(2);
		assertEquals("erwartet ein Antwortstring", erwartet, b);
	}

	@Test
	public void packenTest3() {
		Sitzung test = new Sitzung("Mustermann", "Max", 6, "Europa");
		String erwartet = "Kein Stress. DU hast noch eine Ewigkeit Zeit zum packen.";
		String b = test.packen(3);
		assertEquals("erwartet ein Antwortstring", erwartet, b);
	}

	@Test
	public void packenTest4() {
		Sitzung test = new Sitzung("Mustermann", "Max", 6, "Europa");
		String erwartet = "Kein Stress. DU hast noch eine Ewigkeit Zeit zum packen.";
		String b = test.packen(4);
		assertEquals("erwartet ein Antwortstring", erwartet, b);
	}

	// Tests zur Methode deadline

	// kategorieZeit = 1, kategorieZiel = USA

	@Test
	public void deadlineUSAEins() {
		Sitzung test = new Sitzung("Mustermann", "Max", 2, "USA");
		String erwartet = "Es tut mir Leid, aber du bist zu spät dran. Alle Deadlines sind durch.";
		String c = test.deadline(1, "USA");
		assertEquals("erwartet einen Antwortstring", erwartet, c);
	}

	// kategorieZeit = 1, kategorieZiel = Asien
	@Test
	public void deadlineAsienEins() {
		Sitzung test = new Sitzung("Mustermann", "Max", 2, "Asien");
		String erwartet = "Es tut mir Leid, aber du bist zu spät dran. Alle Deadlines sind durch.";
		String c = test.deadline(1, "Asien");
		assertEquals("erwartet einen Antwortstring", erwartet, c);
	}

	@Test
	public void deadlineUSAZwei() {
		Sitzung test = new Sitzung("Mustermann", "Max", 4, "USA");
		String erwartet = "Die Bewerbungsdeadlines sind hier wahrscheinlich schon durch. Stipendien könnten aber noch gehen";
		String c = test.deadline(2, "USA");
		assertEquals("erwartet einen Antwortstring", erwartet, c);
	}

	@Test
	public void deadlineAsienZwei() {
		Sitzung test = new Sitzung("Mustermann", "Max", 4, "Asien");
		String erwartet = "Die Bewerbungsdeadlines sind hier wahrscheinlich schon durch. Stipendien könnten aber noch gehen";
		String c = test.deadline(2, "Asien");
		assertEquals("erwartet einen Antwortstring", erwartet, c);
	}

	@Test
	public void deadlineUSADrei() {
		Sitzung test = new Sitzung("Mustermann", "Max", 6, "USA");
		String erwartet = "Jetzt solltest du dich auf jeden Fall über die Deadlines informieren.";
		String c = test.deadline(3, "USA");
		assertEquals("erwartet Antwortstring", erwartet, c);
	}

	@Test
	public void deadlineAsienDrei() {
		Sitzung test = new Sitzung("Mustermann", "Max", 6, "Asien");
		String erwartet = "Jetzt solltest du dich auf jeden Fall über die Deadlines informieren.";
		String c = test.deadline(3, "Asien");
		assertEquals("erwartet Antwortstring", erwartet, c);
	}

	@Test
	public void deadlineUSAVier() {
		Sitzung test = new Sitzung("Mustermann", "Max", 13, "USA");
		String erwartet = "Zu diesem Zeitraum ist es sinnvoll sich über die entsprechenden Deadlines zu informieren.";
		String c = test.deadline(4, "USA");
		assertEquals("erwartet Antwortstring", erwartet, c);
	}

	@Test
	public void deadlineAsienVier() {
		Sitzung test = new Sitzung("Mustermann", "Max", 13, "Asien");
		String erwartet = "Zu diesem Zeitraum ist es sinnvoll sich über die entsprechenden Deadlines zu informieren.";
		String c = test.deadline(4, "Asien");
		assertEquals("erwartet Antwortstring", erwartet, c);
	}

	@Test
	public void deadlineEuropaEins() {
		Sitzung test = new Sitzung("Mustermann", "Max", 1, "Europa");
		String erwartet = "Es tut mir Leid, aber du bist zu spät dran. Alle Deadlines sind durch.";
		String c = test.deadline(1, "Europa");
		assertEquals("erwartet Antwortstring", erwartet, c);
	}

	@Test
	public void deadlineEuropaZwei() {
		Sitzung test = new Sitzung("Mustermann", "Max", 4, "Europa");
		String erwartet = "Jetzt aber wirklich zügig. Die Deadlines sind bestimmt noch nicht ganz abgelaufen.";
		String c = test.deadline(2, "Europa");
		assertEquals("erwartet Antwortstring", erwartet, c);
	}

	@Test
	public void deadlineEuropaDrei() {
		Sitzung test = new Sitzung("Mustermann", "Max", 6, "Europa");
		String erwartet = "Jetzt wäre es wichtig sich über Deadlines zu informieren.";
		String c = test.deadline(3, "Europa");
		assertEquals("erwartet Antwortstring", erwartet, c);
	}

	@Test
	public void deadlineEuropaVier() {
		Sitzung test = new Sitzung("Mustermann", "Max", 13, "Europa");
		String erwartet = "Zu diesem Zeitpunkt musst du dich noch nicht um Deadlines sorgen. Mal schauen schadet aber nicht.";
		String c = test.deadline(4, "Europa");
		assertEquals("erwartet Antwortstring", erwartet, c);
	}

	// Testfälle zur Methode finanzierung()

	@Test
	public void finanzierungAsienEins() {
		Sitzung test = new Sitzung("Mustermann", "Max", 1,"Asien");
		String e = "Es tut mir Leid, aber du bist zu spät dran. Alle Deadlines sind durch.";
		String a = test.finanzierung(1, "Asien");
		assertEquals("erwartet Antwortstring", e, a);
	}
	
	@Test
	public void finanzierungUSAEins() {
		Sitzung test = new Sitzung("Mustermann", "Max", 1,"USA");
		String e = "Es tut mir Leid, aber du bist zu spät dran. Alle Deadlines sind durch.";
		String a = test.finanzierung(1, "USA");
		assertEquals("erwartet Antwortstring", e, a);
	}
	
	@Test
	public void finanzierungAsienZwei() {
		Sitzung test = new Sitzung("Mustermann", "Max", 4,"Asien");
		String e = "Die Bewerbungsdeadlines sind hier wahrscheinlich schon durch. Stipendien könnten aber noch gehen";
		String a = test.finanzierung(1, "USA");
		assertEquals("erwartet Antwortstring", e, a);
	}
	
	@Test
	public void finanzierungUSAZwei() {
		Sitzung test = new Sitzung("Mustermann", "Max", 4,"USA");
		String e = "Die Bewerbungsdeadlines sind hier wahrscheinlich schon durch. Stipendien könnten aber noch gehen";
		String a = test.finanzierung(4, "USA");
		assertEquals("erwartet Antwortstring", e, a);
	}

}
