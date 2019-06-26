package com.ugsbo.matrixcalc;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;

public class MatrixCalcController {

    // Hier werden die fx:id Attribute verknuepft.
    @FXML
    private Button multiplyButton, addButton, swapInputButton, substractButton, transposeButton;
    @FXML
    private Text errorText, outputText;
    @FXML
    private TextArea matrixATextArea, matrixBTextArea;

    /**
     * Konstructor is called before initialize()
     */
    public MatrixCalcController() {
        // Setup of some Fields could be defined here.
    }

    /**
     * Initializes the controller class. This method is automatically called after
     * the fxml file has been loaded.
     */
    @FXML
    public void initialize() {
        multiplyButton.setOnMouseClicked((event) -> {
            // TODO matrixATextArea and matrixBTextArea need to be parsed to Double[][] do
            // this in an extern Methode maybe an extern class.
            // MatrixCalcMath math = new MatrixCalcMath();
            // math.matrixMultiplication(matrixATextArea, matrixATextArea);
            System.out.println(event);
        });
    }

}