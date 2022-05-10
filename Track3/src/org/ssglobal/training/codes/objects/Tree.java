package org.ssglobal.training.codes.objects;

public class Tree extends Plant {

	// no-arg constructor
	// convergence - lahat ng chain, ito ang dulo
	public Tree() {
		super(56, "santan"); // kahit di ilagay
		System.out.println("A plant is created.");
	}
	
	// overloaded constructors
	public Tree(int x) {
		this();
		System.out.format("A tree is created with %d. \n", x);
	}
	
	Tree(int x, String name){
		this(x);
		System.out.format("A tree is created with %d and %s. \n", x, name);
	}
	
	private Tree(double x) {
		this();
		System.out.format("A tree is created with %.3f. \n", x);
		
	}
	
	protected Tree(double x, String name) {
		this(x);
		System.out.format("A tree is created with %s. \n", name);
	}
	
	public void referenceDat() {
		//this();
	}
	
	
}
