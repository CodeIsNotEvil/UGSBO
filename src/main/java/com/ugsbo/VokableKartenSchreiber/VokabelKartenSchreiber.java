package com.ugsbo.VokableKartenSchreiber;

import javafx.fxml.FXML;
import javafx.scene.control.*;


class VokabelKartenSchreiber{

	@FXML
    private static TextField Text_Name, Text_Frage, Text_Antwort1, Text_Antwort2, Text_Antwort3, Text_Antwort4;
	
	
    public static void main(String[] args) { 
        
        
    }

    public static void button_absenden_pressed(){
    	Vokabelkarte temp = new Vokabelkarte();
    	
    	temp.makeString(Text_Name.getText(), Text_Frage.getText(), Text_Antwort1.getText(), Text_Antwort2.getText(), Text_Antwort3.getText(), Text_Antwort4.getText());
    	
    }
    
    /***
     * Falls die Gui nicht ganz funktioniert, hier eine Version die per Terminal gesteuert wird
     */
    
    public static void TerminalVersion() {
        VokabelnwithTerminal.start();
    }

}