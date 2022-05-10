package org.ssglobal.training.codes.util;

import java.util.StringTokenizer;

public class TestStringTokenizer {

	public static void main(String[] args) {
		String input = "The fox jumps over the window";
		StringTokenizer tokenizer = new StringTokenizer(input, "over");
		String[] tokens = new String[tokenizer.countTokens()];
		int counter = 0;
		while(tokenizer.hasMoreTokens()) { 
			tokens[counter] = tokenizer.nextToken();
			System.out.println(tokens[counter]); // 2 roles: fetches and ++ counter	
			counter++;
		}
		
		/*
		 
		while(tokenizer.hasMoreTokens()) { 
			System.out.println(tokenizer.nextToken()); // will not show kasi exhausted na yung counter
		}
		*/
		
		captureTokens(tokens);
		System.out.println("-------------------------");
		
		String [] words = input.split("(over)");
		for (String lookup: words) {
			System.out.println(lookup);
		}
	}
	
	public static void captureTokens(String[] tokens) {
		for (String lookup: tokens) {
			System.out.println(lookup);
		}
	}

}
