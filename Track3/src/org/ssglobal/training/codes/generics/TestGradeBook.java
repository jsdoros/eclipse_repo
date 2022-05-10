package org.ssglobal.training.codes.generics;

public class TestGradeBook {

	public static void main(String[] args) {

		GradeBook<Integer> gradeInts = new GradeBook<Integer>();
		gradeInts.addGrade(10);
		gradeInts.addGrade(20);
		gradeInts.addGrade(30);
		
		GradeBook <Double> gradeDoubles = new GradeBook<Double>();
		gradeDoubles.addGrade(89.6);
		gradeDoubles.addGrade(90.6);
		gradeDoubles.addGrade(50.6);
		
		GradeBook <Float> gradeFloat = new GradeBook<Float>();
		gradeFloat.addGrade(89.6F);
		gradeFloat.addGrade(90.6F);
		gradeFloat.addGrade(50.6F);
		
		GradeBook <Number> gradeMixData = new GradeBook<Number>();
		gradeMixData.addGrade(50);
		gradeMixData.addGrade(90.6F);
		gradeMixData.addGrade(10.5);

	}

}
