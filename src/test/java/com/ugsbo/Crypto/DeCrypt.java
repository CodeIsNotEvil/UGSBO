package com.ugsbo.Crypto;

import static org.junit.Assert.*;

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
    
    workingobjekt.setVerschlüsselt(eingabe);
    workingobjekt.entschlüsseln();
    workingobjekt.getOffen();
  }
  
  @Test
  public void entUndVerschlüsseln() {
    
    String eingabe = "TestText";
    String ergebnis;
    
    workingobjekt.setOffen(eingabe);
    workingobjekt.verschlüsseln();
    workingobjekt.entschlüsseln();
    ergebnis = workingobjekt.getOffen();
    
    assertEquals("das entschlüsselte Test Wort",ergebnis,eingabe);   
  }

}
