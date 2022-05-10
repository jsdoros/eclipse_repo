package org.ssglobal.training.codes.math;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public class TestBigDecimal {

	public static void main(String[] args) {
		
		BigDecimal currVal = new BigDecimal("42664587695.4366547658");
		System.out.println(currVal);
		
		BigInteger amount = new BigInteger("42643647658");
		BigDecimal amountConverted = new BigDecimal(amount);
		// currVal = currVal * amount / 900000;
		BigDecimal millionBigDecimal = new BigDecimal("2");
		currVal = currVal.multiply(amountConverted).divide(millionBigDecimal);
		
		// UTILITY CLASSES
		
		// Rounding off BigDecimal
		
		BigDecimal currValWithRoundOff = new BigDecimal("21432056730689037.2380652406",
										 new MathContext(3, RoundingMode.UP));
		System.out.println(currValWithRoundOff);
	}

}