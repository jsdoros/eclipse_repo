package org.ssglobal.training.codes.answers;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class WorkCalendar {

	private Map<Integer, Appointment> calendar = new LinkedHashMap<>();
	
}

class Appointment{
	
	private LocalDate appointmentDate;
	private String visitor;
	private String concern;
}
