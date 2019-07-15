package com.ugsbo.matrixcalc;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

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
        /**
         * Convert Strings to matricies, multiply them and output the result. 
         */
        multiplyButton.setOnMouseClicked((event) -> {
            String stringMatrixA = matrixATextArea.getText();
            String stringMatrixB = matrixBTextArea.getText();
            if (checkInput(stringMatrixA) && checkInput(stringMatrixB)) {
                MatrixCalcMath math = new MatrixCalcMath();

                double[][] matrixA = math.stringToMatrix(stringMatrixA);
                double[][] matrixB = math.stringToMatrix(stringMatrixB);
                double[][] result = math.matrixMultiplication(matrixA, matrixB);

                outputMatrixToOutputText(result);
            }
            // System.out.println(matrixATextArea.getText());
        });
    }
    /**
     * Prints a given 2D-Array to the output text Field.
     * @param output2DArray The Array that gets Displayed
     */
    private void outputMatrixToOutputText(double[][] output2DArray) {
        //convert array to String
        String DisplayableString = convertsArrayToStringInOrderToDisplayIt(output2DArray);
        // Display output
        outputText.setText(DisplayableString);
        outputText.setTextAlignment(TextAlignment.CENTER);
    }
    /**
     * Converts Array to String in oder to Display it.
     * @param array2D the array wich will be converted to an Displayable String
     * @return The Displayable String
     */
    private String convertsArrayToStringInOrderToDisplayIt(double[][] array2D) {
        String displayableString = "";
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[0].length; j++) {
                displayableString += array2D[i][j] + "   ";
                // System.out.println(result[i][j]);
            }
            displayableString += "\n\n";
        }
        return displayableString;
    }

    /**
     * Chcks if the Input is Valid, with Regex. Returns true if the Matrix can be
     * matched by the regular Expression.
     * 
     * @param matrix It is the InputMatrix
     * @return true if the Matrix is valid Input.
     */
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