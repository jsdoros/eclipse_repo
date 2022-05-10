package org.ssglobal.training.codes.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestFileWriter {

	public static void main(String[] args) {
		
		File file = new File("./src/config/poem.txt");
		Scanner scan = new Scanner(System.in);
		
		try {
			FileWriter fw = new FileWriter(file);
			while(true) {
				System.out.println("Enter any message \n");
				String message = scan.nextLine();
				//char[] msgBuffer = message.toCharArray();
				String messageLine = String.join("", message, "\n");
				if (message.length() == 0) {
					break;
				}
				//fw.write(message.toCharArray());
				fw.write(messageLine);
			}
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		scan.close();
	}
}
