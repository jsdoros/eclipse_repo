package org.ssglobal.training.codes.chars;

public class TestStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("I love Java.");
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb3 = null;
		
		// Operations
		
		// Append = insertion at the end
		sb.append(" And Python also. ");
		sb.append(2022);
		System.out.println(sb);
		
		// ToString() CharSequence Reference Casting
		String sbStr = sb.toString();
		
		// Insert anywhere else
		sb.insert(6, 'd');
		System.out.println(sb);
		
		sb.insert(12, " so much");
		System.out.println(sb);
		
		// Replacement/Update
		
		sb.setCharAt(0, 'U');
		System.out.println(sb);
		
		sb.replace(0, 2, "You ");
		System.out.println(sb);
		
		// Delete
		
		sb.delete(14, 22); 
		System.out.println(sb);
		
		sb.deleteCharAt(8);
		System.out.println(sb); // one index at a time
		
		// Retrieval
		
		int firstLetter = sb.charAt(0);
		int indexJava = sb.indexOf("Java"); // for Strings only
		
		char[] javaValue = new char [10];
		sb.getChars(9, 13, javaValue, 2);
		for (char lookup: javaValue) {
			System.out.print(lookup + " ");
		}
		System.out.println();
		
		CharSequence javaStr = sb.subSequence(9, 13);
		System.out.println(javaStr);
		
		// Reverse
		
		sb.reverse();
		System.out.println(sb);
		
		String str = new String("Hello!");
		str = " ";
		System.out.println(str);
		
		sb.setLength(0);
		sb.append("Yehey!");
		System.out.println(sb);
		
		// toUpper()
		String sbStr2 = sb.toString();
		sbStr = sbStr2.toUpperCase();
		sb.setLength(0);
		sb.append(sb);
	}

}
