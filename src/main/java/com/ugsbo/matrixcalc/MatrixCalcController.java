package com.ugsbo.matrixcalc;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

import java.util.ArrayList;

public class MatrixCalcController {

    private static final String MULTIPLICATION_STRING = "multiplication";
    private static final String ADDITION_STRING = "addition";
    private static final String SUBSTRACTION_STRING = "substract";
    private static final String TRANPOSE_STRING = "transpose";
    private static final String CALCDETERMINAT_STRING = "calcDeterminate";

    // The fx:id Attributes will be bind here.
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

            ArrayList<double[][]> matricies = new ArrayList<double[][]>();
            matricies.add(util.stringToMatrix(stringMatrixA));
            matricies.add(util.stringToMatrix(stringMatrixB));

            invokeOperation(matricies, MULTIPLICATION_STRING);
        });

        /**
         * Convert a String to a matrix, transpose it and output the result.
         */
        transposeButton.setOnMouseClicked((event) -> {
            String stringMatrixA = matrixATextArea.getText();
            String[] stringMatrix = { stringMatrixA, "" };

            checkInputAndDisplayIfInputIsNotValid(stringMatrix, 1);

            ArrayList<double[][]> matricies = new ArrayList<double[][]>();
            matricies.add(util.stringToMatrix(stringMatrixA));

            invokeOperation(matricies, TRANPOSE_STRING);
        });

        /**
         * Convert Strings to matricies, add them and output the result.
         */
        addButton.setOnMouseClicked((event) -> {
            String stringMatrixA = matrixATextArea.getText();
            String stringMatrixB = matrixBTextArea.getText();
            String[] stringMatrix = { stringMatrixA, stringMatrixB };

            checkInputAndDisplayIfInputIsNotValid(stringMatrix, 2);

            ArrayList<double[][]> matricies = new ArrayList<double[][]>();
            matricies.add(util.stringToMatrix(stringMatrixA));
            matricies.add(util.stringToMatrix(stringMatrixB));

            invokeOperation(matricies, ADDITION_STRING);
        });

        /**
         * Convert Strings to matricies, substract them and output the result.
         */
        substractButton.setOnMouseClicked((event) -> {
            String stringMatrixA = matrixATextArea.getText();
            String stringMatrixB = matrixBTextArea.getText();
            String[] stringMatrix = { stringMatrixA, stringMatrixB };

            checkInputAndDisplayIfInputIsNotValid(stringMatrix, 2);

            ArrayList<double[][]> matricies = new ArrayList<double[][]>();
            matricies.add(util.stringToMatrix(stringMatrixA));
            matricies.add(util.stringToMatrix(stringMatrixB));

            invokeOperation(matricies, SUBSTRACTION_STRING);
        });

        /**
         * Convert the String of the left inputField to a matrix, calculate the Determinate and output it.
         */
        DetAButton.setOnMouseClicked((event) -> {
            String stringMatrixA = matrixATextArea.getText();
            String[] stringMatrix = { stringMatrixA, "" };

            checkInputAndDisplayIfInputIsNotValid(stringMatrix, 1);

            ArrayList<double[][]> matricies = new ArrayList<double[][]>();
            matricies.add(util.stringToMatrix(stringMatrixA));

            invokeOperation(matricies, CALCDETERMINAT_STRING);
        });

        /**
         * Convert the String of the right inputField to a matrix, calculate the Determinate and output it.
         */
        DetBButton.setOnMouseClicked((event) -> {
            String stringMatrixB = matrixBTextArea.getText();
            String[] stringMatrix = { "", stringMatrixB };

            checkInputAndDisplayIfInputIsNotValid(stringMatrix, 1);

            ArrayList<double[][]> matricies = new ArrayList<double[][]>();
            matricies.add(util.stringToMatrix(stringMatrixB));

            invokeOperation(matricies, CALCDETERMINAT_STRING);
        });
    }

    /**
     * Invokes the needed operations form the MatrixCalcMath class 
     * @param matricies Contains both Matricies or onely one Matrix
     * @param operation One of the global Constats to select wich Operation is needed.
     */
    private void invokeOperation(ArrayList<double[][]> matricies, String operation) {
        if (matricies.size() == 2) {
            if (operation.equals(MULTIPLICATION_STRING)) {
                try {
                    double[][] result = math.matrixMultiplication(matricies.get(0), matricies.get(1));

                    String DisplayableString = util.outputMatrixToOutputText(result);

                    outputText.setText(DisplayableString);
                    outputText.setTextAlignment(TextAlignment.CENTER);
                } catch (IllegalArgumentException e) {

                    outputText.setText(e.getMessage());
                    outputText.setTextAlignment(TextAlignment.CENTER);
                }
            } else if (operation.equals(ADDITION_STRING)) {
                try {
                    double[][] result = math.matrixAddition(matricies.get(0), matricies.get(1));
        
                    String DisplayableString = util.outputMatrixToOutputText(result);
        
                    outputText.setText(DisplayableString);
                    outputText.setTextAlignment(TextAlignment.CENTER);
                } catch (IllegalArgumentException e) {
        
                    outputText.setText(e.getMessage());
                    outputText.setTextAlignment(TextAlignment.CENTER);
                }
            } else if (operation.equals(SUBSTRACTION_STRING)) {
                try {
                    double[][] result = math.matrixSubstraction(matricies.get(0), matricies.get(1));
        
                    String DisplayableString = util.outputMatrixToOutputText(result);
        
                    outputText.setText(DisplayableString);
                    outputText.setTextAlignment(TextAlignment.CENTER);
                } catch (IllegalArgumentException e) {
        
                    outputText.setText(e.getMessage());
                    outputText.setTextAlignment(TextAlignment.CENTER);
                }
            }
        }else if (matricies.size() == 1) {
            if (operation.equals(TRANPOSE_STRING)) {
                try {
                    double[][] result = math.matrixTransponation(matricies.get(0));
        
                    String DisplayableString = util.outputMatrixToOutputText(result);
        
                    outputText.setText(DisplayableString);
                    outputText.setTextAlignment(TextAlignment.CENTER);
                } catch (IllegalArgumentException e) {
        
                    outputText.setText(e.getMessage());
                    outputText.setTextAlignment(TextAlignment.CENTER);
                }
            }
            if (operation.equals(CALCDETERMINAT_STRING)) {
                try {
                    double result = math.calcDeterminat(matricies.get(0));
        
                    String DisplayableString = Double.toString(result);
        
                    outputText.setText(DisplayableString);
                    outputText.setTextAlignment(TextAlignment.CENTER);
                } catch (IllegalArgumentException e) {
        
                    outputText.setText(e.getMessage());
                    outputText.setTextAlignment(TextAlignment.CENTER);
                } catch (Exception e){

                    outputText.setText(e.getMessage());
                    outputText.setTextAlignment(TextAlignment.CENTER);
                }
            }
        }
    }

    /**
     * Checks the Input and Displays it if the Input is valid.
     * 
     * @param stringMatrix            Contains both input matrices if
     *                                numberOfMarriciesToMatch is 2. If the number
     *                                is 1 than one of them has to be a empty String
     * @param numberOfMatricesToMatch If the number is 1 onely one Marix will be
     *                                verifyed and the other one needs to be an empty
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