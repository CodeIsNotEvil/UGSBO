package com.ugsbo.complexnumcalc;

import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class conjugationOfComplexNumbersTest {

    @Test
    public void TheConjugatedComplexNumberOfAComplexNumberWithOnlyARealPartShouldBeTheRealPart_ButItIsNot() { 
        Double realPart = Double.valueOf(4);
        Double imaginaryPart = Double.valueOf(0);
        ComplexNumber complexNumber = new ComplexNumber(realPart, imaginaryPart);
        ComplexNumber expected = new ComplexNumber(realPart, imaginaryPart);
        
        ComplexNumber actual = complexNumber.conjugationOf();

        assertThat("The conjugated complex Number of a complex number with only a real part is the real part", expected, equalTo(actual));
    }

    @Test
    public void TheConjugatedComplexNumberOfAComplexNumberShouldBeTheComplexNumberWithSwapedSignImaginaryPart_ButItIsNot() { 
        Double realPart = Double.valueOf(4);
        Double imaginaryPart = Double.valueOf(5);
        ComplexNumber complexNumber = new ComplexNumber(realPart, imaginaryPart);
        ComplexNumber expected = new ComplexNumber(realPart, -imaginaryPart);
        
        ComplexNumber actual = complexNumber.conjugationOf();

        assertThat("The conjugated complex number of a complex number is the complex number with swaped sign in the imaginary part", expected, equalTo(actual));
    }
}