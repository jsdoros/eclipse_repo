package org.ssglobal.training.codes.oop;

public class HourlyEmployee extends Employee implements IJobOrderContract{
	
	private float payRate;
	private float hoursWorked;	
	
	public float getPayRate() {
		return payRate;
	}



	public void setPayRate(float payRate) {
		this.payRate = payRate;
	}



	public float getHoursWorked() {
		return hoursWorked;
	}



	public void setHoursWorked(float hoursWorked) {
		this.hoursWorked = hoursWorked;
	}



	@Override
	public float calculateWeeklyPay() {
		return payRate*hoursWorked;
	}



	@Override
	public void terminateContract() {}



	@Override
	public void applyExtension() {}

}
