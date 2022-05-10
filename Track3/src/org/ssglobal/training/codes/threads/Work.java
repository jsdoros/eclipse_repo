package org.ssglobal.training.codes.threads;

public class Work {
	
	public void executeTask (String taskName) {
		for (int i = 0; i < 50; i++) {
			System.out.print(taskName);	
		}
		
		
		try{
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
	}

}