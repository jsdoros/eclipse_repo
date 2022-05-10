package org.ssglobal.training.codes.threads;

public class TestSynchronizedMethod {

	public static void main(String[] args) {
		Thread printer1 = new MessagePrinter();
		Thread printer2 = new MessagePrinter();
		Thread printer3 = new MessagePrinter();
		
		printer1.start();
		printer2.start();
		printer3.start();
	}

	// Resource
	private static String[] message = new String[] {"I", "Love", "Java", "."};
	
	public static class ManageMessage{
		
		public synchronized static void print() {
			for(String m: message) {
				System.out.println(m);
				
				try{
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
	
	public static class MessagePrinter extends Thread{
		
		@Override
		public void run() {
			ManageMessage mm = new ManageMessage();
			mm.print();

		}
	}
}
