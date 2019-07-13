
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
		System.out.println(ergebnis(21,1,1,3,2,1,1,4));
		System.out.println("test");

	}
	
	public static String ergebnis(int a, int b, int c, int d, int e, int f, int g, int h) {
		int erg = (((a + b + c) * d ) /(e + f + g)) - h;
		String hilfe = "";
		if(erg < 5)  hilfe = "Ich kann doch nicht fuer dich entscheiden, dass musst du schon selber wissen.";
		if(erg >= 5 && erg < 15) hilfe = "Naja, dann geh halt nach Hause und ruh dich aus.";
		
		return hilfe;
	}
	
	public static String fragen() {
		return "";
	}
	
	public static int skalaTest(int answer){
		System.out.println("Try again. Nur Werte zwischen 1 und 10 sind erlaubt.");
		int b = getAnInteger();
		if(b >= 1 && b <= 10) {
			return b;
		}
		skalaTest(b);
		return -1;
	}
	
	public static int getAnInteger() {
		Scanner in = new Scanner(System.in);
		while (true){
			try{
				return in.nextInt();
			}
			catch (InputMismatchException e){
				in.next();
				System.out.println("Das ist kein Integer. Try again.");
			}
		}
	}
	
	
	public static int pruefen(int answer) {
		System.out.println("Try again. Nur 1 und 0 sind erlaubt.");
		int b = getAnInteger();
		if(b == 1 || b == 0) {
			return b;
		}
		pruefen(b);
		return 1;
	}

}
