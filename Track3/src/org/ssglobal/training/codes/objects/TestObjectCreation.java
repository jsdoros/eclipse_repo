package org.ssglobal.training.codes.objects;

public class TestObjectCreation {

	public static void main(String[] args) {
		Supply s1 = new Supply();
		s1 = null;
		
		BDOAccount ann = new BDOAccount();
		BDOAccount mark = new BDOAccount();

	}

}

class Supply{
	
	public Supply() {
		System.out.println("Supply instance is created"); // constructor's sole purpose is to initialize
	}
	
}

abstract interface Account{
	
	public void withdraw();
}

abstract interface SavingAccount extends Account{
	public void cashDeposit();
}

class BDOAccount implements SavingAccount{
	
	public BDOAccount() {
		System.out.println("BDOaccount instance is created");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cashDeposit() {
		// TODO Auto-generated method stub
		
	}
}