package org.ssglobal.training.codes.lang;

import java.io.IOException;

public class TestRunTIme {
	
	public static void main(String[] args) {
		// Monitoring of the heap
		// Semi-profiler utility
		
		Runtime rt = Runtime.getRuntime();
		
		System.out.format("The total memory of the heap: %d \n", rt.totalMemory());// heap + stack memory
		System.out.format("The free memory of the heap: %d \n", rt.freeMemory());
		System.out.format("The free max memory of the heap: %d \n", rt.maxMemory());
		
		// Executions
		
		
		/*
		 
		try {
		rt.exec("notepad");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		String[] cmds = new String[2];
		cmds[0] = new String ("notepad.exe");
		cmds[1] = new String ("memo");

		
		try {
			rt.exec(cmds);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			rt.exec("start msedge");
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
	// Hook threads
	// background process (Java-based process)
	rt.addShutdownHook(new WelcomeThread());
	rt.removeShutdownHook(new GoodbyeThread());
	
	// Garbage Collection
		rt.gc();
	}
	
	

}

class WelcomeThread extends Thread{
	
	public void run() {
	System.out.println("Ready for Track 3!");
	}
}

class GoodbyeThread extends Thread{
	
	public void run() {
	System.out.println("Bye for now!");
	}
}
