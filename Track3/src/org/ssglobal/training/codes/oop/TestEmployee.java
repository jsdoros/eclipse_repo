package org.ssglobal.training.codes.oop;

public class TestEmployee {

	public static void main(String[] args) {
		
		// Week1
		HourlyEmployee emp1 = new HourlyEmployee();
		emp1.setPayRate(1000.00F);
		emp1.setHoursWorked(20);
		System.out.println(emp1.calculateWeeklyPay());
		
		SalaryEmployee semp1 = new SalaryEmployee();
		semp1.setWeekly(1000.00F);
		System.out.println(semp1.calculateWeeklyPay());
		
		/* Tell me how to code a snippet that will show
			that emp1 is different from semp1
		*/
		
		System.out.println(semp1 instanceof Employee);
		System.out.println(emp1 instanceof Employee);
		
		System.out.println(semp1 instanceof SalaryEmployee);
		System.out.println(emp1 instanceof HourlyEmployee);
		
		//System.out.println(emp1 instanceof SalaryEmployee); // Polymorphism will fix this
		//System.out.println(semp1 instanceof HourlyEmployee);
		
		System.out.println(semp1 instanceof IRegularContract);
		System.out.println(emp1 instanceof IJobOrderContract);
		System.out.println(semp1 instanceof IJobOrderContract);
		System.out.println(emp1 instanceof IRegularContract);
		
	}

}
