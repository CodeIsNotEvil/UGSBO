package com.ugsbo.matrixcalc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests the funktionality to Calculate the Determinant of a Matrix.
 */
public class MatrixCalcDeterminatTest {

    @Test
    public void CalculatesTheDeterminanteOfA2by2Matrix() {
        MatrixCalcMath math = new MatrixCalcMath();
        // A(2,2)
        double[][] matrixA = { { 1.0, 2.0 }, { 3.0, 4.0 } };
        double determinat = -2.0;

        double result = math.calcDeterminat(matrixA);

        assertEquals("The Determinant is not as it should be", determinat, result, 0.01);
    }

    @Test
    public void CalculatesTheDeterminanteOfA3by3Matrix() {
        MatrixCalcMath math = new MatrixCalcMath();
        // A(3,3)
        double[][] matrixA = { { 1.0, 2.0, 1.0 }, { 3.0, 4.0, 0.0 }, {5.0, 6.0, 0.0} };
        double determinat = -2.0;
        double result = math.calcDeterminat(matrixA);
        
        assertEquals("The Determinant is not as it should be", determinat, result, 0.01);

        
    }

    @Test(expected = IllegalArgumentException.class)
    public void tryToCalculateA4by4MatrixSouldResulInIllegalArgumentException() {
        MatrixCalcMath math = new MatrixCalcMath();
        // A(4,4)
        double[][] matrixA = { { 1.0, 2.0, 1.0, 0.0 }, { 3.0, 4.0, 0.0, 0.0 }, {5.0, 6.0, 0.0, 0.0}, {5.0, 6.0, 0.0, 0.0} };
        
        math.calcDeterminat(matrixA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void tryToCalculateANonQuadraticMatrixSouldResulInIllegalArgumentException() {
        MatrixCalcMath math = new MatrixCalcMath();
        // A(2,4)
        double[][] matrixA = {{5.0, 6.0, 0.0, 0.0}, {5.0, 6.0, 0.0, 0.0} };
        
        math.calcDeterminat(matrixA);
    }
}