
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
		

	}
	
	public static String ergebnis(int a, int b, int c, int d, int e, int f, int g, int h) {
		return "";
	}
	
	public static String fragen() {
		return "";
	}
	
	public static int skalaTest(int answer){
		return 0;
	}
	
	public static int getAnInteger() {
		Scanner in = new Scanner(System.in);
		while (true){
			try{
				return getAnInteger();
			}
			catch (InputMismatchException e){
				getAnInteger();
				System.out.print("Das ist kein Integer. Try again.");
			}
		}
		
	}
	
	public static int pruefen(int answer) {
		return 0;
	}

}
