package org.ssglobal.training.codes.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestCompareVectorArrList {

	public static void main(String[] args) {

		Vector<Double> vector = new Vector<>(Arrays.asList(10.5, 11.5, 12.5, 13.5, 14.5));
		ArrayList<Double> arrList = new ArrayList<>(Arrays.asList(10.5, 11.5, 12.5, 13.5, 14.5));
		
		Enumeration<Double> iterator = vector.elements();
		while(iterator.hasMoreElements()) {
			double temp = iterator.nextElement();
			System.out.println(temp);
			if (temp == 10.5) {
				vector.add(100.00); // wait
			}
		}
		
		System.out.println("------------------------------");
		// HOW TO MAKE ARRAYLIST PERFORM CONCURRENT:
		//List<Double> arrListSync = Collections.synchronizedList(new ArrayList()); // hindi na gumagana
		List<Double> arrListSync = new CopyOnWriteArrayList<Double>(); // hindi sa dulo nag-aadd; concurrent
		arrListSync.addAll(arrList);
		
		Iterator<Double> iterator2 = arrListSync.iterator();
		while(iterator2.hasNext()) {
			double temp = iterator2.next();
			System.out.println(temp);
			if (temp == 10.5) {
				arrListSync.add(100.00);
			}
		}
		System.out.println(arrListSync);
	}

}
