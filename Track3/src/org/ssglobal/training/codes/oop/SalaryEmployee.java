package org.ssglobal.training.codes.oop;

public class SalaryEmployee extends Employee implements IRegularContract, ISupervisorContract{
	
	private float weekly;

	public float getWeekly() {
		return weekly;
	}

	public void setWeekly(float weekly) {
		this.weekly = weekly;
	}

	@Override
	public float calculateWeeklyPay() {
		return weekly;
	}

	@Override
	public void applySickLeave() {}

	@Override
	public void applyVacationLeave() {}

	@Override
	public void applyBirthdayLeave() {}

	@Override
	public void resignContract() {}

	@Override
	public void rollOutTasks() {}

	@Override
	public void checkAttendance() {}

	@Override
	public void manageFieldPeople() {}

}
