package org.ssglobal.training.codes.exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestCheckedExceptions {

		public static void main(String[] args) {
			
			// checked exception handling
			try {
				FileOutputStream fos = new FileOutputStream("");
				fos.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
			try {
				sdf.parse("2020-10-08");
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
		}
}
