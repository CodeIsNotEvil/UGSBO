package com.ugsbo.matrixcalc;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests the funktionality to Transpose a Matix
 */
public class MatrixTransposeTest {

    private MatrixCalcMath matrixMath;

    @Before
    public void setup() {
        matrixMath = new MatrixCalcMath();
    }

    @Test
    public void TransformQuadraticMatrixA_ResultsInQuadraticMatrixC() {
        // A(2,2) => C(2,2)
        double[][] matrixA = { { 1.0, 2.0 }, { 3.0, 4.0 } };
        double[][] matrixC = { { 1.0, 3.0 }, { 2.0, 4.0 } };

        double[][] result = matrixMath.matrixTransponation(matrixA);

        assertArrayEquals("The first row is not correct", matrixC[0], result[0], 0.1);
        assertArrayEquals("The second row is not correct", matrixC[1], result[1], 0.1);
    }

    @Test
    public void Transform2by3MatrixA_ResultsIn3by2MatrixC() {
        // A(2,3) => C(3,2)
        double[][] matrixA = { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 } };
        double[][] matrixC = { { 1.0, 4.0 }, { 2.0, 5.0 }, { 3.0, 6.0 } };

        double[][] result = matrixMath.matrixTransponation(matrixA);

        assertArrayEquals("The first row is not correct", matrixC[0], result[0], 0.1);
        assertArrayEquals("The second row is not correct", matrixC[1], result[1], 0.1);
        assertArrayEquals("The third row is not correct", matrixC[2], result[2], 0.1);
    }

    @Test
    public void Transform1by3MatrixA_ResultsIn3by1MatrixC() {
        // A(1,3) => C(1,3)
        double[][] matrixA = { { 1.0, 2.0, 3.0 } };
        double[][] matrixC = { { 1.0 }, { 2.0 }, { 3.0 } };

        double[][] result = matrixMath.matrixTransponation(matrixA);

        assertArrayEquals("The first row is not correct", matrixC[0], result[0], 0.1);
        assertArrayEquals("The second row is not correct", matrixC[1], result[1], 0.1);
        assertArrayEquals("The third row is not correct", matrixC[2], result[2], 0.1);
    }
}
