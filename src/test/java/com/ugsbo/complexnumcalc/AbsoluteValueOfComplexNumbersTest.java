package com.ugsbo.complexnumcalc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AbsoluteValueOfComplexNumbersTest {

    @Test
    public void TheAbsoluteValueOfAComplexNumberWithOnlyARealPart_IsNotTHeAbsoluteValueOfTheRealPart() {
        ComplexNumber complexNumber = new ComplexNumber(Double.valueOf(4), Double.valueOf(0));

        Double expected = Double.valueOf(4);

        Double actual = complexNumber.absolutValueOf();

        assertEquals("The absolute value of an complex number with only an real part should be the absolute value of that real part", expected, actual);
    }

    @Test
    public void TheAbsoluteValueOfAComplexNumberWithOnlyANegativeRealPart_IsNotTheAbsoluteValueOfTheRealPart() {
        ComplexNumber complexNumber = new ComplexNumber(Double.valueOf(-4), Double.valueOf(0));

        Double expected = Double.valueOf(4);

        Double actual = complexNumber.absolutValueOf();

        assertEquals("The absolute value of an complex number with only an negative real part should be the absolute value of that real part", expected, actual);
    }
}