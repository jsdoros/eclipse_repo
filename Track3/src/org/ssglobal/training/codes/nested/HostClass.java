package org.ssglobal.training.codes.nested;

import java.util.List;

public class HostClass {

	public static double speedLevel = 1000.50;
	protected String company = "77Global";
	float baseSalary = 50000.00F;
	private int headCounts = 800;
	// factory method (s)
	
	
	public void sayHello() {
		
	}
	
	public List<Double> getResult(double x, double y){
		return null;
	}
	
	public static HostClass create() {
		return new HostClass() {
			// hello! i am an anonymous inner class
		};
	}	
}
	
class AccessHost{
		
	public boolean validateHost(HostClass host) {
		return false;
	}
}
