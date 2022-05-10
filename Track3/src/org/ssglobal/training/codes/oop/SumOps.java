package org.ssglobal.training.codes.oop;

public class SumOps { //parent

		// overridden
	public int getSum(int[] data) {
		 
		int sum = 0;
		for(int lookup : data){
			sum += lookup;
		}
		return sum;
	}
	
	String formatMoney(double amount) {
		return"";
	}
	
	protected double roundOff(double amount) {
		return 0.0;
	}
	
	protected void getAbsoluteMean() throws ArithmeticException, Exception{
		
	}
}
