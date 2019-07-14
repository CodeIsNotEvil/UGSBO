package ugsbo.com.buchhaltung;

public class Blockchain {
 
  Block Workingobjekt;
  
  
  public Blockchain() {
    Workingobjekt = new Block(0);
  }


  public void add(int eingabe) {
    // TODO Auto-generated method stub
    Block newWorkingobjekt = new Block(eingabe, Workingobjekt, Workingobjekt.getHash(), Workingobjekt.getKontostand());
    
    Workingobjekt = newWorkingobjekt;
  }


  public int kontostand() {
    // TODO Auto-generated method stub
    return Workingobjekt.getKontostand();
  }
  
  public String toString() {
    
    
    return null;
  }

  
}
