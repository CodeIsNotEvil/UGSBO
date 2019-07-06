package com.ugsbo.matrixcalc;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Tests how well worng input can be determent.
 */
public class MatrixInputcheckTest {

    @Test(expected = IllegalArgumentException.class)
    public void inputEmptySouldThrowAIllegalArgumentException() {
     MatrixCalcController contr = new MatrixCalcController();
     String input = "";

     contr.checkInput(input);
    }

    @Test
    public void checkIfA1by3MatrixIsMatched(){
     MatrixCalcController contr = new MatrixCalcController();
     String input = "1 2 3";

     boolean result = contr.checkInput(input);

     assertTrue("The 1 by 3 Matrix was not Matched but it should be.", result);
    }

    @Test
    public void checkIfA2by3MatrixIsMatched(){
     MatrixCalcController contr = new MatrixCalcController();
     String input = "1 2 3\n1 2 3";

     boolean result = contr.checkInput(input);

     assertTrue("The 2 by 3 Matrix was not Matched but it should be.", result);
    }

    @Test
    public void checkIfA3by3MatrixIsMatched(){
     MatrixCalcController contr = new MatrixCalcController();
     String input = "1 2 3\n1 2 3\n1 2 3";

     boolean result = contr.checkInput(input);

     assertTrue("The 3 by 3 Matrix was not Matched but it should be.", result);
    }
}