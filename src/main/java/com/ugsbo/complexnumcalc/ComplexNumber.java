package com.ugsbo.complexnumcalc;

public class ComplexNumber {
    private Double realPart;
    private Double imaginaryPart;

    /**
     * @param realPart      The real part of the complex Number
     * @param imaginaryPart The imaginary part of the complex Number
     */

    public ComplexNumber(Double realPart, Double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    /**
     * @return the realPart
     */
    public Double getRealPart() {
        return realPart;
    }

    /**
     * @param realPart the realPart to set
     */
    public void setRealPart(Double realPart) {
        this.realPart = realPart;
    }

    /**
     * @return the imaginaryPart
     */
    public Double getImaginaryPart() {
        return imaginaryPart;
    }

    /**
     * @param imaginaryPart the imaginaryPart to set
     */
    public void setImaginaryPart(Double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    /**
     * Checks if the given complex Number is equal to this object.
     * 
     * @param complexNumber The number wich gets compared with this Instance
     * @return True if the complex Numbers are Equal
     */
    public boolean equals(ComplexNumber complexNumber) {
        if (this.realPart.equals(complexNumber.realPart) && this.imaginaryPart.equals(complexNumber.imaginaryPart)) {
            return true;
        } else {
            return false;
        }
    }

}