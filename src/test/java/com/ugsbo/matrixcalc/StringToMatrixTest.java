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
        assertArrayEquals("The second row is not correct", expected[1], result[1], 0.1);
    }

    @Test
    public void StringWithSixDigitNumbersToMatrix_Returns1by6Matrix() {
        String inputString = "1 2 3 4 5 6";
        double[][] expected = { { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 } };
        
        double[][] result = matrixMath.stringToMatrix(inputString);

        assertArrayEquals("The first row is not correct", expected[0], result[0], 0.1);
    }
    
    @Test
    public void StringWithSixDigitNumbersToMatrix_Returns2by3Matrix() {
        String inputString = "1 2 3\n4 5 6";
        double[][] expected = { { 1.0, 2.0, 3.0}, { 4.0, 5.0, 6.0 } };
        
        double[][] result = matrixMath.stringToMatrix(inputString);

        assertArrayEquals("The first row is not correct", expected[0], result[0], 0.1);
        assertArrayEquals("The second row is not correct", expected[1], result[1], 0.1);
    }
    
    @Test
    public void StringWithSixDigitNumbersToMatrix_Returns3by2Matrix() {
        String inputString = "1 2\n3 4\n5 6";
        double[][] expected = { { 1.0, 2.0}, { 3.0, 4.0}, { 5.0, 6.0 } };
        
        double[][] result = matrixMath.stringToMatrix(inputString);

        assertArrayEquals("The first row is not correct", expected[0], result[0], 0.1);
        assertArrayEquals("The second row is not correct", expected[1], result[1], 0.1);
        assertArrayEquals("The therd row is not correct", expected[2], result[2], 0.1);
    }
    
    @Test
    public void StringWithNineDigitNumbersToMatrix_Returns3by3Matrix() {
        String inputString = "1 2 3\n4 5 6\n7 8 9";
        double[][] expected = { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 }, { 7.0, 8.0, 9.0 } };
        
        double[][] result = matrixMath.stringToMatrix(inputString);

        assertArrayEquals("The first row is not correct", expected[0], result[0], 0.1);
        assertArrayEquals("The second row is not correct", expected[1], result[1], 0.1);
        assertArrayEquals("The thierd row is not correct", expected[2], result[2], 0.1);
    }
}
