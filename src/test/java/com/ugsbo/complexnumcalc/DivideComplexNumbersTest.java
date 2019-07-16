package com.ugsbo.complexnumcalc;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DivideComplexNumbersTest {

    @Test
    public void divideTwoComplexNumbersWithoutImaginaryPart() {
        ComplexNumber dividend = new ComplexNumber(Double.valueOf(30), Double.valueOf(0));
        ComplexNumber divisor = new ComplexNumber(Double.valueOf(6), Double.valueOf(0));
        ComplexNumber expected = new ComplexNumber(Double.valueOf(5), Double.valueOf(0));

        ComplexNumber quotient = dividend.divide(divisor);

        assertTrue("The quotient is not as expected", quotient.equals(expected));
    }

    @Test
    public void divideTwoComplexNumbersWithImaginaryPart() {
        ComplexNumber dividend = new ComplexNumber(Double.valueOf(30), Double.valueOf(28));
        ComplexNumber divisor = new ComplexNumber(Double.valueOf(6), Double.valueOf(2));
        ComplexNumber expected = new ComplexNumber(Double.valueOf(5.9), Double.valueOf(2.7));

        ComplexNumber quotient = dividend.divide(divisor);

        assertTrue("The quotient is not as expected", quotient.equals(expected));
    }
}