package org.ssglobal.training.codes.answers;

import java.time.LocalDate;

public class Visit {

	private Customer customer;
	private LocalDate date;
	private double serviceExpenses;
	private double productExpenses;
	
	public LocalDate getDate() {
		return date;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getServiceExpenses() {
		return serviceExpenses;
	}
	public void setServiceExpenses(double serviceExpenses) {
		if (this.customer instanceof NonMemberCustomer) {
			this.serviceExpenses += serviceExpenses;
		}else if (this.customer instanceof PremiumMemberCustomer) {
			this.serviceExpenses += (serviceExpenses-(PremiumMemberCustomer.SERVICE_DISCOUNT));
		}else if (this.customer instanceof GoldMemberCustomer) {
			this.serviceExpenses += (serviceExpenses-(GoldMemberCustomer.SERVICE_DISCOUNT));
		}else if (this.customer instanceof SilverMemberCustomer) {
			this.serviceExpenses += (serviceExpenses-(SilverMemberCustomer.SERVICE_DISCOUNT));
		}
	}
	public double getProductExpenses() {
		return productExpenses;
	}
	public void setProductExpenses(double productExpenses) {
		if (this.customer instanceof NonMemberCustomer) {
			this.productExpenses += productExpenses;
		}else if (this.customer instanceof PremiumMemberCustomer) {
			this.productExpenses += (productExpenses-(PremiumMemberCustomer.PRODUCT_DISCOUNT));
		}else if (this.customer instanceof GoldMemberCustomer) {
			this.productExpenses += (productExpenses-(GoldMemberCustomer.PRODUCT_DISCOUNT));
		}else if (this.customer instanceof SilverMemberCustomer) {
			this.productExpenses += (productExpenses-(SilverMemberCustomer.PRODUCT_DISCOUNT));
		}
	}
	
	public double getTotalExpense() {
		return this.serviceExpenses + this.productExpenses;
	}
}
