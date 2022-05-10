package org.ssglobal.training.codes.objects;

import java.time.LocalDate;
import java.util.Properties;

public class TestWord {

	public static void main(String[] args) {

		Word word1 = new Word();
		word1.setWord("I");
		word1.setFrequency(50);
		
		Word word2 = new Word();
		word2.setWord("me");
		word2.setFrequency(50);
		
		if (!word1.equals(word2)) {
			System.out.println("word1 is not equal to word2 in terms of frequency");
		}else {
			System.out.println("word1 is equal to word2 in terms of frequency");
		}
		
		word1 = null; //garbage collection
		word2 = null;
		
		Properties props = new Properties();
		//LocalDate date = new LocalDate();
		LocalDate date = LocalDate.now();

	}
}

class Word{
	
	private String word;
	private Integer frequency; // this is null default
	
	public Word() {
		//declare the no-arg constructor if there is overloading
	}
	// constructor overload coz we want to perform constructor injections
	public Word(String word) {
		this.word = word;
		this.frequency = 0; //autoboxing
	}
	
	public Word (String word, Integer frequency) {
		this.word = word;
		this.frequency = frequency;
	}
	
	public String getWord() {
		return word;	
	}
	public void setWord(String word) {
		this.word = word;
	}
	public Integer getFrequency() {
		return frequency;
	}
	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}
	
	@Override
	public boolean equals(Object obj) {
		Word anotherWord = (Word) obj; // reference casting
		return frequency.equals(anotherWord.getFrequency());
	}
	
	@Override
	protected void finalize() throws Throwable {
		word = null; // dating gawi
		frequency = null;
		super.finalize(); //deprecated na
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
