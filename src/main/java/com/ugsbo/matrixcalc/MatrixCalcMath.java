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
            throw new IllegalArgumentException("array must be linked");
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
        if (matrixA != null) {
            if (matrixA[0].length == matrixB.length) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
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
    public boolean checkIfMatriciesAreTheSameDimension(double[][] matrixA, double[][] matrixB) {
        // TODO Dimension check.
        return false;
    }
}