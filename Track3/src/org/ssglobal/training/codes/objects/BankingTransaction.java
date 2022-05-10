package org.ssglobal.training.codes.objects;

public class BankingTransaction {

	protected String tokenKey = "1234567";
	
	public void processCheck(Integer checkNum) {
		System.out.format("Check No: %d \n", checkNum);
	}
}

class CheckTransaction extends BankingTransaction{
	
	public String tokenKey = "67890";
	
	@Override
	public void processCheck(Integer checkNum) {
		System.out.format("Processed check: %d \n", checkNum);
	}
	
	public void referenceData() {
		System.out.println(this.tokenKey);
		System.out.println(super.tokenKey);
		this.processCheck(890567);
		super.processCheck(890567);
	}
}
