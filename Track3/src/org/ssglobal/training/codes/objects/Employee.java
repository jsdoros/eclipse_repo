package org.ssglobal.training.codes.objects;

public class Employee {

	private static Employee employee = new Employee();
	
	private Employee() {
		System.out.println("The employee instance is created.");
	}
	
	public static Employee create() {
		return employee;
	}
}
