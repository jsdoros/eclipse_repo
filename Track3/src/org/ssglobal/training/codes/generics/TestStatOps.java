package org.ssglobal.training.codes.generics;

public class TestStatOps {

	public static void main(String[] args) {
		
		StatOps<Integer> so = new StatOps<>();
		Integer[] dataInt = new Integer [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		try {
		System.out.println(so.sum(dataInt));
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		} catch(NullPointerException e) {
			System.err.println(e.getMessage());
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
		
		StatOps<Float> so2 = new StatOps<>();
		Float[] dataFlt = new Float [] {2.2F, 1.1F, 3.3F};
		try {
			System.out.println(so2.sum(dataFlt));
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		} catch(NullPointerException e) {
			System.err.println(e.getMessage());
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
		
		StatOps<Double> so3 = new StatOps<>();
		Double[] dataDbl = new Double [] {2.2, 1.1, 3.3};
		try {
			System.out.println(so3.sum(dataDbl));
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		} catch(NullPointerException e) {
			System.err.println(e.getMessage());
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
