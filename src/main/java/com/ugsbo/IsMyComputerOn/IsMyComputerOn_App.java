package com.ugsbo.IsMyComputerOn;

import java.util.concurrent.TimeUnit;

public class IsMyComputerOn_App {

	public static void main(String[] args) {
		while (true) {
			System.out.print("Dein Rechner ist: ");
			System.out.println((IstErAn()?"AN":"AUS"));
			try {
				TimeUnit.MINUTES.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/***
	 * 
	 * @return true 	Da wir davon ausgehen, dass das Program nur ausgeführt werden kann wenn der Rechner läuft, geben wir immer true zurück. 
	 */

 	public static boolean IstErAn() {
	// TODO Auto-generated method stub
	return true;
	}

}
