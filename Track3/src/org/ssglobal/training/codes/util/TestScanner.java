package org.ssglobal.training.codes.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		// Reading File
		File file = new File("./src/config/names.txt");
		try {
			Scanner scan = new Scanner(file);
			while(scan.hasNext()) {
				System.out.println(scan.next());
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 								
		
		// Input keyboard
		Scanner scanKey = new Scanner(System.in);
		System.out.println("Input a name:");
		String name = scanKey.next();
		System.out.println(name);
		
		
		Scanner scanKeyLine = new Scanner(System.in);
		System.out.println("Input a book title.");
		String title = scanKeyLine.nextLine();
		System.out.println(title);
		
		
		Scanner scanKeyInt = new Scanner(System.in);
		System.out.println("Input age:");
		int age = scanKeyInt.nextInt();
		System.out.println(age);
		
		
		Scanner scanKeyFloat = new Scanner(System.in);
		System.out.println("Input salary:");
		float salary = scanKeyFloat.nextFloat();
		System.out.println(salary);
		
		// Special Methods
		System.out.println("Enter any string.");
		scanKeyLine.tokens().map(str -> str.toUpperCase()).forEach(str ->{
			System.out.println(str);
		});	
		
		// Special Methods
		
		scanKeyFloat.close();
		scanKey.close();
		scanKeyLine.close();
		scanKeyInt.close();
	}

}
