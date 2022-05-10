package org.ssglobal.training.codes.nested;

public class CEOClass {
	
	// all accessible to nested classes
	public static double speedLevel = 1000.50;
	protected String company = "77Global"; 
	float baseSalary = 500000.00F;
	private int headCounts = 800;
	
	private void showCounts() {
		
	}
	
	public void referenceDate() {
		
		SupervisorClass sc = new SupervisorClass();
	}

	public class SupervisorClass{
		
		public String name = "Joanna";
		private int zipCode = 5476;
		
		public void referenceData() {
			System.out.println(speedLevel);
			System.out.println(company);
			System.out.println(baseSalary);
			System.out.println(headCounts);
			showCounts();
		}
	}
	
	class InnerDefaultClass implements Comparable{
		
		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
	
	private static class SuperClass{
		
	}
	
	protected static class InnerProtectedClass extends SuperClass{
		
		public InnerProtectedClass(){
			
		}
		
	}
	
	public interface IApply{
		void sayHello();
	}
	
	private class InnerPrivateClass implements IApply{
		@Override
		public void sayHello() {
			// TODO Auto-generated method stub
			
		}
	}
}
