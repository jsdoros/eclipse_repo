package org.ssglobal.training.codes.threads;

public class TestYield {

	public static void main(String[] args) {

		Thread worker1 = new YieldedThread();
		Thread worker2 = new YieldedThread();
		Thread worker3 = new YieldedThread();
		
		worker1.start();
		worker2.start();
		worker3.start();

	}

	public static class YieldedThread extends Thread{
		
		@Override
		public void run() {
			System.out.println("1" + Thread.currentThread());
			yield();
			System.out.println("2" + Thread.currentThread());
			yield();
		}
	}
}
