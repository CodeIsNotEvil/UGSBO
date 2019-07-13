package com.ugsbo.Crypto;

import static org.junit.Assert.*;
import java.security.GeneralSecurityException;
import com.ugsbo.Crypto.*;
import org.junit.Before;
import org.junit.Test;

public class DeCrypt {

  private Payload workingobjekt;
  
  @Before
  public void setUp() throws Exception {
    workingobjekt = new Payload();
  }

  @Test
  public void verschlüsseltIstAnders() {
    
    String eingabe = "TestText"; 
    String password = "Test";
    String ergebnis;
    
    workingobjekt.setVerschlüsselt(eingabe);
    workingobjekt.entschlüsseln();
    ergebnis = workingobjekt.getOffen();
    
    assertNotEquals("unterschidliche Texte",eingabe,ergebnis);
  }
  
  @Test
  public void entUndVerschlüsseln() {
    
    String password = "Test";
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
