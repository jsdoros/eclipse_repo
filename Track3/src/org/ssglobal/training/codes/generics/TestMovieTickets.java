package org.ssglobal.training.codes.generics;

public class TestMovieTickets {

	public static void main(String[] args) {

		MovieTickets<String, Float> mt = new MovieTickets<>();
		try {
			mt.printTicket("SSSGGHH123", 11.50F);
		} catch (InvalidTicketTypeException e) {
			e.printStackTrace();
		} catch (InvalidTicketPriceException e) {
			e.printStackTrace();
		}

		MovieTickets<Float, String> mt2 = new MovieTickets<>();
		try {
			mt2.printTicket(11234.2F, "333.78");
		} catch (InvalidTicketTypeException e) {
			e.printStackTrace();
		} catch (InvalidTicketPriceException e) {
			e.printStackTrace();
		}
	}
}
