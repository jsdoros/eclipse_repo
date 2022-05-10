package org.ssglobal.training.codes.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestCollections {

	public static void main(String[] args) {
		
		ArrayList<Double> arrList = new ArrayList<>(Arrays.asList(15.5, 11.5, 12.5, 13.5, 14.5));
		
		Collections.sort(arrList);
		int index = Collections.binarySearch(arrList, 15.5);
		System.out.println(index);
		
		double maxElem = Collections.max(arrList);
		System.out.println(maxElem);
		
		double minElem = Collections.min(arrList);
		System.out.println(minElem);
		
		Collections.shuffle(arrList);
		System.out.println(arrList);
		Collections.shuffle(arrList);
		System.out.println(arrList);
		
		Collections.reverse(arrList);
		System.out.println(arrList);
	}

}
