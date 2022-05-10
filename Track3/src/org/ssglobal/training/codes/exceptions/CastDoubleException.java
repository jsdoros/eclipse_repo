package org.ssglobal.training.codes.exceptions;

public class CastDoubleException extends Exception{

	private String message = "Cannot cast item to double";
	
	@Override
	public String getMessage() {
		return message;
	}
	
	@Override
	public void printStackTrace() {
		System.err.println(message);
	}
}
