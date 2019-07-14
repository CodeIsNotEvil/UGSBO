package com.ugsbo.FirewallOfDeath;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;

/***
 * In manchen Ländern gibt es keinen freien zugang zum Internett. Zum Glück gibt es VPN, diese haben aber die doofe Eigenschaft zusammenzubrechen.
 *	Praktischerweise sind in diesen Ländern meist alle Dienste von Google gesperrt, weswegen wir am Ping sehen können ob wir noch geschützt sind oder nicht.
 *	@author Christian
 */

public class GrundFunktion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		while (true) {
			try {
				if (NetzFunktion.pingTogoogle()) {
					System.out.println("alles gut");
					
				}else {
					System.out.println("PRÜFE SOFORT DEINEN VPN!!!");
				}
				TimeUnit.MINUTES.sleep(1);
				}
			catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
}
