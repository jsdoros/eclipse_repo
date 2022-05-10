package org.ssglobal.training.codes.oop;

public class StatOps extends SumOps {

	private int[] data = new int[] {10, 40, 60, 89, 100};
	
	public double stddev() {
		
		double stddevnumer = 0;
		int sum = getSum(data);
		
		for(int lookup: data) {
			stddevnumer += (Math.pow(lookup-sum, 2));
		}
		getSum(data, "I am an overload");
		return Math.sqrt(stddevnumer/data.length);
	}
	
	// overloaded: getSum(int[]) --> Sum Ops
	
	// overloads
	
	void getSum() {
		System.out.println("hello i am getSum()");
	}
	
	public int getSum(int[] data, int err) {
		int sum = 0;
		for(int lookup : data) {
			sum += lookup;
		}
		return sum - err;
	}
	
	double getSum(int[] data, String label) {
		int sum = 0;
		for (int lookup : data) {
			sum += lookup;
		}
		System.out.println(label);
		return (sum * 1.0);
	}
}