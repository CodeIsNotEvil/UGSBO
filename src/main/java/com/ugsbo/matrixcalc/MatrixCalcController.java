package com.ugsbo.matrixcalc;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class MatrixCalcController {

    // Hier werden die fx:id Attribute verknuepft.
    @FXML
    private Button multiplyButton, addButton, DetAButton, DetBButton, substractButton, transposeButton;
    @FXML
    private Text errorText, outputText;
    @FXML
    private TextArea matrixATextArea, matrixBTextArea;

    private MatrixCalcMath math = new MatrixCalcMath();
    private MatrixCalcIOUtils util = new MatrixCalcIOUtils();

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
            String[] stringMatrix = { stringMatrixA, stringMatrixB };

            checkInputAndDisplayIfInputIsNotValid(stringMatrix, 2);

            double[][] matrixA = util.stringToMatrix(stringMatrixA);
            double[][] matrixB = util.stringToMatrix(stringMatrixB);

            try {
                double[][] result = math.matrixMultiplication(matrixA, matrixB);

                String DisplayableString = util.outputMatrixToOutputText(result);
    
                outputText.setText(DisplayableString);
                outputText.setTextAlignment(TextAlignment.CENTER);
            } catch (IllegalArgumentException e) {
                
                outputText.setText(e.getMessage());
                outputText.setTextAlignment(TextAlignment.CENTER);
            }
        });

        transposeButton.setOnMouseClicked((event) -> {
            String stringMatrixA = matrixATextArea.getText();
            String[] stringMatrix = { stringMatrixA, "" };

            checkInputAndDisplayIfInputIsNotValid(stringMatrix, 1);

            double[][] matrixA = util.stringToMatrix(stringMatrixA);

            try {
                double[][] result = math.matrixTransponation(matrixA);

                String DisplayableString = util.outputMatrixToOutputText(result);
    
                outputText.setText(DisplayableString);
                outputText.setTextAlignment(TextAlignment.CENTER);
            } catch (IllegalArgumentException e) {
                
                outputText.setText(e.getMessage());
                outputText.setTextAlignment(TextAlignment.CENTER);
            }
        });

        addButton.setOnMouseClicked((event) -> {
            String stringMatrixA = matrixATextArea.getText();
            String stringMatrixB = matrixBTextArea.getText();
            String[] stringMatrix = { stringMatrixA, stringMatrixB };

            checkInputAndDisplayIfInputIsNotValid(stringMatrix, 2);

            double[][] matrixA = util.stringToMatrix(stringMatrixA);
            double[][] matrixB = util.stringToMatrix(stringMatrixB);

            try {
                double[][] result = math.matrixAddition(matrixA, matrixB);

                String DisplayableString = util.outputMatrixToOutputText(result);
    
                outputText.setText(DisplayableString);
                outputText.setTextAlignment(TextAlignment.CENTER);
            } catch (IllegalArgumentException e) {
                
                outputText.setText(e.getMessage());
                outputText.setTextAlignment(TextAlignment.CENTER);
            }
        });

        substractButton.setOnMouseClicked((event) -> {
            String stringMatrixA = matrixATextArea.getText();
            String stringMatrixB = matrixBTextArea.getText();
            String[] stringMatrix = { stringMatrixA, stringMatrixB };
            
            checkInputAndDisplayIfInputIsNotValid(stringMatrix, 2);

            double[][] matrixA = util.stringToMatrix(stringMatrixA);
            double[][] matrixB = util.stringToMatrix(stringMatrixB);

            try {
                double[][] result = math.matrixSubstraction(matrixA, matrixB);

                String DisplayableString = util.outputMatrixToOutputText(result);

                outputText.setText(DisplayableString);
                outputText.setTextAlignment(TextAlignment.CENTER);
            } catch (IllegalArgumentException e) {

                outputText.setText(e.getMessage());
                outputText.setTextAlignment(TextAlignment.CENTER);
            }
        });

        DetAButton.setOnMouseClicked((event) -> {
            String stringMatrixA = matrixATextArea.getText();
            String[] stringMatrix = { stringMatrixA, "" };

            checkInputAndDisplayIfInputIsNotValid(stringMatrix, 1);

            double[][] matrixA = util.stringToMatrix(stringMatrixA);

            try {
                double result = math.calcDeterminat(matrixA);

                String DisplayableString = Double.toString(result);

                outputText.setText(DisplayableString);
                outputText.setTextAlignment(TextAlignment.CENTER);

            } catch (IllegalArgumentException e) {

                outputText.setText(e.getMessage());
                outputText.setTextAlignment(TextAlignment.CENTER);
            }
        });

        DetBButton.setOnMouseClicked((event) -> {
            String stringMatrixB = matrixBTextArea.getText();
            String[] stringMatrix = { "", stringMatrixB };

            checkInputAndDisplayIfInputIsNotValid(stringMatrix, 1);

            double[][] matrixB = util.stringToMatrix(stringMatrixB);

            try {
                double result = math.calcDeterminat(matrixB);

                String DisplayableString = Double.toString(result);

                outputText.setText(DisplayableString);
                outputText.setTextAlignment(TextAlignment.CENTER);

            } catch (IllegalArgumentException e) {

                outputText.setText(e.getMessage());
                outputText.setTextAlignment(TextAlignment.CENTER);
            }
        });
    }

    // TODO Wirte tests for the extracted Methode.
    /**
     * Checks the Input and Displays it if the Input is Valid.
     * 
     * @param stringMatrix            Contains both input matrices if
     *                                numberOfMarriciesToMatch is 2. If the number
     *                                is 1 than one of them has to be a empty String
     * @param numberOfMatricesToMatch If the number is 1 onely one Marix will be
     *                                verifyed and the otherone needs to be an empty
     *                                String in the stringMatrix
     */
    private void checkInputAndDisplayIfInputIsNotValid(String[] stringMatrix, int numberOfMatricesToMatch) {
        if (numberOfMatricesToMatch == 1 && !stringMatrix[0].equals("")) {
            try {
                util.checkInput(stringMatrix[0]);
            } catch (Exception e) {
                outputText.setText(e.getMessage() + "A");
                outputText.setTextAlignment(TextAlignment.CENTER);
            }
        } else if (numberOfMatricesToMatch == 1 && !stringMatrix[1].equals("")) {
            try {
                util.checkInput(stringMatrix[1]);
            } catch (Exception e) {
                outputText.setText(e.getMessage() + "B");
                outputText.setTextAlignment(TextAlignment.CENTER);
            }
        } else if (numberOfMatricesToMatch == 2 && !stringMatrix[0].equals("") && !stringMatrix[1].equals("")) {
            try {
                util.checkInput(stringMatrix[0]);
            } catch (Exception e) {
                outputText.setText(e.getMessage() + "A");
                outputText.setTextAlignment(TextAlignment.CENTER);
            }

            try {
                util.checkInput(stringMatrix[1]);
            } catch (Exception e) {
                outputText.setText(e.getMessage() + "B");
                outputText.setTextAlignment(TextAlignment.CENTER);
            }
        } else if (stringMatrix[0].equals("")) {

            outputText.setText("Pease insert MatrixA");
            outputText.setTextAlignment(TextAlignment.CENTER);

        } else if (stringMatrix[1].equals("")) {

            outputText.setText("Pease insert MatrixB");
            outputText.setTextAlignment(TextAlignment.CENTER);
        }

    }
}