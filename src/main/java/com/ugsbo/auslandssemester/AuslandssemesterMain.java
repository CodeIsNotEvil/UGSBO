package com.ugsbo.auslandssemester;

import java.util.Scanner;

public class AuslandssemesterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Bitte gebe deinen Nachnamen ein.");
		String name = in.nextLine();
		System.out.println("Bitte gebe deinen Vornamen ein.");
		String vorname = in.nextLine();

		System.out
				.println("Bitte schreibe auf ob du nach Europa, Australien, Neuseeland, Asien oder in die USA gehst.");
		String destination = in.nextLine();
		if (!(destination.equals("Europa")) && !(destination.equals("Australien")) && !(destination.equals("Neuseeland")) && !(destination.equals("Asien")) && !(destination.equals("USA")) ) {
			System.out.println("Plaese Start Again. falsche Eingabe.");
		} else {
			System.out.println("Sage mir bitte in wie vielen Monaten du ins Ausland moechtest?");
			int inMonaten = in.nextInt();
			System.out.println("Danke");
			Sitzung g = new Sitzung(name, vorname, inMonaten, destination);

			System.out.println("Tipp 1:");
			System.out.println(g.deadline(g.kategorieInMonaten(), g.kategorieDestination()));

			System.out.println("Tipp 2:");
			System.out.println(g.finanzierung(g.kategorieInMonaten(), g.kategorieDestination()));

			System.out.println("Tipp 3:");
			System.out.println(g.wohnen(g.kategorieInMonaten()));

			System.out.println("Tipp 3:");
			System.out.println(g.packen(g.kategorieInMonaten()));

			System.out.println("Tipp 4:");
			System.out.println(g.learningAgreement(g.kategorieInMonaten()));

		}
	}
}
