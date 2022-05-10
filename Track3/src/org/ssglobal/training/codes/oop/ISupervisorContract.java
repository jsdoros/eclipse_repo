package org.ssglobal.training.codes.oop;

public interface ISupervisorContract extends ISuperVisorFieldContract{

	void rollOutTasks();
	void checkAttendance();
}

interface ISuperVisorFieldContract{
	
	void manageFieldPeople();
}
