package org.ssglobal.training.codes.generics;

// should cater ticket price in float or/and double
// Ticket ID either String or Integer
public class MovieTickets<E, N> {

	public void printTicket (E id, N price) throws InvalidTicketTypeException, InvalidTicketPriceException {
		
		if (price instanceof Float || price instanceof Double) {
			if (id instanceof Integer || id instanceof String) {
			System.out.format("Ticket ID: %s, Price: %s \n", id, price);	
			}else {
			throw new InvalidTicketTypeException();
			}
		}else {
			throw new InvalidTicketPriceException();
		}
	}
}

class InvalidTicketTypeException extends Exception{
	
	private String message = "Generic type not supported";
	
	@Override
	public void printStackTrace() {
		System.err.println(message);
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}

class InvalidTicketPriceException extends Exception{
	
	private String message = "Generic type not supported";
	
	@Override
	public void printStackTrace() {
		System.err.println(message);
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}
