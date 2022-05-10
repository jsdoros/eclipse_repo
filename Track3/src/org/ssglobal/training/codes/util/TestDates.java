package org.ssglobal.training.codes.util;

import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		
		// The date Now()
		Date now = new Date();
		System.out.println(now.toString());
		
		// Custom date
		Date electionDay = new Date(122, 4, 9); // deprecated
		System.out.println(electionDay);
		
		long today = System.currentTimeMillis();
		Date todayDate = new Date(today);
		System.out.println(todayDate);

		// Utilities
		System.out.println(now.getYear());
		now.setMonth(now.getMonth() + 2);
		System.out.println(now);
		
		// Comparison
		Date sonBirthdate = new Date(100, 0, 6);
		Date daughterBirthdate = new Date (102, 4, 10);
		
		System.out.println(sonBirthdate.after(daughterBirthdate));
		System.out.println(sonBirthdate.before(daughterBirthdate));
		System.out.println(sonBirthdate.equals(daughterBirthdate));
	}

}
