package org.ssglobal.training.codes.oop;

import java.text.DecimalFormat;

public class MathOps extends SumOps  {
	
	private int[] data = new int[] {10, 40, 60, 89, 100};

	public int average() {
		return getSum(data) / data.length;
	}
	
	// override
	// overriding method
	public int getSum(int[] mines){
		return 0 ;
	}
	
	// re-implement it
	String formatMoney(double money){
		DecimalFormat df = new DecimalFormat("\u20B1###,###.00");
		return df.format(money);
	}
	
	protected double roundOff(double amount){
		return 0.0;
	}
	
	public void getAbsoluteMean() throws ArithmeticException, Exception{
		
	}
}
