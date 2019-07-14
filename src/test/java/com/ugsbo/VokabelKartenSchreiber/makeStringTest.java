package com.ugsbo.VokabelKartenSchreiber;

import static org.junit.Assert.*;

import org.junit.*;

import com.ugsbo.VokableKartenSchreiber.Vokabelkarte;

public class makeStringTest {
	
	private Vokabelkarte workingObjekt;

	@Before
	public void setup() {
		workingObjekt = new Vokabelkarte();
	}

	@Test
	public void makeString_ReturnsStringKorrekt() {
		Vokabelkarte WorkingObjekt = workingObjekt;
		
		String name = "TestName";
		String frage = "TestFrage";
		String antwort1 = "TestAntwort";
		String antwort2 = "TestAntwort";
		String antwort3 = "TestAntwort";
		String antwort4 = "TestAntwort";
		
		String Erwartet = "TestName/TestFrage/TestAntwort;TestAntwort;TestAntwort;TestAntwort";
		
		String Ergebnis = WorkingObjekt.makeString(name,frage,antwort1,antwort2,antwort3,antwort4);
		
		assertEquals("Name Frage und alle Antworten" , Erwartet, Ergebnis);
	}

	public void makeString_ohneName() {
		Vokabelkarte WorkingObjekt = workingObjekt;
		
		String name = "";
		String frage = "TestFrage";
		String antwort1 = "TestAntwort";
		String antwort2 = "TestAntwort";
		String antwort3 = "TestAntwort";
		String antwort4 = "TestAntwort";
		
		String Erwartet = "TestFrage/TestAntwort;TestAntwort;TestAntwort;TestAntwort";
		
		String Ergebnis = WorkingObjekt.makeString(name,frage,antwort1,antwort2,antwort3,antwort4);
		
		assertEquals("Frage und alle Antworten" , Erwartet, Ergebnis);
	
	}
	
	@Test
	public void makeStringReturnsStringNichtKorrekt() {
		Vokabelkarte WorkingObjekt = workingObjekt;
		
		String name = "TestName";
		String frage = "";
		String antwort1 = "";
		String antwort2 = "";
		String antwort3 = "TestAntwort";
		String antwort4 = "TestAntwort";
		
		String Erwartet = "TestName/TestAntwort;TestAntwort";
		
		String Ergebnis = WorkingObjekt.makeString(name,frage,antwort1,antwort2,antwort3,antwort4);
		
		assertEquals("Name und drei Antworten" , Erwartet, Ergebnis);
	}
	
	@Test
	public void makeStringReturns_Leer() {
		Vokabelkarte WorkingObjekt = workingObjekt;
		
		String name = "";
		String frage = "";
		String antwort1 = "";
		String antwort2 = "";
		String antwort3 = "";
		String antwort4 = "";
		
		String Erwartet = "";
		
		String Ergebnis = WorkingObjekt.makeString(name,frage,antwort1,antwort2,antwort3,antwort4);
		
		assertEquals("leer" , Erwartet, Ergebnis);
	}
	
	@Test
	public void makeStringReturnsStringUnvolständigKeineFrage() {
		Vokabelkarte WorkingObjekt = workingObjekt;
		
		
		String name = "TestName";
		String frage = "";
		String antwort1 = "TestAntwort";
		String antwort2 = "TestAntwort";
		String antwort3 = "TestAntwort";
		String antwort4 = "TestAntwort";
		
		String Erwartet = "TestName/TestAntwort;TestAntwort;TestAntwort;TestAntwort";
		
		String Ergebnis = WorkingObjekt.makeString(name,frage,antwort1,antwort2,antwort3,antwort4);
		
		assertEquals("Name und alle Antworten" , Erwartet, Ergebnis);
	}
}
