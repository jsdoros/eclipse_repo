package org.ssglobal.training.codes.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExceptions {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in);) { // no need to explicitly close
			
			System.out.println("Enter a grade: ");
			double grade = scan.nextDouble();
			double normalVal = 89.00/grade;
			String result = String.valueOf(normalVal);
			System.out.println(result);	
		}catch(ArithmeticException e) { // for the scanner
			System.out.println(e.getMessage());
		}catch(InputMismatchException e) { // for normalVal if grade = 0
			System.out.println(e.getMessage());
		}catch(Exception e) { //generic
			System.out.println(e.getMessage());
		}
		

	}

}
