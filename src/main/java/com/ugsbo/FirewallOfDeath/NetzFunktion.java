package com.ugsbo.FirewallOfDeath;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;

class NetzFunktion {

	/***
	 * sendet einen Ping an google
	 * @return	boolean 	können wir google erreichen oder nicht?
	 * @throws IOException
	 * @throws UnknownHostException
	 */
	
	public static boolean pingTogoogle() throws IOException,UnknownHostException {
		//Googel IP adresse
		try {
		URL url = new URL("http://www.google.com");

        //open a connection to that source
        HttpURLConnection urlConnect = (HttpURLConnection)url.openConnection();

        
        //Gibt es keine Verbindung schlägt diese Zeile fehl.
        @SuppressWarnings("unused")
		Object objData = urlConnect.getContent();
        
        }catch (Exception e) {              
            e.printStackTrace();
            return false;
        }
        return true;	
        
	}

	

}
