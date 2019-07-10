package com.ugsbo.matrixcalc;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Testet die Matrix Multiplication funkionalität
 */
public class MatrixMultiplicationTest {

    private MatrixCalcMath matrixMath;

    @Before
    public void setup() {
        matrixMath = new MatrixCalcMath();
    }

    @Test
    public void matrixAIsLinkedToMatrixBSouldBeTrue() {
        double[][] matrixA = new double[1][2];
        double[][] matrixB = new double[2][1];

        boolean result = matrixMath.checkIfMatriciesAreLinked(matrixA, matrixB);

        assertTrue("Matrix A is Linked to B but it is not detected that way", result);
    }

    @Test
    public void matrixAAndMatrixBAreNullSouldReturnFalse() {
        double[][] matrixA = null;
        double[][] matrixB = null;

        boolean result = matrixMath.checkIfMatriciesAreLinked(matrixA, matrixB);

        assertFalse("Matrix A and B are null but detected as Linked", result);
    }

    @Test
    public void matrixAAndMatrixBAreNotLinkedSouldReturnFalse() {
        double[][] matrixA = new double[1][1];
        double[][] matrixB = new double[2][1];

        boolean result = matrixMath.checkIfMatriciesAreLinked(matrixA, matrixB);

        assertFalse("Matrix A and B are not Linked but detected as Linked", result);
    }

    @Test
    public void multiplyTwoMatriciesWithSameDimensionsAndSameContent() {
        double[][] matrixA = { { 1.0, 1.0 }, { 1.0, 1.0 } };
        double[][] matrixB = { { 1.0, 1.0 }, { 1.0, 1.0 } };
        double[][] matrixC = { { 2.0, 2.0 }, { 2.0, 2.0 } };

        double[][] result = matrixMath.matrixMultiplication(matrixA, matrixB);

        assertArrayEquals("The first row is not correct", matrixC[0], result[0], 0.1);
        assertArrayEquals("The second row is not correct", matrixC[1], result[1], 0.1);
    }

    @Test
    public void multiplyTowMatriciesWithDiffrentDimensions() {
        // A(2,3) B(3,2) => C(2,2)
        double[][] matrixA = { { 1.0, 1.0, 1.0 }, { 1.0, 1.0, 1.0 } };
        double[][] matrixB = { { 1.0, 1.0 }, { 1.0, 1.0 }, { 1.0, 1.0 } };
        double[][] matrixC = { { 3.0, 3.0 }, { 3.0, 3.0 } };

        double[][] result = matrixMath.matrixMultiplication(matrixA, matrixB);

        assertArrayEquals("The first row is not correct", matrixC[0], result[0], 0.1);
        assertArrayEquals("The second row is not correct", matrixC[1], result[1], 0.1);
    }

    @Test
    public void multiplyTowMatriciesWithDiffrentDimensionsAndDiffentContent() {
        // A(2,3) B(3,2) => C(2,2)
        double[][] matrixA = { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 } };
        double[][] matrixB = { { 7.0, 8.0 }, { 9.0, 10.0 }, { 11.0, 12.0 } };
        double[][] matrixC = { { 58.0, 64.0 }, { 139.0, 154.0 } };

        double[][] result = matrixMath.matrixMultiplication(matrixA, matrixB);

        assertArrayEquals("The first row is not correct", matrixC[0], result[0], 0.1);
        assertArrayEquals("The second row is not correct", matrixC[1], result[1], 0.1);
    }

    @Test(expected = IllegalArgumentException.class)

    public void tryToMultiplyTowEmptyMatricies() {
        // A(0,0) B(0,0) => IllegalArgumentException
        double[][] matrixA = new double[0][0];
        double[][] matrixB = new double[0][0];

        matrixMath.matrixMultiplication(matrixA, matrixB);
    }

    @Test(expected = IllegalArgumentException.class)

    public void tryToMultiplyTowNullObjects() {
        // null null => IllegalArgumentException
        double[][] matrixA = null;
        double[][] matrixB = null;

        matrixMath.matrixMultiplication(matrixA, matrixB);
    }
}
