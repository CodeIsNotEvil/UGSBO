package com.ugsbo.matrixcalc;

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
    public Double[][] matrixMultiplication(Double[][] matrixA, Double[][] matrixB) {
        // TODO Matrix Multiplication
        return null;
    }

    /**
     * checks if matrixA and matrixB are linked to know if it is possible to
     * multiply them. If they are linked it is possible.
     * 
     * @param matrixA The Inputmatrix A (right TextArea in the GUI)
     * @param matrixB The Inputmatrix B (left TextArea in the GUI)
     * @return true if you can Muliply A with B false if not.
     */
    public boolean checkIfMatriciesAreLinked(Double[][] matrixA, Double[][] matrixB) {
        // TODO Check if the number of Rows of Matrix A equal to the coulums of Matrix B
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
    public Double[][] matrixAddition(Double[][] matrixA, Double[][] matrixB) {
        // TODO Sum each Element of matrix A to the corrosponding elem in B
        return null;
    }

    /**
     * In order to adding two Matricies they must have the same Dimensions. This
     * Methode checks if this is the case.
     * 
     * @param matrixA The Inputmatrix A (right TextArea in the GUI)
     * @param matrixB The Inputmatrix B (left TextArea in the GUI)
     * @return true if the Dimensions of Matrix A equals the Dimensions Matrix B
     */
    public boolean checkIfMatriciesAreTheSameDimension(Double[][] matrixA, Double[][] matrixB) {
        // TODO Dimension check.
        return false;
    }
}