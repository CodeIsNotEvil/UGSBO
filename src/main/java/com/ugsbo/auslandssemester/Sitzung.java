package com.ugsbo.auslandssemester;

public class Sitzung {
	private String name;
	private String vorname;
	private int inMonaten;
	private String destination;


	// Konstruktor mit Übergabewerten
	public Sitzung(String nachname, String vor, int monate, String ziel) {
		this.name = nachname;
		this.vorname = vor;
		this.inMonaten = monate;
		this.destination = ziel;
	}
	
	public String kategorieDestination() {
		String kategorie = "Europa";
		if (destination == "Australien" || destination == "Neuseeland" || destination == "Asien") {
			kategorie = "Asien";
		}
		if (destination == "USA") {
			kategorie = "USA";
		}
		return kategorie;
	}

}
