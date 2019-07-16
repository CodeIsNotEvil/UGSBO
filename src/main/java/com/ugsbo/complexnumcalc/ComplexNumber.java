package com.ugsbo.complexnumcalc;

public class ComplexNumber {
    private int realPart;
    private int imaginaryPart;

    /**
     * @param realPart The real part of the complex Number
     * @param imaginaryPart The imaginary part of the complex Number
     */

    public ComplexNumber(int realPart, int imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    /**
     * @return the realPart
     */
    public int getRealPart() {
        return realPart;
    }

    /**
     * @param realPart the realPart to set
     */
    public void setRealPart(int realPart) {
        this.realPart = realPart;
    }

    /**
     * @return the imaginaryPart
     */
    public int getImaginaryPart() {
        return imaginaryPart;
    }

    /**
     * @param imaginaryPart the imaginaryPart to set
     */
    public void setImaginaryPart(int imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }   
    
}