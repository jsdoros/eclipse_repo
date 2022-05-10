package org.ssglobal.training.codes.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {

	public static void main(String[] args) {
		
		File file = new File("./src/config/poem.txt");
		
		try {
			FileReader fr = new FileReader(file);
			char[] msgBuffer = new char[4021];
			fr.read(msgBuffer);
			System.out.println(msgBuffer);
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
