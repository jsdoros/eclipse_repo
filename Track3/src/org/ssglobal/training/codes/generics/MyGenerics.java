package org.ssglobal.training.codes.generics;

public class MyGenerics<E> {

	//public Object op1; // raw type
	//public Object op2;
	public E op1;
	public E op2;
	
	@SuppressWarnings("unchecked")
	public E sum() {
		
		if (op1 instanceof Integer && op2 instanceof Integer){
			int op1Primitive = (Integer) op1;
			int op2Primitive = (Integer) op2;
			int sum = op1Primitive + op2Primitive;
			Integer sumInt = sum;
			return (E) sumInt;
			
		}else if (op1 instanceof Double && op2 instanceof Double){
			double op1Primitive = (Double) op1;
			double op2Primitive = (Double) op2;
			double sum = op1Primitive + op2Primitive;
			Double sumInt = sum;
			return (E) sumInt;
		
		}else if (op1 instanceof Float && op2 instanceof Float){
			float op1Primitive = (Float) op1;
			float op2Primitive = (Float) op2;
			float sum = op1Primitive + op2Primitive;
			Float sumInt = sum;
			return (E) sumInt;
			
		}else if (op1 instanceof String && op2 instanceof String){
			String op1Str = (String) op1;
			String op2Str = (String) op2;
			String str = op1Str + op2Str;
			return (E) str;
		}
		return null;
	}
	
	/*
	public int sumInt() {
		Number op1Local = (Number) op1;
		Number op2Local = (Number) op2;
		int op1Primitive = (Integer) op1Local;
		int op2Primitive = (Integer) op2Local;
		return op1Primitive + op2Primitive;
	}
	
	public double sumDouble() {
		Number op1Local = (Number) op1;
		Number op2Local = (Number) op2;
		double op1Primitive = (Integer) op1Local;
		double op2Primitive = (Integer) op2Local;
		return op1Primitive + op2Primitive;
	}
	
	public float sumFloat() {
		Number op1Local = (Number) op1;
		Number op2Local = (Number) op2;
		float op1Primitive = (Integer) op1Local;
		float op2Primitive = (Integer) op2Local;
		return op1Primitive + op2Primitive;
	}
	
	public String concatOps() {
		Integer op1Str = (Integer) op1;
		Integer op2Str = (Integer) op2;
		return String.valueOf(op1Str) + String.valueOf(op2Str);
	}
	*/

}