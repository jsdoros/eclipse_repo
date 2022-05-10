package org.ssglobal.training.codes.text;

import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestDateTimeFormatter {

	public static void main(String[] args) {

		LocalDate now = LocalDate.now();
		LocalTime myTime = LocalTime.now();
		LocalDateTime today = LocalDateTime.now();
		
		System.out.println(now);
		System.out.println(myTime);
		System.out.println(today);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("MMM dd, yyyy");
		String nowFmt = now.format(fmt1);
		System.out.println(nowFmt);
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("hh:mm:ss a");
		String myTimeFmt = myTime.format(fmt2);
		System.out.println(myTimeFmt);
		
		// Input masking
		Scanner scan = new Scanner(System.in);
		System.out.println("Input birthday (e.g. January 01, 1900)");
		String bdayStr = scan.nextLine();
		DateTimeFormatter bdayDf = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
		LocalDate bday = LocalDate.parse(bdayStr, bdayDf); // (lahat ng nandito, need magcomply dito) before printing
		System.out.println(bday);
		
	}

}
