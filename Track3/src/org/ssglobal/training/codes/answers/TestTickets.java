package org.ssglobal.training.codes.answers;

import java.time.LocalDate;

public class TestTickets {

	public static void main(String[] args) {

		WalkUpTicket wticket = new WalkUpTicket();
		wticket.ticket = "90988111";
		wticket.printTicket();
		
		AdvancedTicket aticket = new AdvancedTicket();
		//aticket.setDateDetails(LocalDate.of(2020, 04, 8), LocalDate.of(2020, 04, 13));
		aticket.ticket = "5335353";

	}

}
