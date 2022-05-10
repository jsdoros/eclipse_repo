package org.ssglobal.training.codes.wrappers;

public class Palindrome {
	
	public boolean isPalindrome(String input) {
		StringBuilder sb = new StringBuilder(input);
		sb.reverse();
		return sb.toString().equalsIgnoreCase(input);
	}

}
