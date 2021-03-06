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

	// neuer Tipp zu den Deadlines

	public String deadline(int kategorieZeit, String kategorieZiel) {
		String tipp = "kein Tipp";
		if (kategorieZiel == "USA" || kategorieZiel == "Asien") {
			if (kategorieZeit == 4) {
				tipp = "Zu diesem Zeitraum ist es sinnvoll sich über die entsprechenden Deadlines zu informieren.";
			}

			if (kategorieZeit == 3) {
				tipp = "Jetzt solltest du dich auf jeden Fall über die Deadlines informieren.";
			}

			if (kategorieZeit == 2) {
				tipp = "Die Bewerbungsdeadlines sind hier wahrscheinlich schon durch. Stipendien könnten aber noch gehen";
			}
			if (kategorieZeit == 1) {
				tipp = "Es tut mir Leid, aber du bist zu spät dran. Alle Deadlines sind durch.";
			}

		} else {
			if (kategorieZeit == 4) {
				tipp = "Zu diesem Zeitpunkt musst du dich noch nicht um Deadlines sorgen. Mal schauen schadet aber nicht.";
			}

			if (kategorieZeit == 3) {
				tipp = "Jetzt wäre es wichtig sich über Deadlines zu informieren.";
			}

			if (kategorieZeit == 2) {
				tipp = "Jetzt aber wirklich zügig. Die Deadlines sind bestimmt noch nicht ganz abgelaufen.";
			}
			if (kategorieZeit == 1) {
				tipp = "Es tut mir Leid, aber du bist zu spät dran. Alle Deadlines sind durch.";
			}
		}
		return tipp;

	}
	
	//neuer Tipp zur Finanzierung 
	
	public String finanzierung(int kategorieZeit, String kategorieZiel) {
		String tipp = "kein Tipp";
		if(kategorieZiel == "USA" || kategorieZiel == "Asien") {
			if(kategorieZeit == 4) {
				tipp = "Finanzierung ist keine leichte Sache, darüber kann man sich nie zu früh Gedanken machen. Stichwort: Stipendium.";
			}
			
			if(kategorieZeit == 3) {
				tipp = "Jetzt musst du auf jeden Fall überlegen wie du das finanziern willst. Sprich vielleicht mal mit deinen Eltern oder such nach Stipendien";
			}
			
			if(kategorieZeit == 2) {
				tipp = "Wenn du dich noch nicht um die Finanzierung gekümmert hast, dann musst du dich jetzt aber ran halten.";
			}
			if(kategorieZeit == 1) {
				tipp = "Selbst wenn du bisher noch gar nicht an die Finanzierung gedacht hast solltest du es jetzt tun. Besser spät als nie.";
			}
			
		} else {
			if(kategorieZeit == 4) {
				tipp = "Über die Finanzierung kann man sich nie zu früh Gedanken machen. Aber bitte keine Hektik.";
			}
			
			if(kategorieZeit == 3) {
				tipp = "Denk am besten schon mal ein bisschen an die Finanzierung. Frag an ob Erasmus für dich in Frage kommt.";
			}
			
			if(kategorieZeit == 2) {
				tipp = "Wenn du dich auf Ersamus beworben hast dann solltest du demnächst deine Rückmeldung bekommen.";
			}
			if(kategorieZeit == 1) {
				tipp = "Wenn du ein Erasmus+ STipendium bekommst, dann wirst du noch einen Englischtest absolvieren und einen Vertrag unterschreiben müssen. Denk auch an deine Immatrikulationsbescheingung.";
			}
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
