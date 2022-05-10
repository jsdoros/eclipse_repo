package org.ssglobal.training.codes.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Diary {
		
		private String [][] entries = new String [12][32];
		
		public void createEvent(Date date1, Date date2, String str) {
			
			if(date2.before(date1)) {
				System.out.println("Invalid date range");
			}else {
				long duration = date2.getTime() - date1.getTime();
				Calendar temp = new GregorianCalendar();
				temp.setTime(date1);
				for(int i = 0; i < duration; i++) {
					int day = temp.get(Calendar.DATE);
					int month = temp.get(Calendar.MONTH);
					entries[month][day] = str;
					temp.add(Calendar.DATE, 1);
				}
			}
		}
		
		public String printEvent(Date date) {
			Calendar temp = new GregorianCalendar();
			temp.setTime(date);
			int day = temp.get(Calendar.DATE);
			int month = temp.get(Calendar.MONTH);
			return entries[month][day];
		}
}
