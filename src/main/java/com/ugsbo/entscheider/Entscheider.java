
/**
 * 
 */
package com.ugsbo.entscheider;

import java.util.Scanner;
import java.util.*;

/**
 * @author bruec
 *
 */
public class Entscheider {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Herzlich Willkommen!");
		String a = fragen();
		System.out.println(a);
		if(a != "Na dann halt nicht. Tschüssi.") {
			System.out.println("Auf Wiedersehen. Frag mich gerne nochmal wenn du mal wieder nicht weisst, ob du in die Vorlesung gehen solltest oder nicht.");
		}

	}

	public static String ergebnis(int a, int b, int c, int d, int e, int f, int g, int h) {
		int erg = (((a + b + c) * d) / (e + f + g)) - h;
		String hilfe = "";
		if (erg < 5)
			hilfe = "Ich kann doch nicht fuer dich entscheiden, dass musst du schon selber wissen.";
		if (erg >= 5 && erg < 15)
			hilfe = "Naja, dann geh halt nach Hause und ruh dich aus.";
		if (erg >= 15)
			hilfe = "Jetzt wieder gehen? Dann bist du doch voellig umsonst aufgestanden. Geh einfach hin.";

		return hilfe;
	}

	public static String fragen() {
		// Eingangsfrage
		System.out.println(
				"Du willst also wissen ob du in die Veranstaltung gehen sollst oder nicht? Gib 1 für Ja ein 0 für Nein.");
		int a = getAnInteger();
		if (a == 1 || a == 0) {
			if (a == 1) {
				System.out.println("Dann werde ich dir jetzt ein paar Fragen stellen");
			} else {
				return("Na dann halt nicht. Tschüssi.");
			}

		} else {
			a = pruefen(a);
			if (a == 1) {
				System.out.println("Dann werde ich dir jetzt ein paar Fragen stellen");
			} else {
				return ("Na dann halt nicht. Tschüssi.") ;
			}

		}
		// zweite Frage
		System.out.println("Wie alt bist du?");
		int alter = getAnInteger();
		if (alter > 0) {
			System.out.println(alter);
		} else {
			while (alter <= 0) {
				System.out.println("Versuches es nochmal. Du musst mindestens 1 sein.");
				alter = getAnInteger();
			}
		}

		// dritte Frage
		System.out.println("Auf einer Skala von 1 bis 10 wie motiviert bist du?");
		int mot = getAnInteger();
		if (mot >= 1 && mot <= 10) {
			System.out.println(mot);
		} else {
			mot = skalaTest(mot);
			System.out.println(mot);
		}

		// vierte Frage
		System.out.println("Hast du gefrühstückt? Bei Ja bitte 1 und bei Nein bitte 0");
		int fruehstueck = getAnInteger();
		if (fruehstueck == 1 || fruehstueck == 0) {
			System.out.println(fruehstueck);
		} else {
			fruehstueck = pruefen(fruehstueck);
			System.out.println(fruehstueck);
		}

		// fuenfte Frage
		System.out.println("Hast du jemals ein Harry Potterbuch gelesen? Bei Ja bitte 1 und bei Nein bitte 0");
		int harry = getAnInteger();
		if (harry == 1 || harry == 0) {
			System.out.println(harry);
		} else {
			harry = pruefen(harry);
			System.out.println(harry);
		}

		// sechste Frage
		System.out.println("Wie viele Äpfel hast du heute schon gegessen?");
		int apfel = getAnInteger();
		if (apfel > 0) {
			System.out.println(apfel);
		} else {
			while (apfel <= 0) {
				System.out.println("Versuches es nochmal. Die Zahl muss positiv sein.");
				apfel = getAnInteger();
			}
		}

		// siebte Frage
		System.out.println("Wie viele Veranstaltungen hattest du heute schon?");
		int anzahl = getAnInteger();
		if (anzahl > 0) {
			System.out.println(anzahl);
		} else {
			while (anzahl <= 0) {
				System.out.println("Versuches es nochmal. Die Zahl muss positiv sein.");
				anzahl = getAnInteger();
			}
		}

		// achte Frage
		System.out.println("Was würdest du statt der Vorlesung machen? Lernen? Bei Ja bitte 1 und bei Nein bitte 0");
		int lernen = getAnInteger();
		if (lernen == 1 || lernen == 0) {
			System.out.println(lernen);
		} else {
			lernen = pruefen(lernen);
			System.out.println(lernen);
		}
		if (lernen == 1)
			System.out.println("Wenn du das sagst, aber lueg dich doch bitte nicht selbst an.");

		// neunte Frage
		System.out.println("Wuerdest du dir ein gelbes Auto kaufen? Bei Ja bitte 1 und bei Nein bitte 0");
		int gelb = getAnInteger();
		if (gelb == 1 || gelb == 0) {
			System.out.println(gelb);
		} else {
			gelb = pruefen(gelb);
			System.out.println(gelb);
		}

		// Auswertung

		String antwort = ergebnis(alter, lernen, gelb, apfel, mot, harry, fruehstueck, anzahl);
		return antwort;

	}

	public static int skalaTest(int answer) {
		System.out.println("Try again. Nur Werte zwischen 1 und 10 sind erlaubt.");
		int b = getAnInteger();
		if (b >= 1 && b <= 10) {
			return b;
		}
		skalaTest(b);
		return -1;
	}

	public static int getAnInteger() {
		Scanner in = new Scanner(System.in);
		while (true) {
			try {
				return in.nextInt();
			} catch (InputMismatchException e) {
				in.next();
				System.out.println("Das ist kein Integer. Try again.");
			}
		}
	}

	public static int pruefen(int answer) {
		System.out.println("Try again. Nur 1 und 0 sind erlaubt.");
		int b = getAnInteger();
		if (b == 1 || b == 0) {
			return b;
		}
		pruefen(b);
		return 1;
	}

}
