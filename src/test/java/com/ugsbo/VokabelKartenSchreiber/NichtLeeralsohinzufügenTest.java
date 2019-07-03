package com.ugsbo.VokabelKartenSchreiber;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ugsbo.VokableKartenSchreiber.Vokabelkarte;

public class NichtLeeralsohinzufügenTest {
	
	@Test
	public void NichtAlsLeeralsoHinzufügenTest() {
		Vokabelkarte WorkingObjekt = new Vokabelkarte();
		
		String Ergebnis = 	"RückgabeTestprüfenTestZwischenwertTest";
		String Test = 		WorkingObjekt.NichtLeeralsohinzufügen("prüfenTest","RückgabeTest","ZwischenwertTest");
		
		assertEquals("NichtLeerAlsSolcheHinzufügen funktioniert nicht", Ergebnis, Test);
	}
	
	@Test
	public void NichtAlsLeeralsoHinzufügenRückgabeLeer() {
		Vokabelkarte WorkingObjekt = new Vokabelkarte();
		
		String Ergebnis = 	"RückgabeTestprüfenTestZwischenwertTest";
		String Test = 		WorkingObjekt.NichtLeeralsohinzufügen("prüfenTest","RückgabeTest","ZwischenwertTest");
		
		assertEquals("NichtLeerAlsSolcheHinzufügen funktioniert nicht", Ergebnis, Test);
		assertEquals("NichtLeerAlsSolcheHinzufügen funktioniert nicht", WorkingObjekt.NichtLeeralsohinzufügen("prüfenTest","","ZwischenwertTest"), "prüfenTest");
	}

	@Test
	public void NichtAlsLeeralsoHinzufügenprüfenLeer() {
		Vokabelkarte WorkingObjekt = new Vokabelkarte();
		
		String Ergebnis = 	"RückgabeTest";
		String Test = 		WorkingObjekt.NichtLeeralsohinzufügen("","RückgabeTest","ZwischenwertTest");
		
		assertEquals("NichtLeerAlsSolcheHinzufügen funktioniert nicht", Ergebnis, Test);
	}
	
	@Test
	public void NichtAlsLeeralsoHinzufügenZwischenwerLeer() {
		Vokabelkarte WorkingObjekt = new Vokabelkarte();
		
		String Ergebnis = 	"prüfenTest";
		String Test = 		WorkingObjekt.NichtLeeralsohinzufügen("prüfenTest","","ZwischenwertTest");
		
		assertEquals("NichtLeerAlsSolcheHinzufügen funktioniert nicht", Ergebnis, Test);
	}
	
	@Test
	public void NichtAlsLeeralsoHinzufügenAllesLeer() {
		Vokabelkarte WorkingObjekt = new Vokabelkarte();
		
		String Ergebnis = 	"";
		String Test = 		WorkingObjekt.NichtLeeralsohinzufügen("","","");
		
		assertEquals("NichtLeerAlsSolcheHinzufügen funktioniert nicht", Ergebnis, Test);
	}
}
