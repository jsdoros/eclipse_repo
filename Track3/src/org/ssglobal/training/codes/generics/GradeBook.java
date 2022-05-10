package org.ssglobal.training.codes.generics;

public class GradeBook<N> {

	@SuppressWarnings("unchecked")
	private N[] grades = (N[]) new Object[0]; //raw type for instantiation because it is safe
	
	// Do's and don'ts of placeholder types
	// 1. Do not involve them with instantiation.
	// 2. Do not involve them with binary operations.
	// 3. Do not cast them to primitive types.
	
	@SuppressWarnings("unchecked")
	void addGrade(N grade) {
		N[] temp = (N[]) new Object[grades.length +1 ];
		System.arraycopy(grades, 0, temp, 0, grades.length);
		temp[grades.length] = grade;
		grades = null;
		grades = temp;
		temp = null;
	}
}
