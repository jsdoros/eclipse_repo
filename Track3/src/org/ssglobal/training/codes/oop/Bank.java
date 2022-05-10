package org.ssglobal.training.codes.oop;

public abstract class Bank {

	// attributes
	protected String company;
	protected String address;
	protected int zipcode;
	public static final double RATE = 0.10;
	private String message = " I am a bank";
	
	
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	// properties
	private void computeSecretProfit() {
		
	}
	
	public void index() {
		
	}
	
	public void consolidate() {
		
	}
	
	protected void withdraw() {
		
	}
	
	protected void deposit() {
		
	}
	
	protected void checkAccount() {
		
	}
	
	
}
