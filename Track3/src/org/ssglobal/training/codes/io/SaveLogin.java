package org.ssglobal.training.codes.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveLogin {

	public static void main(String[] args) {
		Login login1 = new Login();
		login1.username = "sjctracgs";
		login1.password = "admin2255";
		
		Login login2 = new Login();
		login2.username = "postgres";
		login2.password = "root";
		
		Login login3 = new Login();
		login3.username = "admin";
		login3.password = "admin";
		
		File file = new File ("./src/config/login.ser");
		
		// Serialization
		try {
			
			FileOutputStream fos = new FileOutputStream("./src/config/login.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			// Before you save these objects, bes sure to sanitize the objects.
			oos.writeObject(login1);
			oos.writeObject(login2);
			oos.writeObject(login3);
			
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done.");
		
		// De-serialize
		
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Login login = (Login) ois.readObject();
			try {
				while(!(login == null)) {
					System.out.println(login.username);
					login = (Login) ois.readObject();
				}
			} catch (Exception e) {
			}
				
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}