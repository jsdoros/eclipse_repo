package org.ssglobal.training.codes.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class TestDecimalFormat {

	public static void main(String[] args) {

		int count = 1100;
		long numStars = 48574594L;
		double amount = 23543665868.436346;
		BigInteger numEatingBurger = new BigInteger("12435647568");
		BigDecimal villarCurr = new BigDecimal("213436547658.436657");
		
		//------------Normal makeover of numbers------------------------//
		
		//"#" represents a number every #. Now if the number does not exist, bypass
		// DecimalFormat df = new DecimalFormat("###,###");
		
		//"0" represents a number. Now if the number does not exist, it pads 0
		//DecimalFormat df = new DecimalFormat("000,000");
		
		// Combination
		//DecimalFormat df = new DecimalFormat("###,###.000");
		
		// Combination
		DecimalFormat df = new DecimalFormat("The value is: 000,000.###");
		String countFmt = df.format(count);
		String numStarsFmt = df.format(numStars);
		String amountFmt = df.format(amount);
		String numEatingBurgerFmt = df.format(numEatingBurger);
		String villarCurrFmt = df.format(villarCurr);
		System.out.println(countFmt);
		System.out.println(numStarsFmt);
		System.out.println(amountFmt);
		System.out.println(numEatingBurgerFmt);
		System.out.println(villarCurrFmt);
		
		// Currency
		
		df.applyPattern("$###,###.0000");
		amountFmt = df.format(amount);
		villarCurrFmt = df.format(villarCurr);
		System.out.println(amountFmt);
		System.out.println(villarCurrFmt);
		
		df.applyPattern("\u20B1###,###.0000");
		amountFmt = df.format(amount);
		villarCurrFmt = df.format(villarCurr);
		System.out.println(amountFmt);
		System.out.println(villarCurrFmt);
		
		// Percentage
		float clothing = 0.30F;
		float food = 0.50F;
		float transportation = 0.20F;
		
		df.applyPattern("#%");
		String clothingFmt = df.format(clothing);
		String foodFmt = df.format(food);
		String transpoFmt = df.format(transportation);
		System.out.println(clothingFmt);
		System.out.println(foodFmt);
		System.out.println(transpoFmt);
		
		
	}

}
