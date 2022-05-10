package org.ssglobal.training.codes.threads;

public class TestWork {

	public static void main(String[] args) {

		// original
		//Worker1 worker1 = new Worker1("Jose");
		//Worker2 worker2 = new Worker2();
		//Mathematician mathematician = new Mathematician("Joan", 3, 5);
		
		// shadowing, para di na lumabas yung methods ng thread classes
		Thread worker1 = new Worker1("Jose"); // begin state
		Thread worker2 = new Worker2();
		//Thread mathematician = new Mathematician("Joan", 3, 5);
		
		
		Runnable mathTask = new MathTask(10, 20);
		Thread worker3 = new Thread(mathTask, "Newton");
		//worker3.setPriority(1);
		
		MatrixTask matrixTask = new MatrixTask(
				new double[][] { {1.1, 2.2, 3.3}, {4.4, 5.5, 6.6}, {7.7, 8.8, 9.9}}, 10, 0);
		Thread worker4 = new Thread(matrixTask, "Einstein");
		
		// multi-threading/simultaneous
		
		try {
			worker1.start();
			worker1.join();
			worker3.start();
			worker3.join();
			worker4.start();
			worker4.join();
			worker2.start();
			worker2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (double row[] : matrixTask.getResult()) {
			for (double col: row) {
				System.out.format("%f", col);
			}
			System.out.println();
		}
		
		//mathematician.start();
		System.out.println("done main task");
	}

}
class Worker1 extends Thread{
	
	public Worker1(String name) {
		setName(name);
		System.out.println(getState());
		System.out.println(currentThread().getName());
		//setPriority(3);
	}
	
	@Override
	public void run() {
		
		printThreadDetails();
		execMainTask();
		sum();
		avg();
		
		//yield();
		
		System.out.println("done task1");
	}
	
	public void printThreadDetails() {
		System.out.println(currentThread().getId());
		System.out.println(currentThread().getName());
		System.out.println(currentThread().getPriority());
		System.out.println(currentThread().getState());
	}
	
	public void sum() {
		
	}
	
	public void avg() {
		
	}
	
	public void execMainTask() {
		Work work1 = new Work();
		work1.executeTask("Task1");
	}
}

class Worker2 extends Thread{
	
	public Worker2() {
		//setPriority(2);
	}
	@Override
	public void run() {
		Work work2 = new Work();
		work2.executeTask("Task2");
		System.out.println("done task2");
		
		//yield();
	}
}

class MathTask implements Runnable{ // Mathematician
	
	//private String name;
	private Integer x;
	private Integer y;
	
	public MathTask(Integer x, Integer y) {
		
		this.x = x;
		this.y = y;
		//this.name = name;
		//setName(name);
		
	}
	
	@Override
	public void run() {
		
		
		System.out.println(Thread.currentThread().getName());
		MathOp math = new MathOp();
		System.out.format("The sum is %d \n", math.sum(x.intValue(), y.intValue()));
		
		try{
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		//Thread.yield();
	}
}

class MathOp{
	
	public int sum(int x, int y) {
		return x + y;
	}
}

//Execute asynchronous addRowMatrix. Afterwards, let the main thread print the result

class MatrixTask implements Runnable {

	private double[][] matrix;
	private double val;
	private int row;
	private double[][] result;
	
	public double[][] getResult() {
		return result;
	}

	public MatrixTask(double[][] matrix, double val, int row) {
		this.matrix = matrix;
		this.val = val;
		this.row = row;
	}
	
	@Override
	public void run() {
		MatrixTransaction mt = new MatrixTransaction();
		result = mt.addRowMatrix(matrix, 0, 0);
	}
}

class MatrixTransaction {

	public double[][] addRowMatrix(double[][] matrix, double val, int row) {

		for (int i = 0; i < matrix[row].length; i++) {
			matrix[row][i] += val;
		}

		return matrix;

	}
}