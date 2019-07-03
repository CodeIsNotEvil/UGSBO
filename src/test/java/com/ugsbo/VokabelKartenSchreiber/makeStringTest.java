package com.ugsbo.VokabelKartenSchreiber;

import static org.junit.Assert.*;

import org.junit.*;

import com.ugsbo.VokableKartenSchreiber.Vokabelkarte;

public class makeStringTest {
	
	@Test
	public void makeStringReturnsStringKorrekt() {
		Vokabelkarte WorkingObjekt = new Vokabelkarte();
		
		String Ergebnis = "TestName/TestFrage/TestAntwort;TestAntwort;TestAntwort;TestAntwort";
		String Abfrage = WorkingObjekt.makeString("TestName","TestFrage","TestAntwort","TestAntwort","TestAntwort","TestAntwort");
		
		//assertTrue(Ergebnis.equals(Abfrage));
		assertEquals("zurückgeworfener String ist nicht korrekt " ,Abfrage, Ergebnis);
	}
	
	public void makeStringReturnsStringKorrektohneName() {
		Vokabelkarte WorkingObjekt = new Vokabelkarte();
		
		String Ergebnis = "TestFrage/TestAntwort;TestAntwort;TestAntwort;TestAntwort";
		String Abfrage = WorkingObjekt.makeString("","TestFrage","TestAntwort","TestAntwort","TestAntwort","TestAntwort");
		
		//assertTrue(Ergebnis.equals(Abfrage));
		assertEquals("zurückgeworfener String ist nicht korrekt " ,Abfrage, Ergebnis);
	}
	
	@Test
	public void makeStringReturnsStringNichtKorrekt() {
		Vokabelkarte WorkingObjekt = new Vokabelkarte();
		
		
		String Ergebnis = "TestName/TestAntwort;TestAntwort;TestAntwort";
		String Abfrage = WorkingObjekt.makeString("TestName","","","","TestAntwort","TestAntwort");
		
		//assertTrue(Ergebnis.equals(Abfrage));
		assertEquals("zurückgeworfener String ist nicht korrekt " ,Abfrage, Ergebnis);
	}
	
	@Test
	public void makeStringReturnsStringLeer() {
		Vokabelkarte WorkingObjekt = new Vokabelkarte();
		
		
		String Ergebnis = "";
		String Abfrage = WorkingObjekt.makeString("","","","","","");
		
		//assertTrue(Ergebnis.equals(Abfrage));
		assertEquals("zurückgeworfener String ist nicht korrekt " ,Abfrage, Ergebnis);
	}
	
	@Test
	public void makeStringReturnsStringUnvolständigKeineFrage() {
		Vokabelkarte WorkingObjekt = new Vokabelkarte();
		
		
		String Ergebnis = "TestName/TestAntwort;TestAntwort;TestAntwort;TestAntwort";
		String Abfrage = WorkingObjekt.makeString("TestName","","TestAntwort","TestAntwort","TestAntwort","TestAntwort");
		
		//assertTrue(Ergebnis.equals(Abfrage));
		assertEquals("zurückgeworfener String ist nicht korrekt " ,Abfrage, Ergebnis);
	}
}
