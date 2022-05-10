package org.ssglobal.training.codes.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) {
		
		Properties props = new Properties();
		// Database Configuration
		// username = postgres
		// password = admin2255
		// url = jdbc://postgresql/localhost:5432/sms
		
		Object res1 = props.setProperty("username", "postgres");
		//Object res1a = props.setProperty("username", "jsdoros");
		Object res2 = props.setProperty("password", "admin2255");
		Object res3 = props.setProperty("url", "jdbc://postgresql/localhost:5432/sms");
		//System.out.println(res1); // null kasi wala pang ganitong key-value prior to this
		//System.out.println(res1a); // "postgres" kasi may existing nang value; will override
		//System.out.println(res2);
		//System.out.println(res3);
		
		File file = new File("./src/config/db.properties");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			props.store(fos, "The first properties file ever!");
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
	}

}
