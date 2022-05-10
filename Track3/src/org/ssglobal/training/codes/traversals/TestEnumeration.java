package org.ssglobal.training.codes.traversals;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.Vector;

public class TestEnumeration {

	public static void main(String[] args) {

		Vector<Float> fltVector = new Vector<>(Arrays.asList(10.5F, 11.5F, 13.5F));
		Enumeration<Float> enumerator = fltVector.elements();
		while(enumerator.hasMoreElements()) {
			System.out.println(enumerator.nextElement());
		}
		
		//ArrayList<Float> arrList = new ArrayList<>(); // hindi ka-contemporary
		
		Hashtable<Integer, String> map = new Hashtable<>();
		
		StringTokenizer tokenizer = new StringTokenizer("");
		while(tokenizer.hasMoreElements()) {
			System.out.println(tokenizer.nextElement());
		}
		
	}

}
