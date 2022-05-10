package org.ssglobal.training.codes.nested;

public abstract class ManagerClass {

	public static double speedLevel = 1000.50;
	protected String company = "77Global"; 
	float baseSalary = 500000.00F;
	private int headCounts = 800;
	
	private void showCounts() {
		
	}
	
	public void referenceData() {
		EmployeeClass ec  = new EmployeeClass();
		
	}
	
	public static class EmployeeClass{
		
		public String name = "Joanna";
		private int zipCode = 5476;
		
		public void referenceData() {
			System.out.println(speedLevel);
		}
	}
	
}
