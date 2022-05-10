package org.ssglobal.training.codes.objects;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee emp1 = Employee.create();
		System.out.println(emp1.hashCode());
		Employee emp2 = Employee.create();
		System.out.println(emp2.hashCode());
		Employee emp3 = Employee.create();
		System.out.println(emp3.hashCode());
	}

}
