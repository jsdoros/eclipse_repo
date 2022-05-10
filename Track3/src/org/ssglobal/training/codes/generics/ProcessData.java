package org.ssglobal.training.codes.generics;

public class ProcessData <E extends CharSequence> {

	public void processValue(E data) {
		System.out.println(data);
	}
	
	public String index() {
		return "Hello Extends";
	}
}
