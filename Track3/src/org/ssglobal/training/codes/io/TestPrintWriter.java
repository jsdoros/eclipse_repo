package org.ssglobal.training.codes.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestPrintWriter {

	public static void main(String[] args) {

		File file = new File("./src/config/poem.txt");
		Scanner scan = new Scanner(System.in);
		
		try {
			FileWriter fw = new FileWriter(file); // pang-open lang ng IO Exception
			PrintWriter pw = new PrintWriter(fw);
			
			while (true) {
				System.out.println("Enter any message");
				String message = scan.nextLine();
				//String messageLine = String.join("", message, "\n"); //---approach1---
				
				if(message.length() == 0) {
					break;
				}
				
				//pw.write(messageLine);  //---approach1---
				//pw.println(message);	  //---approach2---
				pw.format("Message is: %s \n", message); //---approach3--- purpose of \n: continuous create
			}
			
			pw.flush(); // use format
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		scan.close();
	}

}
