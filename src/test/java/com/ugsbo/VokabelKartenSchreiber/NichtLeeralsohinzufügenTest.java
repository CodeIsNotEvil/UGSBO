package com.ugsbo.VokabelKartenSchreiber;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.ugsbo.VokableKartenSchreiber.Vokabelkarte;

public class NichtLeeralsohinzufügenTest {
	
	private Vokabelkarte workingObjekt;

	
	@Before
	public void setup() {
		workingObjekt = new Vokabelkarte();
	}

	@Test
	public void NichtAlsLeeralsoHinzufügen_TestMitAllenParametern() {
		Vokabelkarte WorkingObjekt = workingObjekt;
		
		String neuesWort = "prüfenTest";
		String wortfolgeBisher = "RückgabeTest";
		String separator = "ZwischenwertTest";
		String erwartet = 	"RückgabeTestprüfenTestZwischenwertTest";

		String ergebnis = 		WorkingObjekt.NichtLeeralsohinzufügen(neuesWort,wortfolgeBisher,separator);
		
		assertEquals("Seperator angehängt + Neues Wort", erwartet, ergebnis);
	}

	@Test
	public void NichtAlsLeeralsoHinzufügen_neuesWortIstLeer() {
		Vokabelkarte WorkingObjekt = workingObjekt;
		
		String neuesWort = "";
		String wortfolgeBisher = "RückgabeTest";
		String separator = "ZwischenwertTest";
		String erwartet = 	"RückgabeTest";

		String ergebnis = WorkingObjekt.NichtLeeralsohinzufügen(neuesWort,wortfolgeBisher,separator);
		
		assertEquals("WortFolgebisher zurückgegeben", erwartet, ergebnis);
	}

	@Test
	public void NichtAlsLeeralsoHinzufügen_wortFolgeBisher_IstLeer() {
		Vokabelkarte WorkingObjekt = workingObjekt;
		
		String neuesWort = "prüfenTest";
		String wortfolgeBisher = "";
		String separator = "ZwischenwertTest";
		String erwartet = 	"prüfenTest";

		String ergebnis = WorkingObjekt.NichtLeeralsohinzufügen(neuesWort,wortfolgeBisher,separator);
		
		assertEquals("Nur das neue Wort ohne Seperator", erwartet, ergebnis);
	}
	
	@Test
	public void NichtAlsLeeralsoHinzufügen_AllesLeer() {
		Vokabelkarte WorkingObjekt = workingObjekt;
		
		String neuesWort = "";
		String wortfolgeBisher = "";
		String separator = "";
		String erwartet = 	"";

		String ergebnis = 		WorkingObjekt.NichtLeeralsohinzufügen(neuesWort,wortfolgeBisher,separator);
		
		assertEquals("leer", erwartet, ergebnis);
	}        
}
