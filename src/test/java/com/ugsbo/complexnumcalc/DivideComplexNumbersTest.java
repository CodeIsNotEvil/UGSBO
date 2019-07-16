package com.ugsbo.complexnumcalc;

import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class DivideComplexNumbersTest {

    @Test
    public void divideTwoComplexNumbersWithoutImaginaryPart() {
        ComplexNumber dividend = new ComplexNumber(Double.valueOf(30), Double.valueOf(0));
        ComplexNumber divisor = new ComplexNumber(Double.valueOf(6), Double.valueOf(0));
        ComplexNumber expected = new ComplexNumber(Double.valueOf(5), Double.valueOf(0));

        ComplexNumber quotient = dividend.divide(divisor);

        assertThat("The quotient is not as expected", quotient, equalTo(expected));
    }

    @Test
    public void divideTwoComplexNumbersWithImaginaryPart() {
        ComplexNumber dividend = new ComplexNumber(Double.valueOf(30), Double.valueOf(28));
        ComplexNumber divisor = new ComplexNumber(Double.valueOf(6), Double.valueOf(2));
        ComplexNumber expected = new ComplexNumber(Double.valueOf(5.9), Double.valueOf(2.7));

        ComplexNumber quotient = dividend.divide(divisor);

        assertThat("The quotient is not as expected", quotient, equalTo(expected));
    }
}