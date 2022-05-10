package org.ssglobal.training.codes.answers;

import java.util.Scanner;

public class TryDivide {

	public void trapDivide() throws Exception {
		
		try(Scanner scan = new Scanner(System.in);){
		
		while(true) {
			// call numerator
			String numerInput = null;
			try {
				numerInput = askNumeratorInput();
			}catch(Exception e){
				System.err.println(e.getMessage());	
			}
			//exit
			if (numerInput.equalsIgnoreCase("e")) {
				break;
			}
			
			int numer = 0;
			try {
				numer = convertNumerator(numerInput);
			}catch(NumberFormatException e) {
				throw new InvalidNumeratorException();
			} catch (Exception e) {
				throw new Exception();
			}
			
			//call askDenominator
			String denomInput = null;
			try {
				denomInput = askNumeratorInput();
			}catch(Exception e){
				System.err.println(e.getMessage());	
			}
			//exit
			if (numerInput.equalsIgnoreCase("e")) {
				break;
			}
			
			int denom = 0;
			try {
				denom = convertDenominator(denomInput);
			}catch(NumberFormatException e) {
				throw new InvalidDenominatorException();
			} catch (Exception e) {
				throw new Exception();
			}
		
			try {
				int q = computeQuotient(numer, denom);
				System.out.format("Quotient is %d \n", q);
			}catch(ArithmeticException e) {
				System.err.println(e.getMessage());		
			}catch (Exception e) {
				System.err.println(e.getMessage());		
			}
			//computeQuotient()
		}}
	}
	
	private String askNumeratorInput() throws Exception{
		try(Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter numerator or E/e");
			String input = scan.next();
			return input;
		}catch(Exception e) {
			throw new Exception();
		}
	}
	
	private int convertNumerator (String numerInput) throws InvalidNumeratorException, Exception{
		int numerator = 0;
		
		try {
			numerator = Integer.parseInt(numerInput);
			return numerator;
		}catch(NumberFormatException e) {
			throw new InvalidNumeratorException();
		}catch(Exception e) {
			throw new Exception();
		}
	}
	
	private String askDenominatorInput() throws Exception{	
		try(Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter denominator or E/e");
			String input = scan.next();
			return input;
		}catch(Exception e) {
			throw new Exception();
		}
	}
	
	private int convertDenominator (String denomInput) throws InvalidDenominatorException, Exception{
		int denominator = 0;
		
		try {
			denominator = Integer.parseInt(denomInput);
			return denominator;
		}catch(NumberFormatException e) {
			throw new InvalidDenominatorException();
		}catch(Exception e) {
			throw new Exception();
		}
	}
	
	private int computeQuotient(int numer, int denom) throws Exception{	
		if(denom == 0) {
			throw new ArithmeticException("Invalid quotient");
		}
		return 0;
	}
}

class InvalidNumeratorException extends Exception{
	private String message = "Invalid numerator";
	
	@Override
	public String getMessage() {
		return message;
	}
	
	@Override
	public void printStackTrace() {
		System.err.println(message);
	}
}

class InvalidDenominatorException extends Exception{
	private String message = "Invalid denominator";
	
	@Override
	public String getMessage() {
		return message;
	}
	
	@Override
	public void printStackTrace() {
		System.err.println(message);
	}
}