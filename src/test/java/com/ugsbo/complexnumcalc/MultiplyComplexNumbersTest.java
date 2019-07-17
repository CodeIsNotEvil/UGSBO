package com.ugsbo.complexnumcalc;

import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class MultiplyComplexNumbersTest {

    @Test
    public void multiplyTwoComplexNumbersWithoutImaginaryPart() {
        ComplexNumber firstFaktor = new ComplexNumber(Double.valueOf(5), Double.valueOf(0));
        ComplexNumber secoundFaktor = new ComplexNumber(Double.valueOf(6), Double.valueOf(0));
        ComplexNumber expected = new ComplexNumber(Double.valueOf(30), Double.valueOf(0));

        ComplexNumber product = firstFaktor.multiply(secoundFaktor);

        assertThat("The product is not as expected", product, equalTo(expected));
    }

    @Test
    public void multiplyTwoComplexNumbersWithImaginaryPart() {
        ComplexNumber firstFaktor = new ComplexNumber(Double.valueOf(5), Double.valueOf(3));
        ComplexNumber secoundFaktor = new ComplexNumber(Double.valueOf(6), Double.valueOf(2));
        ComplexNumber expected = new ComplexNumber(Double.valueOf(24.0), Double.valueOf(28.0));

        ComplexNumber product = firstFaktor.multiply(secoundFaktor);

        assertThat("The product is not as expected", product, equalTo(expected));
    }
}