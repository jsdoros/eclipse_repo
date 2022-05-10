package org.ssglobal.training.codes.oop;

public interface INewInterface {
	
	// Java 1.5
	public interface SubInterface{
		
	}
	
	public enum Flower { SANTAN, ROSE, GUMAMELA }
	
	// Java 1.8
	
	default public void greet() { //default here is not an access modifier, but an annotation
		// pinilit magkaroon ng methods
		System.out.println("Aloha!");
	}
	
	public static int convertToInt() {
		return 10;
	}
	
	// anotation
	public @interface Sample {
		
	}
	
	// Java 1.9
	
	private double computeMatrix() {
		return 0.0;
	}
	
	private static void accessStaticFiles() {
		
	}
	
	public static void main(String[] args) {
		accessStaticFiles();
		System.out.println("Welcome to the weird intro");
	}

}
