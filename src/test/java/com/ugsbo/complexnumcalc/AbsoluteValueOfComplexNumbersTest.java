package com.ugsbo.complexnumcalc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AbsoluteValueOfComplexNumbersTest {

    @Test
    public void TheAbsoluteValueOfAComplexNumberWithOnlyARealPart_IsNotTheAbsoluteValueOfTheRealPart() {
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

    @Test
    public void TheAbsoluteValueOfAComplexNumber_IsNotTheAbsoluteValueOfIt() {
        ComplexNumber complexNumber = new ComplexNumber(Double.valueOf(4), Double.valueOf(3));
        Double expected = Double.valueOf(5);

        Double actual = complexNumber.absolutValueOf();

        assertEquals("The absolute value of an complex number should be the square root of the sum of real " +
        "part times real part and imaginary part times imaginary part ", expected, actual);
    }

    @Test
    public void TheAbsoluteValueOfAComplexNumberWithNegativRealPart_IsNotTheAbsoluteValueOfIt() {
        ComplexNumber complexNumber = new ComplexNumber(Double.valueOf(-4), Double.valueOf(3));
        Double expected = Double.valueOf(5);

        Double actual = complexNumber.absolutValueOf();

        assertEquals("The absolute value of an complex number with negative real part should be the square root of the sum of real " +
        "part times real part and imaginary part times imaginary part ", expected, actual);
    }

    @Test
    public void TheAbsoluteValueOfAComplexNumberWithNegativImaginaryPart_IsNotTheAbsoluteValueOfIt() {
        ComplexNumber complexNumber = new ComplexNumber(Double.valueOf(4), Double.valueOf(-3));
        Double expected = Double.valueOf(5);

        Double actual = complexNumber.absolutValueOf();

        assertEquals("The absolute value of an complex number with negative imaginary part should be the square root of the sum of real " +
        "part times real part and imaginary part times imaginary part ", expected, actual);
    }

    @Test
    public void TheAbsoluteValueOfAComplexNumberWithNegativParts_IsNotTheAbsoluteValueOfIt() {
        ComplexNumber complexNumber = new ComplexNumber(Double.valueOf(-4), Double.valueOf(-3));
        Double expected = Double.valueOf(5);

        Double actual = complexNumber.absolutValueOf();

        assertEquals("The absolute value of an complex number with negative parts should be the square root of the sum of real " +
        "part times real part and imaginary part times imaginary part ", expected, actual);
    }
}