
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
		System.out.println(pruefen(2));

	}
	
	public static String ergebnis(int a, int b, int c, int d, int e, int f, int g, int h) {
		return "";
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
