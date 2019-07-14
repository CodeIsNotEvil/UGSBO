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
	
	public int kategorieInMonaten() {
		int kategorie = 4; // alles was größer als 12 Monate ist

		
		if (inMonaten <= 2) {
			kategorie = 1;
		}
		if (inMonaten > 2 && inMonaten <= 5) {
			kategorie = 2;
		}
		if (inMonaten > 5 && inMonaten <= 12) {
			kategorie = 3;
		}

		return kategorie;
	}

}
