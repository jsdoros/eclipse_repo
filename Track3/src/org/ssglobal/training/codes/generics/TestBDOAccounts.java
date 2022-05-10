package org.ssglobal.training.codes.generics;

import java.math.BigDecimal;

public class TestBDOAccounts {

	public static void main(String[] args) {
		BDOAccounts bdo = new BDOAccounts();
		try {
			System.out.println(bdo.<BigDecimal>computeInterestCompound(new BigDecimal ("23543645.343"), 5.5, 10));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			System.out.println(bdo.<Float>computeInterestCompound(23543645.343F, 5.5, 10));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
