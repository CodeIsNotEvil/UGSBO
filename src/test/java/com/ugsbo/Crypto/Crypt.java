/**
 * 
 */
package com.ugsbo.Crypto;

import com.ugsbo.Crypto.*;
import static org.junit.Assert.*;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import org.junit.Before;
import org.junit.Test;

public class Crypt {

  
  private Payload workingobjekt;
  
  @Before
  public void setUp() throws Exception {
    workingobjekt = new Payload();
  }

  @Test
  public void offenIstAnders() {
    
    String eingabe = "TestText"; 
    String ergebnis;
    
    workingobjekt.setOffen(eingabe);
    try {
      workingobjekt.verschlüsseln();
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    } catch (GeneralSecurityException e) {
      e.printStackTrace();
    }
    
    ergebnis = workingobjekt.getVerschlüsselt();
    
    assertNotEquals("unterschidliche Texte",eingabe,ergebnis);
  }
  
  @Test
  public void verUndEntschlüsseln() {
    
    String eingabe = "TestText";
    String ergebnis;
    
    workingobjekt.setOffen(eingabe);
    try {
      workingobjekt.verschlüsseln();
    } catch (GeneralSecurityException e) {
      e.printStackTrace();
    }
    workingobjekt.entschlüsseln();
    ergebnis = workingobjekt.getOffen();
    
    assertEquals("das entschlüsselte Test Wort",ergebnis,eingabe);   
  }

}
