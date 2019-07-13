package com.ugsbo.Crypto;

import javax.crypto.*;

public class Payload {

  String offen;
  String verschlüsselt;
  String password;
  
  public Payload() {
    offen = "";
    verschlüsselt = "";
    password = "";
  }
  
  
  public String getOffen() {
    return offen;
  }



  public String getVerschlüsselt() {
    return verschlüsselt;
  }



  public String getPassword() {
    return password;
  }



  public void setOffen(String offen) {
    this.offen = offen;
  }



  public void setVerschlüsselt(String verschlüsselt) {
    this.verschlüsselt = verschlüsselt;
  }



  public void setPassword(String password) {
    this.password = password;
  }
  
  
  
  public void verschlüsseln() {


  }

  public void entschlüsseln() {


  }

}
