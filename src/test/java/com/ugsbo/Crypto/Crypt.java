/**
 * 
 */
package com.ugsbo.Crypto;

import com.ugsbo.Crypto.*;
import static org.junit.Assert.*;
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
    
    workingobjekt.setOffen(eingabe);
    workingobjekt.verschlüsseln();
    workingobjekt.getVerschlüsselt();
  }
  
  @Test
  public void verUndEntschlüsseln() {
    
    String eingabe = "TestText";
    String ergebnis;
    
    workingobjekt.setOffen(eingabe);
    workingobjekt.verschlüsseln();
    workingobjekt.entschlüsseln();
    ergebnis = workingobjekt.getOffen();
    
    assertEquals("das entschlüsselte Test Wort",ergebnis,eingabe);   
  }

}
