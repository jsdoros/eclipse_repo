package org.ssglobal.training.codes.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TestThreadPools {

	public static void main(String[] args) {
		GreetTask task1 = new GreetTask();
		//Executor threadProvider = Executors.newSingleThreadExecutor();
		
		ExecutorService threadProvider2 = Executors.newFixedThreadPool(10);
		//threadProvider.execute(task1);
		threadProvider2.execute(task1);
		Future<Integer> result = threadProvider2.submit(new DivideTask(10, 2));
		try {
			Integer val = result.get();
			System.out.format("The q is %d \n", val);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		} catch (ExecutionException e1) {
			e1.printStackTrace();
		}
		
		try {
			threadProvider2.awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		threadProvider2.shutdown();
	}
}


class GreetTask implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Hello World");
		
	}
}

class DivideTask implements Callable<Integer>{
	
	private Integer x;
	private Integer y;
	
	public DivideTask(Integer x, Integer y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public Integer call() throws Exception {
		System.out.println(Thread.currentThread().getName());
		MathDivide md = new MathDivide();
		int o = md.divide(x, y);
		return o;
	}
}

class MathDivide{
	
	public int divide(int x, int y) {
		return x/y;
	}
	
}