package org.ssglobal.training.codes.generics;

public class TestMyGenerics {

	public static void main(String[] args) {
		
		//MyGenerics mg = new MyGenerics();
		MyGenerics<Integer> mg = new MyGenerics<Integer>();
		mg.op1 = 10;
		mg.op2 = 20;
		System.out.println(mg.sum());
		
		MyGenerics<Double> mg2 = new MyGenerics<Double>();
		mg2.op1 = 67.8;
		mg2.op2 = 89.00;
		System.out.println(mg2.sum());
		
		MyGenerics<String> mg3 = new MyGenerics<String>();
		mg3.op1 = "One";
		mg3.op2 = "Two";	
		System.out.println(mg3.sum());
		
		/*
		System.out.println(mg.sumInt());
		System.out.println(mg.sumDouble());
		System.out.println(mg.sumFloat());
		System.out.println(mg.concatOps());
		*/
	}

}
