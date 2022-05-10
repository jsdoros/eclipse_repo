package org.ssglobal.training.codes.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputStream {

	public static void main(String[] args) {
		
		File file = new File("./src/config/poem.txt");
		try {
			FileInputStream fis = new FileInputStream(file);
			byte[] msgBuffer = new byte[4021]; // 4021 is an estimation of the size
			fis.read(msgBuffer);
			System.out.println(new String(msgBuffer));
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
