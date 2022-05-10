package org.ssglobal.training.codes.test;

public class TestBank {

	public static void main(String[] args) {
		
		BPIBank bpi = new BPIBank();
		bpi.checkAccount(); // overrde muna sa BPIBank class
		bpi.deposit();
		
		
	}

}
