package com.ugsbo.matrixcalc;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests the funktionality to Calculate the Determinant of a Matrix.
 */
public class StringToMatrixTest {

    private MatrixCalcMath matrixMath;

    @Before
    public void setup() {
        matrixMath = new MatrixCalcMath();
    }

    @Test
    public void StringWithSingleDigitNumbersToMatrix_ReturnsEquivalentMatrix() {
        String inputString = "1";
        double[][] expected = { { 1.0 } };
        
        double[][] result = matrixMath.stringToMatrix(inputString);

        assertArrayEquals("The first row is not correct", expected[0], result[0], 0.1);
    }

    @Test
    public void StringWithfourDigitNumbersToMatrix_ReturnsEquivalentMatrix() {
        String inputString = "1 2\n3 4";
        double[][] expected = { { 1.0, 2.0 }, {3.0, 4.0} };
        
        double[][] result = matrixMath.stringToMatrix(inputString);

        assertArrayEquals("The first row is not correct", expected[0], result[0], 0.1);
        assertArrayEquals("The first row is not correct", expected[1], result[1], 0.1);
    }
}
