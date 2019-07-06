package com.ugsbo.matrixcalc;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
            String matrixA = matrixATextArea.getText();
            String matrixB = matrixBTextArea.getText();
            if (checkInput(matrixA)) {
                // TODO matrixATextArea and matrixBTextArea need to be parsed to double[][] do
                // this in an extern Methode maybe an extern class.
                // MatrixCalcMath math = new MatrixCalcMath();
                // math.matrixMultiplication(matrixATextArea, matrixATextArea);
            }
            // System.out.println(matrixATextArea.getText());
        });
    }

    public boolean checkInput(String matrix) {
        boolean isMatched = false;
        if (matrix.length() == 0) {
            throw new IllegalArgumentException("Please insert a Matrix");
        }

        // Matches digits witch following spaces 1 to 3 times
        String row1 = "(\\d*\\u0020*){1,3}";
        // Matches newlineCurrierReturn followed by digits witch following spaces 1 to
        // 3times
        String row2 = "(\\n){0,3}(\\d*\\u0020*){0,3}";
        String row3 = "(\\n){0,3}(\\d*\\u0020*){0,3}";

        // TODO get the input check more stricktly missing matrix slots are allowed.

        Pattern p = Pattern.compile(row1 + row2 + row3);
        Matcher m = p.matcher(matrix);

        isMatched = m.matches();

        // System.out.println(isMatched);
        return isMatched;
    }

}