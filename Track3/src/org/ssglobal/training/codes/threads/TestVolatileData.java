package org.ssglobal.training.codes.threads;

public class TestVolatileData {

	public static void main(String[] args) {

		Thread countListener = new CountListener();
		Thread countMaker = new CounterMaker();
		
		countListener.start();
		countMaker.start();

	}

	// Resource
	private static volatile int counter = 0;
	
	public static class CountListener extends Thread{
		
		@Override
		public void run() {
			int copyCounter = counter;
			while(copyCounter < 10) {
				if (copyCounter != counter) {
					System.out.format("Got counter: %d \n", copyCounter);
					copyCounter = counter;
				}
			}
		}
	}
	
	public static class CounterMaker extends Thread{
		
		@Override
		public void run() {
			
			int copyCounter = counter;
			while(copyCounter < 10) {
				System.out.format("Incremented counter: %d \n", copyCounter + 1);
				counter = ++copyCounter;
				try{
					sleep(1000);
				}catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
