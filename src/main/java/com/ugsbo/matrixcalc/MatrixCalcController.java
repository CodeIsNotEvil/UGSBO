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
            MatrixCalcMath math = new MatrixCalcMath();
            MatrixCalcIOUtils util = new MatrixCalcIOUtils();

            String stringMatrixA = matrixATextArea.getText();
            String stringMatrixB = matrixBTextArea.getText();
            if (util.checkInput(stringMatrixA) && util.checkInput(stringMatrixB)) {

                double[][] matrixA = util.stringToMatrix(stringMatrixA);
                double[][] matrixB = util.stringToMatrix(stringMatrixB);
                double[][] result = math.matrixMultiplication(matrixA, matrixB);

                String DisplayableString = util.outputMatrixToOutputText(result);

                outputText.setText(DisplayableString);
                outputText.setTextAlignment(TextAlignment.CENTER);
            }
            // System.out.println(matrixATextArea.getText());
        });

        transposeButton.setOnMouseClicked((event) -> {
            MatrixCalcMath math = new MatrixCalcMath();
            MatrixCalcIOUtils util = new MatrixCalcIOUtils();

            String stringMatrixA = matrixATextArea.getText();
            if (util.checkInput(stringMatrixA)) {

                double[][] matrixA = util.stringToMatrix(stringMatrixA);
                double[][] result = math.matrixTransponation(matrixA);

                String DisplayableString = util.outputMatrixToOutputText(result);

                outputText.setText(DisplayableString);
                outputText.setTextAlignment(TextAlignment.CENTER);
            }
        });

        addButton.setOnMouseClicked((event) -> {
            MatrixCalcMath math = new MatrixCalcMath();
            MatrixCalcIOUtils util = new MatrixCalcIOUtils();

            String stringMatrixA = matrixATextArea.getText();
            String stringMatrixB = matrixBTextArea.getText();
            if (util.checkInput(stringMatrixA) && util.checkInput(stringMatrixB)) {

                double[][] matrixA = util.stringToMatrix(stringMatrixA);
                double[][] matrixB = util.stringToMatrix(stringMatrixB);
                double[][] result = math.matrixAddition(matrixA, matrixB);

                String DisplayableString = util.outputMatrixToOutputText(result);

                outputText.setText(DisplayableString);
                outputText.setTextAlignment(TextAlignment.CENTER);
            }
        });

        substractButton.setOnMouseClicked((event) -> {
            MatrixCalcMath math = new MatrixCalcMath();
            MatrixCalcIOUtils util = new MatrixCalcIOUtils();

            String stringMatrixA = matrixATextArea.getText();
            String stringMatrixB = matrixBTextArea.getText();

            boolean stop = false;

            try {
                util.checkInput(stringMatrixA);
            } catch (Exception e) {
                stop = true;

                outputText.setText(e.getMessage() + "A");
                outputText.setTextAlignment(TextAlignment.CENTER);
            }

            try {
                util.checkInput(stringMatrixB);
            } catch (Exception e) {
                stop = true;

                outputText.setText(e.getMessage() + "B");
                outputText.setTextAlignment(TextAlignment.CENTER);
            }

            if (util.checkInput(stringMatrixA) && util.checkInput(stringMatrixB) && !stop) {

                double[][] matrixA = util.stringToMatrix(stringMatrixA);
                double[][] matrixB = util.stringToMatrix(stringMatrixB);

                try {
                    double[][] result = math.matrixSubstraction(matrixA, matrixB);

                    String DisplayableString = util.outputMatrixToOutputText(result);

                    outputText.setText(DisplayableString);
                    outputText.setTextAlignment(TextAlignment.CENTER);
                } catch (Exception e) {

                    outputText.setText(e.getMessage());
                    outputText.setTextAlignment(TextAlignment.CENTER);
                }
                


            }
        });

        DetAButton.setOnMouseClicked((event) -> {
            MatrixCalcMath math = new MatrixCalcMath();
            MatrixCalcIOUtils util = new MatrixCalcIOUtils();

            String stringMatrixA = matrixATextArea.getText();

            boolean stop = false;
            try {

                util.checkInput(stringMatrixA);

            } catch (IllegalArgumentException e) {
                stop = true;

                outputText.setText(e.getMessage());
                outputText.setTextAlignment(TextAlignment.CENTER);
            }
            if (util.checkInput(stringMatrixA) && !stop) {

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
            }
        });

        DetBButton.setOnMouseClicked((event) -> {
            MatrixCalcMath math = new MatrixCalcMath();
            MatrixCalcIOUtils util = new MatrixCalcIOUtils();

            String stringMatrixB = matrixBTextArea.getText();
            boolean stop = false;
            try {

                util.checkInput(stringMatrixB);

            } catch (IllegalArgumentException e) {
                stop = true;

                outputText.setText(e.getMessage());
                outputText.setTextAlignment(TextAlignment.CENTER);
            }
            if (util.checkInput(stringMatrixB) && !stop) {

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
            }
        });
    }
}