package com.ugsbo.spike;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test that Only tests the the expected funktionallity of JUnit.
 */
public class JUnitSetupTest {
    /**
     * This Test only tests that the assertTrue funktion works like expected.
     */
    @Test
    public void shouldAlwaysBeTrue() {
        assertTrue("The JUnit setup isn not correct, this test only assertTrue.", true);
    }
}
