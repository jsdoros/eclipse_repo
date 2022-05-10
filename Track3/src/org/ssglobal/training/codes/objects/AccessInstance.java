package org.ssglobal.training.codes.objects;

public class AccessInstance {
	
	private String dummyStr = "I am the main dummy!";
	
	public void process() {
		
	}

	public void referenceData(String dummyStr) {
		
		System.out.println(dummyStr);
		System.out.println(this.dummyStr);
			
	}
	
	
}
