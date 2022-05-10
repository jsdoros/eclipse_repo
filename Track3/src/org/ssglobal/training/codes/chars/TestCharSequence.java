package org.ssglobal.training.codes.chars;

public class TestCharSequence {

	public static void main(String[] args) {
		CharSequence cs = new String("I am a String");
		CharSequence cs2 = new StringBuilder ("I am a StringBuilder!");
		CharSequence cs3 = new StringBuffer ("I am a StringBuffer!");
		
		System.out.println(cs);
		System.out.println(cs2);
		System.out.println(cs3);
	
		System.out.println(cs instanceof CharSequence);
		System.out.println(cs2 instanceof CharSequence);
		System.out.println(cs3 instanceof CharSequence);
		
		System.out.println(cs instanceof String);
		System.out.println(cs2 instanceof String);
		System.out.println(cs3 instanceof String);
		
		String str1 = new String ("I am a full-fledged");
		//System.out.println(str1 instanceof System);  --> syntax error; will not give you false
		

	}

}
