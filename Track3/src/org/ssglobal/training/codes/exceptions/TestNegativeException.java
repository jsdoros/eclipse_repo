package org.ssglobal.training.codes.exceptions;


public class TestNegativeException {

	public static void main(String[] args) {
		
		try {
			int[] data = new int[-2];
			//System.out.println(data[-2]);
		}catch(NegativeArraySizeException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		


	}

}
