package com.ugsbo.matrixcalc;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests how well worng input can be determent.
 */
public class MatrixIOUtilsTest {

    private MatrixCalcIOUtils util;

    @Before
    public void setup() {
        util = new MatrixCalcIOUtils();
    }

    @Test(expected = IllegalArgumentException.class)
    public void inputEmptySouldThrowAIllegalArgumentException() {
        String input = "";

        util.checkInput(input);
    }

    @Test
    public void checkIfA1by3MatrixIsValidInput() {
        String input = "1 2 3";

        boolean result = util.checkInput(input);

        assertTrue("The 1 by 3 Matrix should be Matched as valid input.", result);
    }

    @Test
    public void checkIfA2by3MatrixIsValidInput() {
        String input = "1 2 3\n1 2 3";

        boolean result = util.checkInput(input);

        assertTrue("The 2 by 3 Matrix should be Matched as valid input.", result);
    }

    @Test
    public void checkIfA3by3MatrixIsValidInput() {
        String input = "1 2 3\n1 2 3\n1 2 3";

        boolean result = util.checkInput(input);

        assertTrue("The 3 by 3 Matrix should be Matched as valid input.", result);
    }

    @Test
    public void StringWithSingleDigitNumbersToMatrix_ReturnsEquivalentMatrix() {
        String inputString = "1";
        double[][] expected = { { 1.0 } };

        double[][] result = util.stringToMatrix(inputString);

        assertArrayEquals("The first row is not correct", expected[0], result[0], 0.1);
    }

    @Test
    public void StringWithfourDigitNumbersToMatrix_ReturnsEquivalentMatrix() {
        String inputString = "1 2\n3 4";
        double[][] expected = { { 1.0, 2.0 }, { 3.0, 4.0 } };

        double[][] result = util.stringToMatrix(inputString);

        assertArrayEquals("The first row is not correct", expected[0], result[0], 0.1);
        assertArrayEquals("The second row is not correct", expected[1], result[1], 0.1);
    }

    @Test
    public void StringWithSixDigitNumbersToMatrix_Returns1by6Matrix() {
        String inputString = "1 2 3 4 5 6";
        double[][] expected = { { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 } };

        double[][] result = util.stringToMatrix(inputString);

        assertArrayEquals("The first row is not correct", expected[0], result[0], 0.1);
    }

    @Test
    public void StringWithSixDigitNumbersToMatrix_Returns2by3Matrix() {
        String inputString = "1 2 3\n4 5 6";
        double[][] expected = { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 } };

        double[][] result = util.stringToMatrix(inputString);

        assertArrayEquals("The first row is not correct", expected[0], result[0], 0.1);
        assertArrayEquals("The second row is not correct", expected[1], result[1], 0.1);
    }

    @Test
    public void StringWithSixDigitNumbersToMatrix_Returns3by2Matrix() {
        String inputString = "1 2\n3 4\n5 6";
        double[][] expected = { { 1.0, 2.0 }, { 3.0, 4.0 }, { 5.0, 6.0 } };

        double[][] result = util.stringToMatrix(inputString);

        assertArrayEquals("The first row is not correct", expected[0], result[0], 0.1);
        assertArrayEquals("The second row is not correct", expected[1], result[1], 0.1);
        assertArrayEquals("The therd row is not correct", expected[2], result[2], 0.1);
    }

    @Test
    public void StringWithNineDigitNumbersToMatrix_Returns3by3Matrix() {
        String inputString = "1 2 3\n4 5 6\n7 8 9";
        double[][] expected = { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 }, { 7.0, 8.0, 9.0 } };

        double[][] result = util.stringToMatrix(inputString);

        assertArrayEquals("The first row is not correct", expected[0], result[0], 0.1);
        assertArrayEquals("The second row is not correct", expected[1], result[1], 0.1);
        assertArrayEquals("The thierd row is not correct", expected[2], result[2], 0.1);
    }

    @Test
    public void convertsArrayToString_SingleNumber() {
        double[][] matrix = { { 1.0 } };
        String expected = "1.0   \n\n";

        String result = util.convertsArrayToStringInOrderToDisplayIt(matrix);

        assertEquals("The Strings do not Match", expected, result);
    }

    @Test
    public void convertsArrayToString_FourNumbersInARow() {
        double[][] matrix = { { 1.0, 2.0, 3.0, 4.0 } };
        String expected = "1.0   2.0   3.0   4.0   \n\n";

        String result = util.convertsArrayToStringInOrderToDisplayIt(matrix);

        assertEquals("The Strings do not Match", expected, result);
    }

    @Test
    public void convertsArrayToString_FourNumbersInTwoRows() {
        double[][] matrix = { { 1.0, 2.0 }, { 3.0, 4.0 } };
        String expected = "1.0   2.0   \n\n3.0   4.0   \n\n";

        String result = util.convertsArrayToStringInOrderToDisplayIt(matrix);

        assertEquals("The Strings do not Match", expected, result);
    }
}