package com.ugsbo.matrixcalc;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Testet die Matrix Multiplication funkionalität
 */
public class MatrixMultiplicationTest {

    @Test
    public void MatrixAIsLinkedToMatrixBSouldBeTrue() {
        MatrixCalcMath math = new MatrixCalcMath();
        Double[][] matrixA = new Double[1][2];
        Double[][] matrixB = new Double[2][1];
        assertTrue("Matrix A is Linked to B but it is not detected that way",
                math.checkIfMatriciesAreLinked(matrixA, matrixB));
    }

    @Test
    public void MatrixAAndMatrixBAreNullSouldReturnFalse() {
        MatrixCalcMath math = new MatrixCalcMath();
        Double[][] matrixA = null;
        Double[][] matrixB = null;
        assertFalse("Matrix A and B are null but detected as Linked", math.checkIfMatriciesAreLinked(matrixA, matrixB));
    }

    @Test
    public void MatrixAAndMatrixBAreNotLinkedSouldReturnFalse() {
        MatrixCalcMath math = new MatrixCalcMath();
        Double[][] matrixA = new Double[1][1];
        Double[][] matrixB = new Double[2][1];
        assertFalse("Matrix A and B are not Linked but detected as Linked",
                math.checkIfMatriciesAreLinked(matrixA, matrixB));
    }
}
