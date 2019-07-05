/**
 * 
 */
package com.ugsbo.IsMyComputerOn;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author christian
 *	Testen der Funktionen "IsMyComputerOn"
 */
public class IstErAn {

    @Test
	public void test() {
		assertTrue("Funktion gibt false zurück? O.o",IsMyComputerOn_App.IstErAn());
	}

}