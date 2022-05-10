package org.ssglobal.training.codes.nested;

public class TestMathOp {

	public static void main(String[] args) {
		// Simulate and test addition
		
		MathOp<Integer> addition = new MathOp<>() {
			
			@Override
			public Integer combine(Integer x, Integer y) {
				int xp = x;
				int yp = y;
				return xp + yp;
				//return x + y;
			}
		};
		
		System.out.println(addition.combine(10, 10));
		
		MathOp<String> concat = new MathOp<>(){

			@Override
			public String combine(String x, String y) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		System.out.println(concat.combine("Lovely", "Inner Class"));
			
		}
	}
