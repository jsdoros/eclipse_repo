package org.ssglobal.training.codes.text;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TestSimpleDateFormat {

	public static void main(String[] args) {
		
		// Baseline sdf
		Date now = new Date();
		Calendar today = Calendar.getInstance();
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		String nowFmt = sdf.format(now);
		String todayFmt = sdf.format(today.getTime());
		System.out.println(nowFmt);
		System.out.println(todayFmt);
		
		sdf.applyPattern("'Today is: '(EEEE) MMMM dd, yyyy"); // need ng single quote for other input
		nowFmt = sdf.format(now);
		todayFmt = sdf.format(today.getTime());
		System.out.println(nowFmt);
		System.out.println(todayFmt);
		
		sdf.applyPattern("hh:mm:ss:SSS a");
		nowFmt = sdf.format(now);
		todayFmt = sdf.format(today.getTime());
		System.out.println(nowFmt);
		System.out.println(todayFmt);
		
		sdf.applyPattern("MMM dd, yyyy (hh:mm:ss) EEEE");
		nowFmt = sdf.format(now);
		todayFmt = sdf.format(today.getTime());
		System.out.println(nowFmt);
		System.out.println(todayFmt);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input birthday (e.g. January 1, 1900");
		String bdayStr = scan.nextLine();
		SimpleDateFormat bdayDf = new SimpleDateFormat("MMMM d, yyyy");
		try {
			Date bday = bdayDf.parse(bdayStr);
			System.out.println(bday);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
