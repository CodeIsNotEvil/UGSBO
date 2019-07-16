package com.ugsbo.complexnumcalc;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AddComplexNumbersTest {

    @Test
    public void addingTwoComplexNumbersWithoutImaginaryPart() {
        ComplexNumber firstAddend = new ComplexNumber(Double.valueOf(5), Double.valueOf(0));
        ComplexNumber SecoundAddend = new ComplexNumber(Double.valueOf(6), Double.valueOf(0));
        ComplexNumber expected = new ComplexNumber(Double.valueOf(11), Double.valueOf(0));

        ComplexNumber sum = firstAddend.add(SecoundAddend);

        assertTrue("Dont sum to the sum", sum.equals(expected));
    }

    @Test
    public void addingTwoComplexNumbersWithImaginaryPart() {
        ComplexNumber firstAddend = new ComplexNumber(Double.valueOf(5), Double.valueOf(3));
        ComplexNumber SecoundAddend = new ComplexNumber(Double.valueOf(6), Double.valueOf(4));
        ComplexNumber expected = new ComplexNumber(Double.valueOf(11), Double.valueOf(7));

        ComplexNumber sum = firstAddend.add(SecoundAddend);

        assertTrue("Dont sum to the sum", sum.equals(expected));
    }
}