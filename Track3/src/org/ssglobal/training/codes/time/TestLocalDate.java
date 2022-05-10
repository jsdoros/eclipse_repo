package org.ssglobal.training.codes.time;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class TestLocalDate {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalDate electionDay = LocalDate.of(2022, 5, 9);
		System.out.println(electionDay);
			
		LocalDate xmas = LocalDate.of(2022, Month.DECEMBER, 25);
		System.out.println(xmas);
		
		// sample if galing sa keyboard input
		String bday = "2022-06-10";
		LocalDate bdayLocal = LocalDate.parse(bday);
		System.out.println(bdayLocal);
		
		// UTILITIES
		
		// Comparison
		System.out.println(electionDay.compareTo(bdayLocal) == 0);
		System.out.println(electionDay.equals(bdayLocal));
		System.out.println(electionDay.isAfter(bdayLocal));
		System.out.println(electionDay.isBefore(bdayLocal));
		System.out.println(electionDay.isEqual(bdayLocal));
		
		// Getters
		System.out.println(now.get(ChronoField.DAY_OF_YEAR));
		System.out.println(now.getMonthValue());
		System.out.println(now.getMonth().toString());
		
		System.out.println(now.getDayOfWeek());
		System.out.println(now.getDayOfMonth());
		
		// Julia calendar leap year
		System.out.println(now.isLeapYear());
		
		// Duration in long
		System.out.println(now.isSupported(ChronoUnit.SECONDS)); // can be used in if statements to validated if supported
		System.out.println(electionDay.until(xmas, ChronoUnit.MONTHS)); // pass to future
		System.out.println(electionDay.until(xmas, ChronoUnit.DAYS));
		System.out.println(electionDay.until(xmas, ChronoUnit.WEEKS));
		
		// Mathematical manipulation
		System.out.println(now.plusMonths(3));
		System.out.println(now.plusDays(37));
		
		System.out.println(now.minusDays(80));
		//System.out.println(now.plus(0, null)); // generic na plus, to discuss later
		
		// Setters
		System.out.println(now.with(ChronoField.DAY_OF_MONTH, 30));
		System.out.println(now.with(ChronoField.MONTH_OF_YEAR, 6));
		
		// The Use Period
		
		// Interval
		int numDays = Period.between(bdayLocal, xmas).getDays(); //left = smaller date, right = larger date(future)
		System.out.println(numDays);
		int numMonths = Period.between(bdayLocal, xmas).getMonths();
		System.out.println(numMonths);
		
		// Period Interval
		long numDays2 = ChronoUnit.DAYS.between(bdayLocal, xmas);
		System.out.println(numDays2);
		
		// Creation of Timeframe
		Period padDays = Period.ofDays(10); // Temporal Amount
		
		LocalDate nowBefore = now.minus(padDays);
		LocalDate nowAfter = now.plus(padDays);
		
		Period padWeeks = Period.ofWeeks(5);
		Period customPad = Period.of(4, 3, 6); // complex timeframes
	}
}
