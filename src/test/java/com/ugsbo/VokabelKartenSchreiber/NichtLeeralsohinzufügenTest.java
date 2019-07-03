package com.ugsbo.VokabelKartenSchreiber;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ugsbo.VokableKartenSchreiber.Vokabelkarte;

public class NichtLeeralsohinzufügenTest {
	
	@Test
	public void NichtAlsLeeralsoHinzufügenTest() {
		Vokabelkarte WorkingObjekt = new Vokabelkarte();
		assertEquals("NichtLeerAlsSolcheHinzufügen funktioniert nicht", WorkingObjekt.NichtLeeralsohinzufügen("prüfenTest","RückgabeTest","ZwischenwertTest"), "RückgabeTestprüfenTestZwischenwertTest");
	}
	
	@Test
	public void NichtAlsLeeralsoHinzufügenRückgabeLeer() {
		Vokabelkarte WorkingObjekt = new Vokabelkarte();
		assertEquals("NichtLeerAlsSolcheHinzufügen funktioniert nicht", WorkingObjekt.NichtLeeralsohinzufügen("prüfenTest","","ZwischenwertTest"), "prüfenTest");
	}

	@Test
	public void NichtAlsLeeralsoHinzufügenprüfenLeer() {
		Vokabelkarte WorkingObjekt = new Vokabelkarte();
		assertEquals("NichtLeerAlsSolcheHinzufügen funktioniert nicht", WorkingObjekt.NichtLeeralsohinzufügen("","RückgabeTest","ZwischenwertTest"), "RückgabeTest");
	}
	
	@Test
	public void NichtAlsLeeralsoHinzufügenZwischenwerLeer() {
		Vokabelkarte WorkingObjekt = new Vokabelkarte();
		assertEquals("NichtLeerAlsSolcheHinzufügen funktioniert nicht", WorkingObjekt.NichtLeeralsohinzufügen("prüfenTest","","ZwischenwertTest"), "prüfenTest");
	}
	
	@Test
	public void NichtAlsLeeralsoHinzufügenAllesLeer() {
		Vokabelkarte WorkingObjekt = new Vokabelkarte();
		assertEquals("NichtLeerAlsSolcheHinzufügen funktioniert nicht", WorkingObjekt.NichtLeeralsohinzufügen("","",""), "");
	}
}
