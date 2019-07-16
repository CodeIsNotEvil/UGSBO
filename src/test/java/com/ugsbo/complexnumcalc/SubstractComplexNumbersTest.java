package com.ugsbo.complexnumcalc;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SubstractComplexNumbersTest {

    @Test
    public void substractTwoComplexNumbersWithoutImaginaryPart() {
        ComplexNumber minuend = new ComplexNumber(Double.valueOf(5), Double.valueOf(0));
        ComplexNumber subtrahend = new ComplexNumber(Double.valueOf(6), Double.valueOf(0));
        ComplexNumber expected = new ComplexNumber(Double.valueOf(-1), Double.valueOf(0));

        ComplexNumber difference = minuend.substract(subtrahend);

        assertTrue("The difference is not as expected", difference.equals(expected));
    }

    @Test
    public void substractTwoComplexNumbersWithImaginaryPart() {
        ComplexNumber minuend = new ComplexNumber(Double.valueOf(5), Double.valueOf(5));
        ComplexNumber subtrahend = new ComplexNumber(Double.valueOf(6), Double.valueOf(4));
        ComplexNumber expected = new ComplexNumber(Double.valueOf(-1), Double.valueOf(1));

        ComplexNumber difference = minuend.substract(subtrahend);

        assertTrue("The difference is not as expected", difference.equals(expected));
    }
}