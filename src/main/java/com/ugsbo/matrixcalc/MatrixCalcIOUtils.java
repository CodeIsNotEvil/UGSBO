package com.ugsbo.matrixcalc;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatrixCalcIOUtils {
    /**
     * Prints a given 2D-Array to the output Textfield.
     * 
     * @param output2DArray The Array that gets Displayed
     */
    protected String outputMatrixToOutputText(double[][] output2DArray) {
        // convert array to String
        String DisplayableString = convertsArrayToStringInOrderToDisplayIt(output2DArray);
        // Display output
        return DisplayableString;
    }

    /**
     * Converts 2D-Array to String in order to Display it.
     * 
     * @param array2D The array wich will be converted to an Displayable String
     * @return The Displayable String
     */
    protected String convertsArrayToStringInOrderToDisplayIt(double[][] array2D) {
        String displayableString = "";
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[0].length; j++) {
                displayableString += array2D[i][j] + "   ";
            }
            displayableString += "\n\n";
        }
        return displayableString;
    }

    /**
     * Checks if the Input is Valid, with Regex. Returns true if the Matrix can be
     * matched by the regular Expression.
     * 
     * @param matrix It is the InputMatrix
     * @return True if the Matrix is valid Input.
     */
    protected void checkInput(String matrix) throws IllegalArgumentException {
        if (matrix.length() == 0) {
            throw new IllegalArgumentException("Please insert a Matrix");
        }

        // Matches digits witch following spaces 1 to 3 times
        String row1 = "(\\d*\\u0020*){1,3}";
        // Matches newlineCurrierReturn followed by digits witch following spaces 1 to
        // 3 times
        String row2 = "(\\n){0,3}(\\d*\\u0020*){0,3}";
        String row3 = "(\\n){0,3}(\\d*\\u0020*){0,3}";

        // TODO for verion 2 get the input check more stricktly missing matrix slots are allowed.

        Pattern p = Pattern.compile(row1 + row2 + row3);
        Matcher m = p.matcher(matrix);
        
        if(!m.matches()){
            throw new IllegalArgumentException("A Matrix is not in the right format, Matrix ");
        }
    }

    /**
     * Converts a String form the Inputfield to an 2D-Array aka Matrix.
     * 
     * @param stringMatrix The String form the Inputfield
     * @return Matrix as a 2D-Array
     */
    public double[][] stringToMatrix(String stringMatrix) {

        ArrayList<String[]> singleNumbersArr = new ArrayList<String[]>();

        // Splitting the strings into their rows
        String[] singleNumbers = null;
        String[] rows = stringMatrix.split("\n");
        for (int i = 0; i < rows.length; i++) {
            // Splitting rows into their Numbers
            singleNumbers = rows[i].split("\\s");
            singleNumbersArr.add(singleNumbers);
        }

        int rowlength = singleNumbersArr.get(0).length;
        int columCount = singleNumbersArr.size();
        double[][] matrix = new double[columCount][rowlength];

        for (int columIndex = 0; columIndex < columCount; columIndex++) {
            for (int rowIndex = 0; rowIndex < singleNumbers.length; rowIndex++) {
                matrix[columIndex][rowIndex] = Double.parseDouble(singleNumbersArr.get(columIndex)[rowIndex]);
            }
        }
        return matrix;
    }

}