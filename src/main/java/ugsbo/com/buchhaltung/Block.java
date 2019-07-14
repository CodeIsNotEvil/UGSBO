package ugsbo.com.buchhaltung;

import java.security.MessageDigest;

public class Block {


  int data;
  int kontostand;
  Block vorher;
  
  String ownHash;
  String previousHash;
  
  public Block(int data, Block vorher, String previousHash, int konto) {
    this.data = data;
    ownHash = createNewHash();
    
    kontostand = konto + this.data;
    
    this.vorher = vorher;
    this.previousHash = previousHash;
  }
  
  public Block(int data) {
    this.data = data;
    ownHash = createNewHash();
    
    kontostand = this.data;
    
    this.vorher = null;
    this.previousHash = null;
  }

  private String createNewHash() {
    return null;
  }
  
  public int getKontostand() {
    return kontostand;
  }
  
  public Block getVorher() {
    return vorher;
  }
  
  public String getHash() {
    return ownHash;
  }
}
