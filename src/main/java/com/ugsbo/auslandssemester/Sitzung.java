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
	// tips

	public String learningAgreement(int kategorieZeit) {
		String tipp = "kein Tipp.";
		if (kategorieZeit == 4 || kategorieZeit == 3) {
			tipp = "Jetzt musst du dich noch nicht über das Learning Agreement informieren.";
		}

		if (kategorieZeit == 2) {
			tipp = "Jetzt solltest du dich über das Learning Agreement informieren. Was musst du wissen? Wer muss es unterzeichnen? Wo musst du es abgeben?";
		}
		if (kategorieZeit == 1) {
			tipp = "Wenn du jetzt noch kein Learning Agreement hast ist das seltsam. Frag so schnell es geht mal jemanden ob du eins brauchst.";
		}
		return tipp;

	}

}
