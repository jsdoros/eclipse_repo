package org.ssglobal.training.codes.lang;

import java.io.IOException;

public class TestSystem {

	public static void main(String[] args) {
		
		// Input and Output
		
		
		// OutputBuffer Methods
		System.out.println("Hello APIs");
		System.out.format("Welcome APIs!");
		String name = new String("Juan Luna");
		int age = 300;
		double salary = 8000.00;
		System.out.format("The age of %s is %d with a %.3f . \n", name, age, salary);
		System.out.println("End");
		System.out.printf("The age of %s is %d with a %.3f . \n", name, age, salary);
		System.out.print("End \n");
		
		// InputBuffer Methods
		System.out.println("Please input name: ");
		
		/* 
		 try {
			char myname = (char) System.in.read();
			System.out.println(myname);
		} catch (IOException e) {
			System.err.println("Invalid input");
		}
		
		*/
		
		/*
		
		byte[] myname = new byte[4200]; // 4 MB estimate 4200
		try {
			System.in.read(myname); // CR or Enter
			String mynameStr = new String(myname);
			System.out.println(mynameStr);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		*/
		
		// Machine Details Retrieval
		
		System.getProperties().list(System.out);
		
		// Running-time estimates
		long before = System.currentTimeMillis(); // Date in long format
		for (int i = 0; i < 10000; i++) {
			System.out.println();
		}
		
		long elapsed = System.currentTimeMillis() - before;
		System.err.println(elapsed); // seconds
		
		GradeBook gb = new GradeBook();
		gb.addGrade(89.5);
		gb.printGrades();
		gb.addGrade(66.3);
		gb.printGrades();
		gb.addGrade(100);
		gb.printGrades();
		
		// Garbage Collection
		System.gc();
		
		// Error Buffer
		try {
		int[] arrData = new int[] {1, 2, 3, 5};
		arrData[6] = 10;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("undefined cell");
		}

	}
	
	
}

class GradeBook{
	
	private double[] grades = new double[0]; // ???
	
	void addGrade(double grade) {
		double[] temp = new double[grades.length + 1];
		System.arraycopy(grades, 0, temp, 0, grades.length); // for loop
		temp[grades.length] = grade;
		grades = null;
		grades = temp;
		temp = null;
	}
	
	public void printGrades() {
		for (double g : grades) {
			System.out.print(g + ",");
		}
		System.out.println();
	}
		
}
