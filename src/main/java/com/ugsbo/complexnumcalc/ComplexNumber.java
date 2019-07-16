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

    /**
     * Adds two complex Numbers together.
     * 
     * @param addend The complex Number.
     * @return The result of adding the two complex Numbers together, as a conplex
     *         Number.
     */
    public ComplexNumber add(ComplexNumber addend) {
        Double sumRealPart, sumImaginaryPart;

        sumRealPart = this.realPart + addend.realPart;
        sumImaginaryPart = this.imaginaryPart + addend.imaginaryPart;

        ComplexNumber sum = new ComplexNumber(sumRealPart, sumImaginaryPart);

        return sum;
    }

    /**
     * Substracts the Subtrahend form this instance.
     * 
     * @param subtrahend The Number wich will be substracted form the Minuend
     * @return The Differenz of the Minuend and Subtrahend.
     */
    public ComplexNumber substract(ComplexNumber subtrahend) {
        Double differenzRealPart, differenzImaginaryPart;

        differenzRealPart = this.realPart - subtrahend.realPart;
        differenzImaginaryPart = this.imaginaryPart - subtrahend.imaginaryPart;

        ComplexNumber differenz = new ComplexNumber(differenzRealPart, differenzImaginaryPart);

        return differenz;
    }

    /**
     * Multiplies the faktor with this Instance.
     * 
     * @param faktor The ComplexNumber by wich this Instance will get multiplyed
     * @return The product of this Instance and the faktor
     */
    public ComplexNumber multiply(ComplexNumber faktor) {
        Double productRealPart, productImaginaryPart;

        productRealPart = this.realPart * faktor.realPart - this.imaginaryPart * faktor.imaginaryPart;
        productImaginaryPart = this.realPart * faktor.imaginaryPart + this.imaginaryPart * faktor.realPart;

        ComplexNumber product = new ComplexNumber(productRealPart, productImaginaryPart);

        return product;
    }

    /**
     * Divides the dividend by the divisor, the dividend is this Instance.
     * 
     * @param divisor The ComplexNumber by wich this Instance will get divided
     * @return The Qoutient of the Instance and the divisor
     */
    public ComplexNumber divide(ComplexNumber divisor) {
        Double qoutientRealPart, qoutientImaginaryPart, tempDivisor;

        tempDivisor = divisor.realPart * divisor.realPart + divisor.imaginaryPart * divisor.imaginaryPart;
        qoutientRealPart = this.realPart * divisor.realPart + this.imaginaryPart * divisor.imaginaryPart;
        qoutientImaginaryPart = this.imaginaryPart * divisor.realPart - this.realPart * divisor.imaginaryPart;
        qoutientImaginaryPart /= tempDivisor;
        qoutientRealPart /= tempDivisor;

        ComplexNumber qoutient = new ComplexNumber(qoutientRealPart, qoutientImaginaryPart);

        return qoutient;
    }

}