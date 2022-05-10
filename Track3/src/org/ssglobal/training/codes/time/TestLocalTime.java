package org.ssglobal.training.codes.time;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TestLocalTime {

	public static void main(String[] args) {
		
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		LocalTime electionTime = LocalTime.of(13, 30, 25); // 24hr format
		System.out.println(electionTime);
		
		String timeIn = "08:10:30";
		LocalTime timeInLocal = LocalTime.parse(timeIn);
		System.out.println(timeInLocal);

		// Utilities
		System.out.println(now.isSupported(ChronoUnit.HOURS));
		
		// Manipulations
		System.out.println(now.plusHours(10));
		System.out.println(now.minusMinutes(6));
		
		// Duration ---> TemporalAmount
		Duration minutesFrame = Duration.ofMinutes(40);
		
		LocalTime nowBefore = now.minus(minutesFrame);
		System.out.println(nowBefore);
		
		Duration complexTimeFrame = Duration.of(100, ChronoUnit.MINUTES); // (magnitude, time component)
		LocalTime nowAfter = now.plus(complexTimeFrame);
		System.out.println(nowAfter);
	}

}
