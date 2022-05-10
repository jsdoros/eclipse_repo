package org.ssglobal.training.codes.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {

	public static void main(String[] args) {

		Queue<Double> tasksQueue = new PriorityQueue<>();
		
		// Insert entries
		tasksQueue.offer(45.78);
		tasksQueue.offer(60.80);
		tasksQueue.offer(13.50);
		tasksQueue.offer(42.40);
		tasksQueue.offer(10.10);
		
		// View or Peek
		// no System.out
		// no traversal
		
		System.out.println(tasksQueue.peek());
		
		// Removal
		tasksQueue.poll();
		System.out.println(tasksQueue.peek());
		
		System.out.println(tasksQueue.size());
		System.out.println(tasksQueue.isEmpty());
	}

}
