package org.ssglobal.training.codes.util;

import java.util.Date;

public class TestDiary {

	public static void main(String[] args) {
		Diary diary = new Diary();
		
		Date start = new Date (122, 4, 1);
		Date end = new Date (122, 4, 10);
		String event = "Jango Project Training";
		diary.createEvent(start, end, event);
		
		System.out.println(diary.printEvent(new Date(122,3,2)));
			
	}

}
