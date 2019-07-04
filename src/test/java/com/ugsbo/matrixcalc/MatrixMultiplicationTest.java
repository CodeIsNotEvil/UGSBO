package com.ugsbo.matrixcalc;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Testet die Matrix Multiplication funkionalität
 */
public class MatrixMultiplicationTest {

    @Test
    public void matrixAIsLinkedToMatrixBSouldBeTrue() {
        MatrixCalcMath math = new MatrixCalcMath();
        double[][] matrixA = new double[1][2];
        double[][] matrixB = new double[2][1];

        boolean result = math.checkIfMatriciesAreLinked(matrixA, matrixB);
        
        assertTrue("Matrix A is Linked to B but it is not detected that way", result);
    }

    @Test
    public void matrixAAndMatrixBAreNullSouldReturnFalse() {
        MatrixCalcMath math = new MatrixCalcMath();
        double[][] matrixA = null;
        double[][] matrixB = null;

        boolean result = math.checkIfMatriciesAreLinked(matrixA, matrixB);

        assertFalse("Matrix A and B are null but detected as Linked", result);
    }

    @Test
    public void matrixAAndMatrixBAreNotLinkedSouldReturnFalse() {
        MatrixCalcMath math = new MatrixCalcMath();
        double[][] matrixA = new double[1][1];
        double[][] matrixB = new double[2][1];

        boolean result = math.checkIfMatriciesAreLinked(matrixA, matrixB);

        assertFalse("Matrix A and B are not Linked but detected as Linked", result);
    }

    @Test
    public void multiplyTwoMatriciesWithSameDimensionsAndSameContent() {
        MatrixCalcMath math = new MatrixCalcMath();
        double[][] matrixA = { { 1.0, 1.0 }, { 1.0, 1.0 } };
        double[][] matrixB = { { 1.0, 1.0 }, { 1.0, 1.0 } };
        double[][] matrixC = { { 2.0, 2.0 }, { 2.0, 2.0 } };

        double[][] result = math.matrixMultiplication(matrixA, matrixB);

        assertArrayEquals("The first row is not correct", matrixC[0], result[0], 0.1);
        assertArrayEquals("The second row is not correct", matrixC[1], result[1], 0.1);
    }

    @Test
    public void multiplyTowMatriciesWithDiffrentDimensions() {
        MatrixCalcMath math = new MatrixCalcMath();
        // A(2,3) B(3,2) => C(2,2)
        double[][] matrixA = { { 1.0, 1.0, 1.0 }, { 1.0, 1.0, 1.0 } };
        double[][] matrixB = { { 1.0, 1.0 }, { 1.0, 1.0 }, { 1.0, 1.0 } };
        double[][] matrixC = { { 3.0, 3.0 }, { 3.0, 3.0 } };

        double[][] result = math.matrixMultiplication(matrixA, matrixB);

        assertArrayEquals("The first row is not correct", matrixC[0], result[0], 0.1);
        assertArrayEquals("The second row is not correct", matrixC[1], result[1], 0.1);
    }

    @Test
    public void multiplyTowMatriciesWithDiffrentDimensionsAndDiffentContent() {
        MatrixCalcMath math = new MatrixCalcMath();
        // A(2,3) B(3,2) => C(2,2)
        double[][] matrixA = { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 } };
        double[][] matrixB = { { 7.0, 8.0 }, { 9.0, 10.0 }, { 11.0, 12.0 } };
        double[][] matrixC = { { 58.0, 64.0 }, { 139.0, 154.0 } };

        double[][] result = math.matrixMultiplication(matrixA, matrixB);

        assertArrayEquals("The first row is not correct", matrixC[0], result[0], 0.1);
        assertArrayEquals("The second row is not correct", matrixC[1], result[1], 0.1);
    }

    @Test(expected = IllegalArgumentException.class)

    public void tryToMultiplyTowEmptyMatricies() {
        MatrixCalcMath math = new MatrixCalcMath();
        // A(0,0) B(0,0) => IllegalArgumentException
        double[][] matrixA = new double[0][0];
        double[][] matrixB = new double[0][0];
        
        math.matrixMultiplication(matrixA, matrixB);
    }

    @Test(expected = IllegalArgumentException.class)

    public void tryToMultiplyTowNullObjects() {
        MatrixCalcMath math = new MatrixCalcMath();
        // null null => IllegalArgumentException
        double[][] matrixA = null;
        double[][] matrixB = null;
        
        math.matrixMultiplication(matrixA, matrixB);
    }
}
