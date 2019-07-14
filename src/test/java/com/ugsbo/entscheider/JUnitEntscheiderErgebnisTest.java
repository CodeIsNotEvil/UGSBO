package com.ugsbo.entscheider;

import static org.junit.Assert.*;


import org.junit.Assert;
import org.junit.Test;

public class JUnitEntscheiderErgebnisTest {

	
	//Testet den Fall Ergebnis ist zwischen 5 und 15

	@Test
	public void ergebnisZwischenFuenfUndFuenfzehn() {
		//Eingabe der Werte zu den Fragen. Das erwartete Ergebnis zwischen 5 und 15 (jeweils inklusiv)
		//deshalb muss Rückgabewert: "Naja, dann geh halt nach Hause und ruh dich aus." sein
		int alter = 21;
		int lernen = 1;
		int gelb = 1;
		int apfel = 3;
		int mot = 2;
		int harry = 1;
		int fruehstueck = 1; 
		int anzahl = 4;
		//erwarteter String
		String erwartet = "Naja, dann geh halt nach Hause und ruh dich aus.";
		//ausführen der Methode
		String b = Entscheider.ergebnis(alter, lernen, gelb, apfel, mot, harry, fruehstueck, anzahl);
		//stimmt es mit dem erwartetem überein?
		assertEquals("Anwortstring",erwartet,b);
	}
	//Testet den Fall ergebnis ist größer 15
	@Test
	public void ergebnisTest() {
		//Eingabe der Werte zu den Fragen. Das erwartete Ergebnis ist größer 5
		//deshalb muss Rückgabewert: "Jetzt wieder gehen? Dann bist du doch voellig umsonst aufgestanden. Geh einfach hin." sein
		int alter = 29;
		int lernen = 0;
		int gelb = 1;
		int apfel = 3;
		int mot = 2;
		int harry = 0;
		int fruehstueck = 1; 
		int anzahl = 2;
		//erwarteter String
		String erwartet = "Jetzt wieder gehen? Dann bist du doch voellig umsonst aufgestanden. Geh einfach hin.";
		//ausführen der Methode
		String c = Entscheider.ergebnis(alter, lernen, gelb, apfel, mot, harry, fruehstueck, anzahl);
		//Stimmt Ergebnis
		assertEquals("Anwortstring für größer 5",erwartet,c);
		
	}
	//Testet den Fall ergebnis ist kleiner 5

	@Test
	public void ergebnisKleinerFuenf() {
		//Eingabe der Werte zu den Fragen. Das erwartete Ergebnis ist kleiner 5
		//deshalb muss Rückgabewert: "Ich kann doch nicht fuer dich entscheiden, dass musst du schon selber wissen." sein
		int alter = 1;
		int lernen = 1;
		int gelb = 1;
		int apfel = 1;
		int mot = 1;
		int harry = 1;
		int fruehstueck = 1; 
		int anzahl = 1;
		//erwarteter String
		String erwartet ="Ich kann doch nicht fuer dich entscheiden, dass musst du schon selber wissen.";
		//ausführen der Methode
		String a = Entscheider.ergebnis(alter, lernen, gelb, apfel, mot, harry, fruehstueck, anzahl);
		//stimmt Ergebnis?
		assertEquals("Anwortstring für kleiner 5",erwartet,a);
		
	}
	
	
	

}
