package com.ugsbo.Buchhaltung;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import ugsbo.com.buchhaltung.Blockchain;

public class Test_Blockchain {

  public Blockchain Workingobjekt;
  
  @Before
  public void setUp() throws Exception {
    Workingobjekt = new Blockchain();
  }

  @Test
  public void hinzufügen() {
    int eingabe = 500;
    int ergebnis;
    
    Workingobjekt.add(eingabe);
    ergebnis = Workingobjekt.kontostand();
    
    assertEquals("eingabe und Ergebnis sind gleich", eingabe, ergebnis);
  }
  
  @Test
  public void hinzufügenNegativ() {
    int eingabe = -500;
    int ergebnis;
    
    Workingobjekt.add(eingabe);
    ergebnis = Workingobjekt.kontostand();
    
    assertEquals("eingabe und Ergebnis sind gleich", eingabe, ergebnis);
  }

  @Test
  public void hinzufügenIstNull() {
    int eingabe = 0;
    int ergebnis;
    
    Workingobjekt.add(eingabe);
    ergebnis = Workingobjekt.kontostand();
    
    assertEquals("eingabe und Ergebnis sind gleich", eingabe, ergebnis);
  }
}
