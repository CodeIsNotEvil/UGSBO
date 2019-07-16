package com.ugsbo.notenSpeicher;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import ugsbo.com.notenSpeicher.NotenKette;

public class Test_NotenChain {

  public NotenKette Workingobjekt;
  
  @Before
  public void setUp() throws Exception {
    Workingobjekt = new NotenKette();
  }

  @Test
  public void hinzufügen() {
    String eingabeFach = "Mathe";
    int eingabeNote = 2;
    
    int erwartet = 2;
    int ergebnis;
    
    Workingobjekt.add(eingabeFach, eingabeNote);
    ergebnis = Workingobjekt.durchschnitt();
    
    assertEquals("Durchschnitt ist korrekt", erwartet, ergebnis);
  }
  
  @Test
  public void hinzufügenMehrAlsEinmal() {
    String eingabeFach = "Mathe";
    int eingabeNote = 2;
    int ergebnis;
    int erwartet = 2;
    
    Workingobjekt.add(eingabeFach, eingabeNote);
    Workingobjekt.add(eingabeFach, eingabeNote);
    Workingobjekt.add(eingabeFach, eingabeNote);
    
    ergebnis = Workingobjekt.durchschnitt();
    
    assertEquals("eingabe und Ergebnis sind gleich", erwartet, ergebnis);
  }
  
  @Test
  public void hinzufügenistNull() {
    String eingabeFach = "Mathe";
    int eingabeNote = 2;
    int eingabeNotezwei = 0;
    int ergebnis;
    int erwartet = 2;
    
    Workingobjekt.add(eingabeFach, eingabeNote);
    Workingobjekt.add(eingabeFach, eingabeNotezwei);
    
    ergebnis = Workingobjekt.durchschnitt();
    
    assertEquals("Durchscnitt hat sich nicht verändert", erwartet, ergebnis);
  }
  
}
