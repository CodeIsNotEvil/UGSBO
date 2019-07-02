package com.ugsbo.matrixcalc;

import java.io.IOException;

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
            return null;
            // throw new IllegalArgumentException("Matricies must be linked");
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
            return null;
            // TODO Fragen wie man eine Exception testen kann.
            // throw new IllegalArgumentException("Matricies need to have the same
            // Dimensions");
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
            return null;
            // TODO Fragen wie man eine Exception testen kann.
            // throw new IllegalArgumentException("Matricies need to have the same
            // Dimensions");
        }
    }

    /**
     * Transposes the Input Matrix. Swaps rows with colums.
     * 
     * @param matrixA The Inputmatrix A wich will be Transposed
     * @return The Transposed matrix of matrix A
     */
    public double[][] matrixTransponation(double[][] matrixA) {
        if(matrixA == null) {
            // TODO hier auch die exception.
            return null;
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
}