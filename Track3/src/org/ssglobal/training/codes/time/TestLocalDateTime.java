package org.ssglobal.training.codes.time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;

public class TestLocalDateTime {

	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		ZoneId tmz = ZoneId.of("Asia/Manila");
		ZonedDateTime nowWithTmz = ZonedDateTime.of(now, tmz);
		System.out.println(nowWithTmz);
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		LocalDateTime calLocalDate = LocalDateTime.ofInstant(cal.toInstant(),tmz);
		System.out.println(calLocalDate);

	}

}
