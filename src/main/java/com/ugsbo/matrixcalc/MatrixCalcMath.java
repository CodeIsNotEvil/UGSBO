package com.ugsbo.matrixcalc;

import java.util.ArrayList;

/**
 * Contains all basic matrix math calculations.
 */
public class MatrixCalcMath {

    /**
     * Mutliplys matrixA and matrixB.
     * 
     * @param matrixA The Inputmatrix A (right TextArea in the GUI)
     * @param matrixB The Inputmatrix B (left TextArea in the GUI)
     * @return The Matrixproduct of the matricies A and B
     */
    public double[][] matrixMultiplication(double[][] matrixA, double[][] matrixB) {
        if (checkIfMatriciesAreLinked(matrixA, matrixB)) {
            int rowOfResultMatrix = matrixA.length;
            int columOfResultMatrix = matrixB[0].length;
            int ColumsOfMatA = matrixA[0].length;
            double[][] result = new double[rowOfResultMatrix][columOfResultMatrix];

            for (int rowResult = 0; rowResult < rowOfResultMatrix; rowResult++) {
                for (int columResult = 0; columResult < columOfResultMatrix; columResult++) {
                    for (int columOfA = 0; columOfA < ColumsOfMatA; columOfA++) {
                        result[rowResult][columResult] += matrixA[rowResult][columOfA] * matrixB[columOfA][columResult];
                    }
                }
            }
            return result;
        } else {
            throw new IllegalArgumentException("Matricies must be linked");
        }
    }

    /**
     * checks if matrixA and matrixB are linked to know if it is possible to
     * multiply them. If they are linked it is possible.
     * 
     * @param matrixA The Inputmatrix A (right TextArea in the GUI)
     * @param matrixB The Inputmatrix B (left TextArea in the GUI)
     * @return true if you can Muliply A with B false if not.
     */
    public boolean checkIfMatriciesAreLinked(double[][] matrixA, double[][] matrixB) {
        if (matrixA == null) {
            return false;
        }
        if (matrixA.length == 0) {
            return false;
        }
        if (matrixA[0].length == matrixB.length) {
            return true;
        }
        return false;
    }

    /**
     * Adds two matroices A and B. Adding matrix A to matrix B is the same as adding
     * B to A.
     * 
     * @param matrixA The Inputmatrix A (right TextArea in the GUI)
     * @param matrixB The Inputmatrix B (left TextArea in the GUI)
     * @return The Matrixsum of matrix A and matrix B
     */
    public double[][] matrixAddition(double[][] matrixA, double[][] matrixB) {
        if (checkIfMatriciesAreTheSameDimension(matrixA, matrixB)) {
            double[][] result = new double[matrixA.length][matrixA[0].length];
            for (int rows = 0; rows < matrixA.length; rows++) {
                for (int colums = 0; colums < matrixA[0].length; colums++) {
                    result[rows][colums] = matrixA[rows][colums] + matrixB[rows][colums];
                }
            }
            return result;
        } else {
            throw new IllegalArgumentException("Matricies need to have the same Dimensions");
        }
    }

