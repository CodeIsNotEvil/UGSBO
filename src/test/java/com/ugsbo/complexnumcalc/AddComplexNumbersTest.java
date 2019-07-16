package com.ugsbo.complexnumcalc;

import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class AddComplexNumbersTest {

    @Test
    public void addingTwoComplexNumbersWithoutImaginaryPart() {
        ComplexNumber firstAddend = new ComplexNumber(Double.valueOf(5), Double.valueOf(0));
        ComplexNumber secoundAddend = new ComplexNumber(Double.valueOf(6), Double.valueOf(0));
        ComplexNumber expected = new ComplexNumber(Double.valueOf(11), Double.valueOf(0));

        ComplexNumber sum = firstAddend.add(secoundAddend);

        assertThat("Dont sum to the sum", sum, equalTo(expected));
    }

    @Test
    public void addingTwoComplexNumbersWithImaginaryPart() {
        ComplexNumber firstAddend = new ComplexNumber(Double.valueOf(5), Double.valueOf(3));
        ComplexNumber secoundAddend = new ComplexNumber(Double.valueOf(6), Double.valueOf(4));
        ComplexNumber expected = new ComplexNumber(Double.valueOf(11), Double.valueOf(7));

        ComplexNumber sum = firstAddend.add(secoundAddend);

        assertThat("Dont sum to the sum", sum, equalTo(expected));
    }
}