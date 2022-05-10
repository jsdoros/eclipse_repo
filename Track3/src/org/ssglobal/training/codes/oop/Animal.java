package org.ssglobal.training.codes.oop;

public abstract class Animal extends LivingThings {

	public void bowow() {
		
		System.out.println("aw aw aw");
	}
	
	// ought to be overridden
	public abstract void flyHigh();
	
}
