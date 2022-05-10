package org.ssglobal.training.codes.oop;

public class CheckPalindrome {

	public boolean isPalindrome(String input) {
		
		StringBuilder sb  = new StringBuilder(input);
		sb.reverse();
		if (sb.toString().equalsIgnoreCase(input)) {
			return true;
		}
		return false;
	}
}
