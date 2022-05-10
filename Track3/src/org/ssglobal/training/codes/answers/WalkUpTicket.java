package org.ssglobal.training.codes.answers;

public class WalkUpTicket extends Ticket{
	
	private float getPrice() {
		price = 50.0F;
		return price;
	}

	@Override
	protected void printTicket() {
		price = 50.0F;
		System.out.printf("Ticket: %s, Price: %.3f", ticket, getPrice());
		
	}

}
