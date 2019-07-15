package com.ugsbo.matrixcalc;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests the funktionality to Calculate the Determinant of a Matrix.
 */
public class MatrixCalcDeterminatTest {

    private MatrixCalcMath matrixMath;

    @Before
    public void setup() {
        matrixMath = new MatrixCalcMath();
    }

    @Test
    public void CalculatesTheDeterminanteOfA2by2Matrix() {
        // A(2,2)
        double[][] matrixA = { { 1.0, 2.0 }, { 3.0, 4.0 } };
        double determinat = -2.0;
        double delta = 0.01;

        double result = matrixMath.calcDeterminat(matrixA);

        assertEquals("The Determinant is not as it should be", determinat, result, delta);
    }

    @Test
    public void CalculatesTheDeterminanteOfA3by3Matrix() {
        // A(3,3)
        double[][] matrixA = { { 1.0, 2.0, 1.0 }, { 3.0, 4.0, 0.0 }, { 5.0, 6.0, 0.0 } };
        double determinat = -2.0;
        double delta = 0.01;

        double result = matrixMath.calcDeterminat(matrixA);

        assertEquals("The Determinant is not as it should be", determinat, result, delta);

    }

    @Test(expected = IllegalArgumentException.class)
    public void tryToCalculateA4by4Matrix_ShouldResulInIllegalArgumentException() {
        // A(4,4)
        double[][] matrixA = { { 1.0, 2.0, 1.0, 0.0 }, { 3.0, 4.0, 0.0, 0.0 }, { 5.0, 6.0, 0.0, 0.0 },
                { 5.0, 6.0, 0.0, 0.0 } };

        matrixMath.calcDeterminat(matrixA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void tryToCalculateANonQuadraticMatrix_SouldResulInIllegalArgumentException() {
        // A(2,4)
        double[][] matrixA = { { 5.0, 6.0, 0.0, 0.0 }, { 5.0, 6.0, 0.0, 0.0 } };

        matrixMath.calcDeterminat(matrixA);
    }
}
