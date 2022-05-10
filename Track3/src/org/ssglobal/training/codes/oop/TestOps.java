package org.ssglobal.training.codes.oop;

public class TestOps {

	public static void main(String[] args) {

		MathOps math = new MathOps();
		System.out.println(math.average());
		
		StatOps stat = new StatOps();
		System.out.println(stat.stddev());
		
		System.out.println(math instanceof SumOps);
		System.out.println(stat instanceof StatOps);
		System.out.println(stat instanceof SumOps);
		
		String str = new String();
		System.out.println(str instanceof CharSequence);

	}

}
