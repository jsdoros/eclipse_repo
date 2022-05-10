package org.ssglobal.training.codes.answers;

import java.time.LocalDate;

public class TestVisit {

	public static void main(String[] args) {

		SilverMemberCustomer cust1 = new SilverMemberCustomer();
		//cust1.setName("Gina");
		
		PremiumMemberCustomer cust2 = new PremiumMemberCustomer();
		//cust1.setName("Paul");
		
		NonMemberCustomer cust3 = new NonMemberCustomer();
		//cust3.setName("Lu");
		
		Visit cubaoBranch = new Visit();
		cubaoBranch.setCustomer(cust1);
		cubaoBranch.setDate(LocalDate.now());
		cubaoBranch.setServiceExpenses(1000.00);
		cubaoBranch.setProductExpenses(500.00);
		cubaoBranch.setServiceExpenses(600.00);
		cubaoBranch.setProductExpenses(300.00);
		System.out.println(cubaoBranch.getServiceExpenses());
		System.out.println(cubaoBranch.getProductExpenses());
		System.out.println(cubaoBranch.getTotalExpense());

	}

}
