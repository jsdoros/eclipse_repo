package org.ssglobal.training.codes.nested;

public class TestCEOClass {

	public static void main(String[] args) {

		CEOClass ceo = new CEOClass();
		System.out.println(ceo.baseSalary);
		
		// Supervisor class
		
		CEOClass.SupervisorClass sc = ceo.new SupervisorClass();
		
		
		// InnerDefault class
		CEOClass.InnerDefaultClass idc = ceo.new InnerDefaultClass();
		
		
		// InnerProtected
		
		// InnerPrivate

	}

}
