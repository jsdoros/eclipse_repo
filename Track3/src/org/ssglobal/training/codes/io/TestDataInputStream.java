package org.ssglobal.training.codes.io;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestDataInputStream {

	public static void main(String[] args) {

		File file = new File("./src/config/accounts.bin");
		
		try {
			FileInputStream fis = new FileInputStream(file);
			DataInputStream dis = new DataInputStream(fis);
			
			int data = dis.readInt();
			
			while(dis.available() > 0) {  // continuous read as long as may laman yung data
				System.out.println(data);
				data = dis.readInt();
			}
			
			dis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	

	}

}
