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
	// tipps

	// tipp zum learning Agreement

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

	public String packen(int kategorieZeit) {
		String tipp = "kein Tipp.";
		if (kategorieZeit == 4 || kategorieZeit == 3) {
			tipp = "Kein Stress. DU hast noch eine Ewigkeit Zeit zum packen.";
		}

		if (kategorieZeit == 2) {
			tipp = "Wenn du magst kannst schonmal anfangen eine Liste zu schreiben.";
		}
		if (kategorieZeit == 1) {
			tipp = "Jetzt solltest du definitiv eine Liste schreiben und so langsam mal anfangen.";
		}
		return tipp;

	}

	// neuer Tipp zum Wohnen
	public String wohnen(int kategorieZeit) {
		String tipp = "kein Tipp.";
		if (kategorieZeit == 4) {
			tipp = "Schau dich am besten schon mal nach Wohnungen um. Manchmal gibt es Webseiten auf denen man über die Zeit Punkte sammelt.";
		}

		if (kategorieZeit == 3) {
			tipp = "Jetzt informier dich definitiv schon mal wie es mit Wohnen ist. Manchmal gibt es Webseiten auf denen man über die Zeit Punkte sammelt.";
		}

		if (kategorieZeit == 2) {
			tipp = "Jetzt wird es höchste Zeit nach einer Wohung zu schauen.";
		}
		if (kategorieZeit == 1) {
			tipp = "Jetzt ist es schon fast zu spät um nach einer Wohnung zu suchen";
		}
		return tipp;

	}

}
