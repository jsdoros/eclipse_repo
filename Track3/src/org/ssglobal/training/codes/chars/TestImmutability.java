package org.ssglobal.training.codes.chars;

public class TestImmutability {

	public static void main(String[] args) {
		String name = new String("Juan Luna");
		System.out.println(name.hashCode());
		name = name + "of Manila";
		System.out.println(name.hashCode());
		name = name + ", Philippines";
		System.out.println(name.hashCode());
		name = name.concat(" circa 1890");
		System.out.println(name.hashCode());
		
		String str1 = "Ayala";
		String str2 = "Ayala";
		System.out.println(str1 == str2);
		
		System.out.println("===================");
		
		StringBuilder sb = new StringBuilder("Juan Luna");
		System.out.println(sb.hashCode());
		sb.append(" of Manila");
		System.out.println(sb.hashCode());
		sb.append(", Philippines");
		System.out.println(sb.hashCode());
		sb.append(" circa 1890");
		System.out.println(sb.hashCode());
	}

}
