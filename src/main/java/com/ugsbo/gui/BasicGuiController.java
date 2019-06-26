package com.ugsbo.gui;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class BasicGuiController {

    // Hier werden die fx:id Attribute verknuepft.
    @FXML
    private Button matrixCalc;
    @FXML
    private Button app2;
    @FXML
    private Button app3;
    @FXML
    private Button app4;

    /**
     * Konstructor is called before initialize()
     */
    public BasicGuiController() {
        // Setup of some Fields could be defined here.
    }

    /**
     * Initializes the controller class. This method is automatically called after
     * the fxml file has been loaded.
     */
    @FXML
    public void initialize() {
        matrixCalc.setOnMouseClicked((event) -> {
            MainApp.startMatrixCalcGUI();
            // System.out.println(event);
        });
        app2.setOnMouseClicked((event) -> {
            System.out.println(event);
        });
        app3.setOnMouseClicked((event) -> {
            System.out.println(event);
        });
        app4.setOnMouseClicked((event) -> {
            System.out.println(event);
        });
    }
}