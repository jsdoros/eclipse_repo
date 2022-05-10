package org.ssglobal.training.codes.objects;

public class Plant {

	public Plant() {
		System.out.println("A plant is created.");
	}
	
	public Plant (String name) {
	 	System.out.println("A plant is created with " + name);
	}
	
	public Plant(int year, String name) {
		System.out.println("A plant is created with " + year + " and name " + name);
	}
}


