package com.assignment.lab;

import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;

import org.junit.Test;

public class TestEuroToDollar {

	EuroChecker cv = new EuroChecker();
	Double d = cv.CVol(3.0);
	Double defVal =  2.17;
	DecimalFormat f = new DecimalFormat("##.00");
	String result = f.format(d);
	Double ccm = Double.parseDouble(result);

	
	@Test
	public void testheight() {
		System.out.println("@Test euro(): " + defVal + " = " + ccm);
		assertEquals(defVal, ccm);
	}


}
