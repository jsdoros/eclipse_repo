package org.ssglobal.training.codes.objects;

public class TestInjection {

	public static void main(String[] args) {
		// Method Injection
		
		// Involves setters
		
		Word word = new Word();
		word.setWord("he");
		word.setFrequency(100);
		
		// Constructor injection
		Word word2 = new Word ("she", 900);
		Word word3 = new Word ("me");
		// Word word4 = new Word(1000);

	}

}
