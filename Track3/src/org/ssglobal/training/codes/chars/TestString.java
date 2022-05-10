package org.ssglobal.training.codes.chars;

public class TestString {

	public static void main(String[] args) {
		CharSequence str1 = new String("I am a string!"); // parang widening
		String str2 = new String("I love Java."); // advisable
		String str3 = "I hate Java"; // not advisable
		String str4 = new String("A"); // pwede single letter, take note of the double quote
		String str5 = null; // special kind of a string
		
		// Convert char to string		
		char[] company = new char[] {'7', '7', 'G', 'l','o','b', 'a', 'l'};
		String companyStr = new String(company);
		System.out.println(companyStr);
		System.out.println(companyStr instanceof String);
		
		// Operations
		
		// Length string
		System.out.println(str1.length());
		
		// String to array convert
		char[] strChar = str2.toCharArray();
		
		// Cases
		String strAllCaps = str2.toUpperCase();
		String str2AllLower = str2.toLowerCase();
		System.out.println(strAllCaps);
		System.out.println(str2AllLower);
		
		// Substring
		String substr1 = str2.substring(2);
		System.out.println(substr1);
		
		String substr2 = str2.substring(2, 6); // endoffset
		System.out.println(substr2);
		
		CharSequence substr3 = str2.subSequence(2, 6);
		System.out.println(substr3);
		
		// Compare
		
		String strData = new String("I LOVE JAVA.");
		System.out.println(str2.equals(strData));
		System.out.println(str2.toLowerCase().equals(strData.toLowerCase()));
		System.out.println(str2.equalsIgnoreCase(strData));
		
		// Checks ASCII values. str2 is heavier.
		
		System.out.println(str2.compareTo(strData) == 0); // 0 if both are bitwise equals
		System.out.println(str2.compareTo(strData)); // 32
		System.out.println(str2.compareTo(strData) > 0); //  true
		System.out.println(str2.compareTo(strData) < 0); // false
		
		// 0 is the baseline in comparing if equal or not equal
		
		
		StringBuilder sb = new StringBuilder("I love Java.");
		System.out.println(str2.contentEquals(sb));
		
		// Traversals
		for (int i = 0; i < str2.length(); i++) {
			System.out.print(str2.charAt(i));
		}
		System.out.println();
		
		for (char lookup : str2.toCharArray()) {
			System.out.print(lookup);
		}
		
		// Index identification
		
		int indexOfL = str2.indexOf('l');
		System.out.println(indexOfL);
		
		int indexOfJava = str2.indexOf("Java");
		System.out.println(indexOfJava);
		
		int indexOfJavaFx = str2.indexOf("JavaFx"); // -1 next invalid index
		System.out.println(indexOfJavaFx);
		
		String city = new String("Calamba Cola City");
		int indexOfC = city.indexOf('C');
		System.out.println(indexOfC);
		
		int lastIndexOfC = city.lastIndexOf('C');
		System.out.println(lastIndexOfC);
		
			
		int countLetterC = 0;
		for(int i = 0; i < city.length(); i++) {

			if ((city.indexOf('C', i)) != -1) {
				System.out.format("Letter C is in indexL %d.\n", city.indexOf('C', i));
				i = city.indexOf('C', i);
				countLetterC++;
			}
			
		}
		System.out.format("The total number of C is: %d.\n", countLetterC);
		
		System.out.println(str2.contains("JavaFx"));
		
		// Stripping leading and trailing whitespaces
		String formFirstName = new String("			Juan Luna		");
		String sanitizedStr = formFirstName.strip();
		System.out.println(formFirstName);
		System.out.println(sanitizedStr);

		String leadingChars = formFirstName.stripLeading();
		System.out.println(leadingChars);
		
		String trailerChars = formFirstName.stripTrailing();
		System.out.println(trailerChars);
		
		// Reg-ex -- gets slow if this becomes complex
		String[] words = str2.split("(love)");
		for (String lookup : words) {
			System.out.println(lookup);
		}
		
		String emailAddress = "sjctrags@gmail.com";
		emailAddress.matches(" ");
		System.out.println(emailAddress.matches("[A-Za-z]{8,20}@(gmail.com)")); //input masking ; TRUE
	
		// Repetition
		// hello * 3 = hellohellohello --> Python
		String repeatILoveJava = str2.repeat(5);
		System.out.println(repeatILoveJava);
		
		// Replacement
		String str2ULove = str2.replace('I', 'U');
		System.out.println(str2ULove);
		
		String str2Python = str2.replace("Java", "Python");
		System.out.println(str2Python);
		
		// Primitive to String Conversion
		int age = 90;
		String ageStr = String.valueOf(age);
		System.out.println(ageStr);
		System.out.println(ageStr instanceof String);
		
		// Join strings
		
		String fname = "Pedro";
		String lastname = "Gil";
		int ageHero = 200;
		
		String profileStr = String.join(" ", fname, lastname, String.valueOf(ageHero));
		System.out.println(profileStr);
		
		// Miscellaneous
		
		//String javaWord = str2; // same address, deliks
		String javaWord = str2.copyValueOf(str2.toCharArray());
		
		System.out.println(str2.endsWith("Java"));
		System.out.println(str2.endsWith("U"));
		
		// Print first letter of every word
		str2.lines().map(s -> s.charAt(0)).forEach(c->{
			System.out.println(c);
		});
		
	
	}
}

