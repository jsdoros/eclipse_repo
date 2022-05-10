package org.ssglobal.training.codes.oop;

public class TestBanks {

	public static void main(String[] args) {
		BPIBank bpi = new BPIBank();
		System.out.println(bpi.getMessage());
		bpi.setMessage("Let's loot the bank!");
		System.out.println(bpi.getMessage());

		// Bank bank = new Bank(); // ?? specific bank?
	}

}
