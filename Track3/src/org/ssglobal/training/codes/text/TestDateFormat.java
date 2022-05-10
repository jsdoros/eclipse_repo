package org.ssglobal.training.codes.text;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TestDateFormat {

		public static void main(String[] args) {
			
			// Baseline formatter
			Date now = new Date();
			Calendar today = Calendar.getInstance();
			
			DateFormat df = DateFormat.getInstance();
			String nowFmt = df.format(now);
			String todayFmt = df.format(today.getTime());
			
			System.out.println(nowFmt);
			System.out.println(todayFmt);
			
			DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL);
			nowFmt = df2.format(now);
			todayFmt = df2.format(today.getTime());
			System.out.println(nowFmt);
			System.out.println(todayFmt);
			
			DateFormat df3 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
			nowFmt = df3.format(now);
			todayFmt = df3.format(today.getTime());
			System.out.println(nowFmt);
			System.out.println(todayFmt);
			
			DateFormat df4 = DateFormat.getTimeInstance(DateFormat.MEDIUM);
			nowFmt = df4.format(now);
			todayFmt = df4.format(today.getTime());
			System.out.println(nowFmt);
			System.out.println(todayFmt);
			
			// All date values from form or keyboard in str format
			
			// January 12, 2020
			// 01/12/2020
			// Jan 12, 2020
			// Jan-12-2020
			// 2020-12-2020
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Input birthday (e.g. 1 April 1900)");
			String bdayStr = scan.nextLine();
			DateFormat bdayDf = DateFormat.getDateInstance(DateFormat.LONG);
			try {
				Date bday = bdayDf.parse(bdayStr);
				System.out.println(bday);
			} catch (ParseException e) {
				e.printStackTrace();
			}
					
		}
}
