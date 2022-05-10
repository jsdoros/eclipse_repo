package org.ssglobal.training.codes.util;

import java.util.Arrays;
import java.util.Comparator;

public class TestArrays {

public static void main(String[] args) {
		
		
		double[] temp = new double[60];
		Arrays.fill(temp,  -1.0);
		
		for(double lookup : temp) {
			System.out.format("%f ", lookup);
		}
		System.out.println();
		
		Double[] grades = new Double[] { 100.00, 90.1, 80.2, 0.3, 60.4, 50.5 };
//		double[] gradesTemp = new double[0]; // dest have mem address
//		System.out.println(gradesTemp.hashCode());
		Double[] gradesTemp = Arrays.copyOf(grades, grades.length);
		for (double lookup : gradesTemp) {
			System.out.format("%f ", lookup);
		}
		System.out.println();

		Double[] gradesTemp2 = Arrays.copyOfRange(grades, 2, 5);
		for (Double lookup : gradesTemp2) {
			System.out.format("%f ", lookup);
		}
		System.out.println();
		// Note: You cannot use binarySearch() if the grades are not sorted
		
		//Arrays.sort(grades);
		//for (double lookup : grades) {
		//	System.out.format("%f ", lookup);
		//}
		//System.out.println();
		
		Arrays.sort(grades, new GradesComparator());
		for(double lookup: grades) {
			System.out.format("%f ", lookup);
		}
		System.out.println();
		
		double grade = 80.2;
		int index = Arrays.binarySearch(grades, grade);
		System.out.println(index);// outputs the index of 80.2 in the sorted array
		
		grade = 90.1;
		index = Arrays.binarySearch(grades, grade);
		System.out.println(index);// outputs the index of 90.1 in the sorted array
		
		grade = 75.0;
		index = Arrays.binarySearch(grades, grade);
		System.out.println(index); // - means it's not in the index, 4 is the offset position
		
		
	}

}

class GradesComparator implements Comparator<Double>{

	@Override
	public int compare(Double o1, Double o2) {
		if (o1.compareTo(o2) == 0) {
			return 0;
		} else if (o1.compareTo(o2) > 0) {
			return -2;
		} else {
		return 2;
		}
	}
	
}
