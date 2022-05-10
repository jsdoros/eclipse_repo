package org.ssglobal.training.codes.objects;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TestObjectReference {

	public static void main(String[] args) {

		// Reference Widening conversion => implicit casting (UpCasting)
		CharSequence str = (CharSequence) new String("mabuhay"); // small size memory
		System.out.println(str.hashCode());
		// shadowing (str is a string pero methods lang ni CharSequence ang iloload)
		System.out.println(str instanceof String);
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		List<String> arrList = (List<String>) new ArrayList<String>();
		// kahit wala na yung (List<String>)
		
		LinkedList<String> linkedList = new LinkedList<>();
		LinkedList<String> linkedList1 = new LinkedList<>(); // hindi nawala yung ibang methods; nakatago lang
		
		// Reference Narrowing conversion => explicit casting (DownCasting)
		String str2 = (String) str; // point str2 to memory address of str
		// unshadowing; lalabas na uli yung hidden methods
		
		//-----------------------------------------------------
		System.out.println(str2.hashCode());
		
		// Reverse Downcast to Upcast? YES
		String str3 = new String("Mabuhay");
		
		//Upcast
		CharSequence str4 = (CharSequence) str3;
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str4.charAt(i));
		}
		
		String str5 = (String) str4;
		
		//-----------------------------------------------------
		
		HashSet<String> hset = new HashSet<>();
		Set<String> hset2 = (Set<String>) hset;
		HashSet<String> hset3 = (HashSet<String>) hset2;
		
		// Dont's
		// 1. No new keyword
		// 2. Do not use class types not related to the object by inheritance
		
		//StringBuilder sb = (StringBuilder) str //StringBuilder is not an interface of String;
		
		//RazorImage razor = new RazorImage(); // disjointed; ClassCastException
		RazorImage razor = new JpegRazorImage();
		JpegRazorImage razor2 = (JpegRazorImage) razor;
		
	}

}

class RazorImage{
	
	protected int dimension;
	protected String imageFile;
	
	public void showSize() {
		
	}
}

class JpegRazorImage extends RazorImage{
	
	public void printJpeg() {
		
	}
}

class GifRazorImage extends RazorImage{
	
}
