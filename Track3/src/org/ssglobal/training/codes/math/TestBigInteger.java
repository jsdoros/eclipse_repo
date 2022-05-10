package org.ssglobal.training.codes.math;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class TestBigInteger {

	public static void main(String[] args) {

		Scanner scanBigInteger = new Scanner(System.in);
		System.out.println("Enter any arbitrary value.");
		BigInteger amount = scanBigInteger.nextBigInteger();
		System.out.println(amount);
		
		Scanner scanBigDecimal = new Scanner(System.in);
		System.out.println("Enter any arbitrary floating-point value.");
		BigDecimal money = scanBigDecimal.nextBigDecimal();
		System.out.println(money);
		
		scanBigInteger.close();
		scanBigDecimal.close();
		
		// -------------Creation of BigInteger---------------- //
		
		// arbitrary number
		BigInteger totalNumberEatingBurger = new BigInteger("8632914632985624089");
		System.out.println(totalNumberEatingBurger);

		// totalNumberEatingBurger = new BigInteger(3274892738923); //immutable
		
		// Formula: totalNumber = totalNumber * 5000000 / 90000000;
		
		BigInteger million = new BigInteger("5000000");
		BigInteger million2 = new BigInteger("90000000");
		
		totalNumberEatingBurger = totalNumberEatingBurger.multiply(million).divide(million2);
		System.out.println(totalNumberEatingBurger);
		
		totalNumberEatingBurger = totalNumberEatingBurger.multiply(new BigInteger("10000000")).divide(new BigInteger("10000000"));
		System.out.println(totalNumberEatingBurger);
		
		BigInteger[] results = totalNumberEatingBurger.multiply(million).divideAndRemainder(million2); // array because you have a QUOTIENT and a REMAINDER
		System.out.format("Quotient: %d \n", results[0]); // 0 -> index of quotient
		System.out.format("Remainder: %d \n", results[1]); // 0 -> index of remainder
	
		// DO NOT USE THESE LONG CONVERTERS!
		long totalNumberEatingBurgerLong = totalNumberEatingBurger.longValueExact(); // if longValue() -> it will return negative kasi lagpas. Risky for banks
		System.out.println(totalNumberEatingBurgerLong);
	}

}
