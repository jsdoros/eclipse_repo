package org.ssglobal.training.codes.generics;

public class TestCalculator {

	public static void main(String[] args) {
		
		Calculator<? super Number> calc = new Calculator<>();
		calc.add(5, 5);
		calc.add(10.5F, 1.5F);
		
		Calculator<Double> calc2 = new Calculator<Double>();
		calc2.add(10.5, 10.5);

	}

}
