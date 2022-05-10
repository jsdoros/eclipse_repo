package org.ssglobal.training.codes.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestGetProperties {

	public static void main(String[] args) {
		
		// Scenario: You know the keys.
		Properties props = new Properties(); // clean slate
		
		File file = new File("./src/config/db.properties");
		try {
			FileInputStream fis = new FileInputStream(file);
			props.load(fis);
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(props.getProperty("username"));
		System.out.println(props.getProperty("password"));
		System.out.println(props.getProperty("url"));
		
		// Scenario: You do not know the keys.
		
		props.list(System.out);
	}

}
