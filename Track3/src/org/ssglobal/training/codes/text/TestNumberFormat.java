package org.ssglobal.training.codes.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class TestNumberFormat {

	public static void main(String[] args) {

		int count = 1100;
		long numStars = 48574594L;
		double amount = 23543665868.436346;
		BigInteger numEatingBurger = new BigInteger("12435647568");
		BigDecimal villarCurr = new BigDecimal("213436547658.436657");
		
		// Typical Make-over (commas)
		NumberFormat nf = NumberFormat.getNumberInstance();
				
		String countFmt = nf.format(count);
		String numStarsFmt = nf.format(numStars);
		String amountFmt = nf.format(amount);
		String numEatingBurgerFmt = nf.format( numEatingBurger);
		String villarCurrFmt = nf.format(villarCurr);
		System.out.println(countFmt);
		System.out.println(numStarsFmt);
		System.out.println(amountFmt);
		System.out.println(numEatingBurger);
		System.out.println(villarCurrFmt);
		
		// Managing the decimal places, rounding mode UP is the default
		nf.setMaximumFractionDigits(3);
		nf.setMaximumFractionDigits(3);
		//nf.setRoundingMode(RoundingMode.FLOOR);
		String amountWithRound = nf.format(amount);
		System.out.println(amountWithRound);
		
		nf.setMaximumFractionDigits(5);
		nf.setRoundingMode(RoundingMode.UP);
		String villarCurrRound = nf.format(villarCurr);
		System.out.println(villarCurrRound);
		
		// Making cast a numeric value
		try {
			nf.setParseIntegerOnly(true); // casts into integer, does not round off
			System.out.println("Enter your salary: (e.g. 8,000.00)");
			Scanner scan = new Scanner(System.in);
			String salary = scan.next();
			Number salaryDbl = nf.parse(salary); // input masking
			System.out.println(salaryDbl);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		NumberFormat nf2 = NumberFormat.getIntegerInstance(); // for integer value makeover only
		NumberFormat nf3 = NumberFormat.getInstance();
		
		// Managing currency (ISO 4217)
		NumberFormat cf = NumberFormat.getCurrencyInstance(); // default: OS currency
		cf.setMaximumFractionDigits(5);
		cf.setMinimumFractionDigits(5);
		cf.setRoundingMode(RoundingMode.CEILING);
		cf.setCurrency(Currency.getInstance(Locale.US)); // Locale."" limited choices
		cf.setCurrency(Currency.getInstance("QAR"));     // Recommended. Set UTF-8
		String villarCurrDollars = cf.format(villarCurr);
		System.out.println(villarCurrDollars);
		
		// Percentage
		float clothing = 0.30F;
		float food = 0.50F;
		float transportation = 0.20F;
		
		NumberFormat pf = NumberFormat.getPercentInstance();
		String clothingFmt = pf.format(clothing);
		String foodFmt = pf.format(food);
		String transpoFmt = pf.format(transportation);
		System.out.println(clothingFmt);
		System.out.println(foodFmt);
		System.out.println(transpoFmt);
		
		
	}

}
