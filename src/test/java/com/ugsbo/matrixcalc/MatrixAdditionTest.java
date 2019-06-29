package com.ugsbo.matrixcalc;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Tests the funktionality to add two matricies
 */
public class MatrixAdditionTest {

    @Test
    public void twoMatriciesHaveTheSameDimensions() {
        MatrixCalcMath math = new MatrixCalcMath();
        double[][] matrixA = new double[1][1];
        double[][] matrixB = new double[1][1];

        boolean result = math.checkIfMatriciesAreTheSameDimension(matrixA, matrixB);

        assertTrue("Two Matricies with the same Dimension were not detected as that", result);
    }

    @Test
    public void twoMatriciesDONOTHaveTheSameDimensions() {
        MatrixCalcMath math = new MatrixCalcMath();
        double[][] matrixA = new double[2][1];
        double[][] matrixB = new double[1][1];

        boolean result = math.checkIfMatriciesAreTheSameDimension(matrixA, matrixB);

        assertFalse("Two Matricies without the same Dimension were detected as that", result);
    }

    @Test
    public void addTwoMatriciesWithSameContent() {
        MatrixCalcMath math = new MatrixCalcMath();
        double[][] matrixA = { { 1.0, 1.0 }, { 1.0, 1.0 } };
        double[][] matrixB = { { 1.0, 1.0 }, { 1.0, 1.0 } };
        double[][] matrixC = { { 2.0, 2.0 }, { 2.0, 2.0 } };

        double[][] result = math.matrixAddition(matrixA, matrixB);

        assertArrayEquals("The first row is not correct", matrixC[0], result[0], 0.1);
        assertArrayEquals("The seound row is not correct", matrixC[1], result[1], 0.1);
    }
    
    @Test
    public void addTwoMatriciesWithDiffrentContent() {
        MatrixCalcMath math = new MatrixCalcMath();
        double[][] matrixA = { { 7.0, 3.0 }, { 2.0, 9.0 } };
        double[][] matrixB = { { 6.0, 3.0 }, { 7.0, 11.0 } };
        double[][] matrixC = { { 13.0, 6.0 }, { 9.0, 20.0 } };

        double[][] result = math.matrixAddition(matrixA, matrixB);

        assertArrayEquals("The first row is not correct", matrixC[0], result[0], 0.1);
        assertArrayEquals("The seound row is not correct", matrixC[1], result[1], 0.1);
    }
}