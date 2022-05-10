package org.ssglobal.training.codes.adt;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;

public class TestQueueADT {

	public static void main(String[] args) {
		
		// SINGLE QUEUE
		
		List<String> arrList = new ArrayList<>();
		arrList.add(null);
		
		Set<String> hashSet = new HashSet<>();
		hashSet.add(null);
		
		Queue<String> queue1 = new ArrayDeque<>();
		//queue1.offer("abba");
		//queue1.offer("ABBa");
		//queue1.offer("ABBA");
		//queue1.offer("abbA");
		
		queue1.add("abba");
		queue1.add("ABBa");
		queue1.add("ABBA");
		queue1.add("abbA");
		//queue1.add(null);
		
		try {
			
		
		
		//System.out.println(queue1.peek());
		System.out.println(queue1.element());
		String item1 = queue1.poll();
		processItem(item1);
		
		//System.out.println(queue1.peek());
		System.out.println(queue1.element());
		String item2 = queue1.poll();
		processItem(item2);
		
		//System.out.println(queue1.peek());
		System.out.println(queue1.element());
		String item3 = queue1.poll();
		processItem(item3);
		
		//System.out.println(queue1.peek());
		System.out.println(queue1.element());
		String item4 = queue1.poll();
		processItem(item4);
		
		//System.out.println(queue1.peek());
		System.out.println(queue1.element());
		String item5 = queue1.poll();
		processItem(item5);
		
		System.out.println(queue1.size());
		System.out.println(queue1.isEmpty());
		}catch(NoSuchElementException e) {
			System.err.println(e.getMessage());
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		
		Queue<String> queue2 = new LinkedList<>();
		queue2.add("abba");
		queue2.add("ABBa");
		queue2.add("ABBA");
		queue2.add("abbA");
		queue2.add(null);
		
		// DOUBLE QUEUE
		
		Deque<String> doubleQueue = new LinkedList<>();
		doubleQueue.offerFirst("Abba");
		doubleQueue.offerLast("ABBA");
		
		System.out.println(doubleQueue.peekFirst());
		System.out.println(doubleQueue.peekLast()); //if wala yung "First"."Last", equivalent to first
		
		System.out.println(doubleQueue.pollFirst());
		System.out.println(doubleQueue.pollLast());
	}

	public static void processItem(String item) {
		System.out.format("Processing: %s \n", item);
		
	}
}
