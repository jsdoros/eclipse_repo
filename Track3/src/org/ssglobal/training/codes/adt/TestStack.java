package org.ssglobal.training.codes.adt;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<>();
		
		stack.push("dog");
		stack.push("cat");
		stack.push("lizard");
		
		System.out.println(stack.peek());
		
		String item1 = stack.pop();
		manageAnimal(item1);
		System.out.println(stack.peek());
		
		String item2 = stack.pop();
		manageAnimal(item2);
		System.out.println(stack.peek());
		
		String item3 = stack.pop();
		manageAnimal(item3);
		System.out.println(stack.peek());
	}
	
	public static void manageAnimal(String animal) {
		System.out.format("Procesing: %s \n", animal);
	}
}
