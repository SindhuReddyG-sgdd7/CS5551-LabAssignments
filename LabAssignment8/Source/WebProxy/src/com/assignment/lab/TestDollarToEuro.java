package com.assignment.lab;

import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;

import org.junit.Test;

public class TestDollarToEuro {

	
	DollarChecker pc = new DollarChecker();
	Double e = pc.CPer(3.0);
	Double defVal= 1.84;
	DecimalFormat f = new DecimalFormat("##.00");
	String tper = f.format(e);
	Double cps = Double.parseDouble(tper);

	
	@Test
	public void testweight() {
		System.out.println("@Output(): " + defVal + " = " + cps);
		assertEquals(defVal,cps);
	}


	
}
