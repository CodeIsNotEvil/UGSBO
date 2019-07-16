package com.ugsbo.complexnumcalc;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class conjugationOfComplexNumbersTest {

    @Test
    public void TheConjugatedComplexNumberOfAComplexNumberWithOnlyARealPartShouldBeTheRealPart_ButItIsNot() { 
        Double realPart = Double.valueOf(4);
        Double imaginaryPart = Double.valueOf(0);
        ComplexNumber complexNumber = new ComplexNumber(realPart, imaginaryPart);
        ComplexNumber expected = new ComplexNumber(realPart, imaginaryPart);
        
        ComplexNumber actual = complexNumber.conjugationOf();

        assertTrue("TheConjugatedComplexNumberOfAComplexNumberWithOnlyARealPartIsTheRealPart", expected.equals(actual));
        //TODO change equals to equalTo
        //assertThat("TheConjugatedComplexNumberOfAComplexNumberWithOnlyARealPartIsTheRealPart", expected, equalsTo(actual));
    }
}