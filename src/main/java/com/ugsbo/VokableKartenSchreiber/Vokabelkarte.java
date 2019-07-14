package com.ugsbo.VokableKartenSchreiber;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Vokabelkarte{
	String Name;
	String Frage;
	String Antwort1;
	String Antwort2;
	String Antwort3;
	String Antwort4;
	
	String Ergebnis;
	
    Scanner sc;
    BufferedWriter bw;
    
    
    
	/**
	 * @param sc
	 * @param bw
	 */
	public Vokabelkarte() {
		this.sc =  new Scanner(System.in);
		
		try {
            this.bw = new BufferedWriter(new FileWriter("Data.txt", true));
        } catch (Exception e) {
            System.out.println("ne, wir nichts");
        }
	}
	
    /***
     * 
     * @param Zwischenwert		fügt ein Zwischenstück zwischen den beiden Strings ein
     * @param neuesWort	Der zu prüfende String
     * @param bisherigerString	Der String an den angehängt werden soll
     * @return	Der fertige String
     */
	
	
	//-------------------------------------------------
	//Private
    public String NichtLeeralsohinzufügen(String bisherigerString, String neuesWort, String Zwischenwert) {    	
    	if (!neuesWort.equals("")) {
			neuesWort += Zwischenwert;
		}
    	bisherigerString += neuesWort;
    	return bisherigerString;
    }
    
	//-------------------------------------------------
    //Public
    
    /***
     * Schreibt den Ergebnis String in eine Datei
     */
    public void schreiben() {
    	String Text = this.Ergebnis;
        System.out.println(Text);
        try {
            bw.write(Text);
            bw.write("\n");
            bw.flush();
        } catch (Exception e) {
            System.out.println("AHHHHHHHHH");
        }
        
    }
    
    /***
     * Erstellt aus den Eingetragenen Feldern den endgüligen String im gültigen Format
     * Muster: Name/Frage/Antwort;Antwort
     * @return gibt den formatierten String zurück
     */
    public String makeString(String Name,String Frage,String Antwort1,String Antwort2,String Antwort3,String Antwort4) {
    	String Ergebnis = "";
    	Ergebnis = NichtLeeralsohinzufügen(Ergebnis, Name, "/");
    	Ergebnis = NichtLeeralsohinzufügen(Ergebnis, Frage, "/");
    	Ergebnis = NichtLeeralsohinzufügen(Ergebnis, Antwort1, ";");
    	Ergebnis = NichtLeeralsohinzufügen(Ergebnis, Antwort2, ";");
    	Ergebnis = NichtLeeralsohinzufügen(Ergebnis, Antwort3, ";");
    	Ergebnis = NichtLeeralsohinzufügen(Ergebnis, Antwort4, "");
    	this.Ergebnis = Ergebnis;
    	return Ergebnis;
    }
    
}