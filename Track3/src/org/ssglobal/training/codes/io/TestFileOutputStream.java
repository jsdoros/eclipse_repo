package org.ssglobal.training.codes.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestFileOutputStream {

	public static void main(String[] args) {

		File file = new File("./src/config/poem.txt");
		Scanner scan = new Scanner (System.in);
		
		try {
			FileOutputStream fos = new FileOutputStream(file); // composition design pattern
			while(true) {
			System.out.println("Enter a message: ");
			String message = scan.nextLine();	
			String messageLine = String.join("", message, "\n");
			byte[] msgBytes = messageLine.getBytes();
			fos.write(msgBytes);
			if (message.length() == 0) {
				break;
				}
			}
			fos.flush();
			fos.close();
		} catch (FileNotFoundException e) {  // pag mali yung file name
			e.printStackTrace();
		} catch (IOException e) {	// pag nagkamali ng read/write
			e.printStackTrace();
		} 
		
		scan.close();
		}

}
