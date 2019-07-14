package ugsbo.com.buchhaltung;

import java.security.MessageDigest;

public class Block {

  int data;
  int kontostand;
  Block vorher;
  
  String ownHash;
  String previousHash;
  
  public Block(int Data) {
    data = Data;
    vorher = null;
    ownHash = createNewHash();
    previousHash = null;
  }

  private String createNewHash() {
    return null;
  }
}
