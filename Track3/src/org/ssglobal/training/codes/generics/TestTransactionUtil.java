package org.ssglobal.training.codes.generics;

public class TestTransactionUtil {

	public static void main(String[] args) {
		TransactionUtil<? extends Number> util = new TransactionUtil<Number>();
		util.processAbsValue(-10);
		util.processIntArray(new int[] {1, 2, 3, 4, 5});
	}

}
