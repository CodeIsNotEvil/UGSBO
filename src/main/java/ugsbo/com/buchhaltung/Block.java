package ugsbo.com.buchhaltung;

public class Block {

  int data;
  int kontostand;
  Block vorher;
  
  
  public Block(int Data) {
    data = Data;
    vorher = null;
  }
}