    /**
     * In order to adding two Matricies they must have the same Dimensions. This
     * Methode checks if this is the case.
     * 
     * @param matrixA The Inputmatrix A (right TextArea in the GUI)
     * @param matrixB The Inputmatrix B (left TextArea in the GUI)
     * @return true if the Dimensions of Matrix A equals the Dimensions Matrix B
     */
    public boolean checkIfMatriciesAreTheSameDimension(double[][] matrixA, double[][] matrixB) {
        if (matrixA == null || matrixA.length == 0) {
            return false;
        }
        if (matrixA[0] == null) {
            return false;
        }
        if (matrixA.length == matrixB.length && matrixA[0].length == matrixB[0].length) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Substracts matrix A by the matrix B. Substaction for Matrices is just the
     * substraction of each component with thier coorsponding component.
     * 
     * @param matrixA The Inputmatrix A (right TextArea in the GUI)
     * @param matrixB The Inputmatrix B (left TextArea in the GUI
     * @return matrix A substracted by matrix B
     */
    public double[][] matrixSubstraction(double[][] matrixA, double[][] matrixB) {
        if (checkIfMatriciesAreTheSameDimension(matrixA, matrixB)) {
            double[][] result = new double[matrixA.length][matrixA[0].length];
            for (int rows = 0; rows < matrixA.length; rows++) {
                for (int colums = 0; colums < matrixA[0].length; colums++) {
                    result[rows][colums] = matrixA[rows][colums] - matrixB[rows][colums];
                }
            }
            return result;
        } else {
            throw new IllegalArgumentException("Matricies need to have the same Dimensions");
        }
    }

    /**
     * Transposes the Input Matrix. Swaps rows with colums.
     * 
     * @param matrixA The Inputmatrix A wich will be Transposed
     * @return The Transposed matrix of matrix A
     */
    public double[][] matrixTransponation(double[][] matrixA) {
        if (matrixA == null) {
            throw new IllegalArgumentException("Matricies need to have the same Dimensions");
        }
        if (matrixA.length == 0) {
            throw new IllegalArgumentException("Matricies need to have the same Dimensions");
        }
        if (matrixA[0] == null) {
            throw new IllegalArgumentException("Matricies need to have the same Dimensions");
        }
        int columCountResult = matrixA.length;
        int rowCountResult = matrixA[0].length;
        double[][] result = new double[rowCountResult][columCountResult];
        for (int row = 0; row < rowCountResult; row++) {
            for (int colum = 0; colum < columCountResult; colum++) {
                result[row][colum] = matrixA[colum][row];
            }
        }
        return result;
    }

    /**
     * Calculates the Determinant of a Matrix.
     * 
     * @param matrixA The Inputmatrix
     * @return The Determinant of the Matrix A
     */
    public double calcDeterminat(double[][] matrixA) {
        // checking if a Determinant can be calculated.
        double result = 0.0;
        if (checkIfMatrixIsQuadradtic(matrixA)) {
            if (getMatrixRowCount(matrixA) == 2) {
                result = calc2by2Determinant(matrixA);
            } else if (getMatrixRowCount(matrixA) == 3) {
                result = calc3by3Determinant(matrixA);

            } else {
                throw new IllegalArgumentException("Matrix is not 2 by 2 or 3 by 3");
            }

        } else {
            throw new IllegalArgumentException("Matrix must be Quadratic");
        }
        return result;
    }

    /**
     * Calculates the Determinat of an three by three Matrix.
     * 
     * @param matrixA The Inputmatrix form wich the Determinat will be calculated
     * @return the Determinant of the Matrix
     */
    private double calc3by3Determinant(double[][] matrixA) {
        double result = matrixA[0][0] * matrixA[1][1] * matrixA[2][2] + matrixA[0][1] * matrixA[1][2] * matrixA[2][0]
                + matrixA[0][2] * matrixA[1][0] * matrixA[2][1] - matrixA[0][0] * matrixA[1][2] * matrixA[2][1]
                - matrixA[0][1] * matrixA[1][0] * matrixA[2][2] - matrixA[0][2] * matrixA[1][1] * matrixA[2][0];
        return result;
    }

    /**
     * Calculates the Determinat of an two by two Matrix.
     * 
     * @param matrixA The Inputmatrix form wich the Determinat will be calculated
     * @return the Determinant of the Matrix
     */
    private double calc2by2Determinant(double[][] matrixA) {
        double result = matrixA[0][0] * matrixA[1][1] - matrixA[0][1] * matrixA[1][0];
        return result;
    }

    /**
     * Returns the Number of rows of a Matrix.
     * 
     * @param matrixA the Inputmatrix form wich the rows will be counted
     * @return Number of rows
     */
    private int getMatrixRowCount(double[][] matrixA) {
        return matrixA.length;
    }

    /**
     * Checks if the rows and colums of an Matrix are equal. If they are equal the
     * Matrix is Quadratic and the function will return true.
     * 
     * @param matrixA the Inputmatrix for wich the rows and colums will be compared
     * @return isQuadratic
     */
    private boolean checkIfMatrixIsQuadradtic(double[][] matrixA) {
        if (matrixA == null) {
            return false;
        }
        if (matrixA[0] == null) {
            return false;
        }
        if (matrixA.length == matrixA[0].length) {
            return true;
        }
        return false;
    }

    public double[][] stringToMatrix(String stringMatrix) {
        
        ArrayList<String[]> singleNumbersArr =  new ArrayList<String[]>();
        
        //Splitting the strings into their rows
        String[] singleNumbers = null;
        String[] rows = stringMatrix.split("\n");
        for (int i = 0; i < rows.length; i++) {
            //System.out.println(rows[i]);
        	//Splitting rows into their Numbers
            singleNumbers = rows[i].split("\\s");
            singleNumbersArr.add(singleNumbers);
        }

        int rowlength = singleNumbersArr.get(0).length; //row.length
        int columCount = singleNumbersArr.size(); //output.length
        double[][] result = new double[columCount][rowlength];
        
        for (int columIndex = 0; columIndex < columCount; columIndex++) {
            for (int rowIndex = 0;  rowIndex < singleNumbers.length; rowIndex++) {
                    result[columIndex][rowIndex] = Double.parseDouble(singleNumbersArr.get(columIndex)[rowIndex]);
            }
        }
        return result;
    }

}