package org.ssglobal.training.codes.util;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCalendar {

	public static void main(String[] args) {
		
		// Get date today
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		
		// Calendar from setup
		Calendar electionDay = new GregorianCalendar(2022, 3, 5, 18, 48, 5);
		electionDay.setTimeInMillis(5);
		System.out.println(electionDay);
		
		// Utility operations
		today.add(Calendar.MONTH, 2);
		today.add(Calendar.YEAR, 10);
		today.add(Calendar.DATE, -5);
		System.out.println(today);
		//today.getTime();
		//System.out.println(today);
		
		// will roll back:
		
		electionDay.roll(Calendar.DATE, 10);
		electionDay.roll(Calendar.DATE, 20);
		System.out.println(electionDay);
	}

}
