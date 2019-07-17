package com.ugsbo.complexnumcalc;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EqualsComplexNumbersTest {

    @Test
    public void TwoEqualNumbersWithOnlyRealPart_AreNotDetectedAsEqual() {
        ComplexNumber firstNumber = new ComplexNumber(Double.valueOf(5), Double.valueOf(0));
        ComplexNumber secoundNumber = new ComplexNumber(Double.valueOf(5), Double.valueOf(0));

        boolean actual = firstNumber.equals(secoundNumber);

        assertTrue("TwoEqualNumbersShouldBeEqual", actual);
    }

    @Test
    public void TwoNotEqualNumbersWithOnlyRealPart_AreDetectedAsEqual() {
        ComplexNumber firstNumber = new ComplexNumber(Double.valueOf(5), Double.valueOf(0));
        ComplexNumber secoundNumber = new ComplexNumber(Double.valueOf(6), Double.valueOf(0));

        boolean actual = firstNumber.equals(secoundNumber);

        assertFalse("TwoNotEqualNumbersShouldNotBeEqual", actual);
    }

    @Test
    public void TwoEqualNumbersWithOnlyImaginaryPart_AreNotDetectedAsEqual() {
        ComplexNumber firstNumber = new ComplexNumber(Double.valueOf(0), Double.valueOf(5));
        ComplexNumber secoundNumber = new ComplexNumber(Double.valueOf(0), Double.valueOf(5));

        boolean actual = firstNumber.equals(secoundNumber);

        assertTrue("TwoEqualComplexNumbersShouldBeEqual", actual);
    }

    @Test
    public void TwoNotEqualNumbersWithOnlyImaginaryPart_AreDetectedAsEqual() {
        ComplexNumber firstNumber = new ComplexNumber(Double.valueOf(0), Double.valueOf(5));
        ComplexNumber secoundNumber = new ComplexNumber(Double.valueOf(0), Double.valueOf(6));

        boolean actual = firstNumber.equals(secoundNumber);

        assertFalse("TwoNotEqualComplexNumbersShouldNotBeEqual", actual);
    }

    @Test
    public void TwoEqualComplexNumbers_AreNotDetectedAsEqual() {
        ComplexNumber firstNumber = new ComplexNumber(Double.valueOf(5), Double.valueOf(5));
        ComplexNumber secoundNumber = new ComplexNumber(Double.valueOf(5), Double.valueOf(5));

        boolean actual = firstNumber.equals(secoundNumber);

        assertTrue("TwoEqualComplexNumbersShouldBeEqual", actual);
    }

    @Test
    public void TwoNotEqualComplexNumbers_AreDetectedAsEqual() {
        ComplexNumber firstNumber = new ComplexNumber(Double.valueOf(5), Double.valueOf(5));
        ComplexNumber secoundNumber = new ComplexNumber(Double.valueOf(6), Double.valueOf(6));

        boolean actual = firstNumber.equals(secoundNumber);

        assertFalse("TwoNotEqualComplexNumbersShouldNotBeEqual", actual);
    }
}