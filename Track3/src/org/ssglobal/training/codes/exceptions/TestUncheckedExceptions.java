package org.ssglobal.training.codes.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestUncheckedExceptions {

	public static void main(String[] args) {
		
		try {
		// quarantine block
		// ArrayIndexOutOfBoundException
		// Scenario case: # elements < index
		int[] values = new int[10];
		System.out.println(values[11]);
		} catch (Exception e) {
			System.err.println(e.getMessage());// recovery block
			System.err.println("The index is invalid.");
			System.err.println(""+null);
		}
		
		/*
		} catch (ArrayIndexOutOfBoundsException e) {
			
		}catch(ArithmeticException e2) {
			
		}catch(Exception e2) {
			
		}
		*/
		
		System.out.println("process algo"); // will not be processed when runtime exception
		Scanner scan = new Scanner (System.in);
		int sum = 0;
		try {
			System.out.println("Enter a number x");
			int x = scan.nextInt();
			System.out.println("Enter a number y");
			int y = scan.nextInt();	
			sum = x + y;
			System.out.println(sum);
		}catch(Exception e) {
			sum = 0;
		}
		System.out.println(sum);
		scan.close();
		
		// NullPointerException
		// scenario case: uninitialized array of String
		
		String[] grades = new String[10];
		try{
			System.out.println(grades[0].length());
		}catch(Exception e) {	
			System.err.println(""+null);
		}
		
		// ArithmeticException
		// scenario case: dividing number w/ zero denominator
		
		/*
		int count = 10;
		int repeat = 0;
		int quotient = 0;
		try {
			 quotient = count/repeat;
		}catch(Exception e) {
			quotient = 0;
		}
		System.out.println(quotient);
		*/
		
		int count = 10;
		int repeat = 0;
		int quotient = 0;
		try {
			 quotient = (int) divide(count, repeat);
		}catch(ArithmeticException e) {
			throw new ArithmeticException();
		}
		System.out.println(quotient);
		
		
		// InputMismatchException
		// Scenario case: input f in nextInt() call
		try {
			askInput();
		}catch(InputMismatchException e) {
			throw new InputMismatchException();
		}catch(Exception e) {
			
		}

	}
	
	
		// Step1: Create a typical method (void/func)
		// Step2: Add throws exception and list the exceptions to throw
		// Step3: Apply try-catch to the process
	public static void askInput() throws InputMismatchException, Exception {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		try {
			System.out.println("Enter a number x");
			int x = scan.nextInt();
			System.out.println("Enter a number y");
			int y = scan.nextInt();	
			sum = x + y;
			System.out.println(sum);
		}catch(InputMismatchException e) {
			throw new InputMismatchException();
		} finally {
			System.out.println(sum);
		}
			
	}
	
	public static double divide (int numer, int denom) throws ArithmeticException{
	
		if(denom == 0) {
			throw new ArithmeticException();
		}
		return 0;
	}
}
