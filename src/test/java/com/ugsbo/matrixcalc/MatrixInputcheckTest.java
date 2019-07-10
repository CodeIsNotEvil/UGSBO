package com.ugsbo.matrixcalc;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests how well worng input can be determent.
 */
public class MatrixInputcheckTest {

    private MatrixCalcController controller;

    @Before
    public void setup() {
        controller = new MatrixCalcController();
    }

    @Test(expected = IllegalArgumentException.class)
    public void inputEmptySouldThrowAIllegalArgumentException() {
        String input = "";

        controller.checkInput(input);
    }

    @Test
    public void checkIfA1by3MatrixIsValidInput() {
        String input = "1 2 3";

        boolean result = controller.checkInput(input);

        assertTrue("The 1 by 3 Matrix should be Matched as valid input.", result);
    }

    @Test
    public void checkIfA2by3MatrixIsValidInput() {
        String input = "1 2 3\n1 2 3";

        boolean result = controller.checkInput(input);

        assertTrue("The 2 by 3 Matrix should be Matched as valid input.", result);
    }

    @Test
    public void checkIfA3by3MatrixIsValidInput() {
        String input = "1 2 3\n1 2 3\n1 2 3";

        boolean result = controller.checkInput(input);

        assertTrue("The 3 by 3 Matrix should be Matched as valid input.", result);
    }
}