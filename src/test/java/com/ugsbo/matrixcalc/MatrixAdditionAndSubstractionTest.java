package com.ugsbo.matrixcalc;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests the funktionality to add and substract two matricies
 */
public class MatrixAdditionAndSubstractionTest {

    private MatrixCalcMath matrixMath;

    @Before
    public void setup() {
        matrixMath = new MatrixCalcMath();
    }

    @Test
    public void twoMatriciesHaveTheSameDimensions() {
        double[][] matrixA = new double[1][1];
        double[][] matrixB = new double[1][1];

        boolean result = matrixMath.checkIfMatriciesAreTheSameDimension(matrixA, matrixB);

        assertTrue("Two Matricies with the same Dimension were not detected as that", result);
    }

    @Test
    public void twoMatriciesDONOTHaveTheSameDimensions() {
        double[][] matrixA = new double[2][1];
        double[][] matrixB = new double[1][1];

        boolean result = matrixMath.checkIfMatriciesAreTheSameDimension(matrixA, matrixB);

        assertFalse("Two Matricies without the same Dimension were detected as that", result);
    }

    @Test
    public void addTwoMatriciesWithSameContent() {
        double[][] matrixA = { { 1.0, 1.0 }, { 1.0, 1.0 } };
        double[][] matrixB = { { 1.0, 1.0 }, { 1.0, 1.0 } };
        double[][] matrixC = { { 2.0, 2.0 }, { 2.0, 2.0 } };

        double[][] result = matrixMath.matrixAddition(matrixA, matrixB);

        assertArrayEquals("The first row is not correct", matrixC[0], result[0], 0.1);
        assertArrayEquals("The second row is not correct", matrixC[1], result[1], 0.1);
    }

    @Test
    public void addTwoMatriciesWithDiffrentContent() {
        double[][] matrixA = { { 7.0, 3.0 }, { 2.0, 9.0 } };
        double[][] matrixB = { { 6.0, 3.0 }, { 7.0, 11.0 } };
        double[][] matrixC = { { 13.0, 6.0 }, { 9.0, 20.0 } };

        double[][] result = matrixMath.matrixAddition(matrixA, matrixB);

        assertArrayEquals("The first row is not correct", matrixC[0], result[0], 0.1);
        assertArrayEquals("The second row is not correct", matrixC[1], result[1], 0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void tryToAddTowEmptyMatricies() {
        // A(0,0) B(0,0) => IllegalArgumentException
        double[][] matrixA = new double[0][0];
        double[][] matrixB = new double[0][0];

        matrixMath.matrixAddition(matrixA, matrixB);
    }

    @Test(expected = IllegalArgumentException.class)
    public void tryToAddTowNullMatrices() {
        // A(0,0) B(0,0) => IllegalArgumentException
        double[][] matrixA = null;
        double[][] matrixB = null;

        matrixMath.matrixAddition(matrixA, matrixB);
    }

    @Test(expected = IllegalArgumentException.class)
    public void tryToAddTowMatricesWithDifferentDimensions() {
        // A(0,0) B(0,0) => IllegalArgumentException
        double[][] matrixA = { { 1.0, 2.0 } };
        double[][] matrixB = { { 1.0 }, { 2.0 } };

        matrixMath.matrixAddition(matrixA, matrixB);
    }

    @Test
    public void substractTwoMatriciesWithSameContent() {
        double[][] matrixA = { { 1.0, 1.0 }, { 1.0, 1.0 } };
        double[][] matrixB = { { 1.0, 1.0 }, { 1.0, 1.0 } };
        double[][] matrixC = { { 0.0, 0.0 }, { 0.0, 0.0 } };

        double[][] result = matrixMath.matrixSubstraction(matrixA, matrixB);

        assertArrayEquals("The first row is not correct", matrixC[0], result[0], 0.1);
        assertArrayEquals("The second row is not correct", matrixC[1], result[1], 0.1);
    }

    @Test
    public void substractTwoMatriciesWithDiffrentContent() {
        double[][] matrixA = { { 1.0, 2.0 }, { 3.0, 4.0 } };
        double[][] matrixB = { { 5.0, 6.0 }, { 7.0, 8.0 } };
        double[][] matrixC = { { -4.0, -4.0 }, { -4.0, -4.0 } };

        double[][] result = matrixMath.matrixSubstraction(matrixA, matrixB);

        assertArrayEquals("The first row is not correct", matrixC[0], result[0], 0.1);
        assertArrayEquals("The second row is not correct", matrixC[1], result[1], 0.1);
    }

    @Test
    public void substractTwoMatriciesWithNegativeContent() {
        double[][] matrixA = { { -1.0, -2.0 }, { -3.0, -4.0 } };
        double[][] matrixB = { { 5.0, 6.0 }, { 7.0, 8.0 } };
        double[][] matrixC = { { -6.0, -8.0 }, { -10.0, -12.0 } };

        double[][] result = matrixMath.matrixSubstraction(matrixA, matrixB);

        assertArrayEquals("The first row is not correct", matrixC[0], result[0], 0.1);
        assertArrayEquals("The second row is not correct", matrixC[1], result[1], 0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void tryToSubstractTowEmptyMatricies() {
        // A(0,0) B(0,0) => IllegalArgumentException
        double[][] matrixA = new double[0][0];
        double[][] matrixB = new double[0][0];

        matrixMath.matrixSubstraction(matrixA, matrixB);
    }

    @Test(expected = IllegalArgumentException.class)
    public void tryToSubstractTowNullMatrices() {
        // A(0,0) B(0,0) => IllegalArgumentException
        double[][] matrixA = null;
        double[][] matrixB = null;

        matrixMath.matrixSubstraction(matrixA, matrixB);
    }

    @Test(expected = IllegalArgumentException.class)
    public void tryToSubstractTowMatricesWithDifferentDimensions() {
        // A(0,0) B(0,0) => IllegalArgumentException
        double[][] matrixA = { { 1.0, 2.0 } };
        double[][] matrixB = { { 1.0 }, { 2.0 } };

        matrixMath.matrixSubstraction(matrixA, matrixB);

    }
}