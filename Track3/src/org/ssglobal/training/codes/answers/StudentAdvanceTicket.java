package org.ssglobal.training.codes.answers;

import java.time.LocalDate;
import java.time.Period;

public class StudentAdvanceTicket extends Ticket {
	
	private LocalDate movieDate;
	private LocalDate bookingDate;
	
	public LocalDate getMovieDate() {
		return movieDate;
	}
	
	public void setMovieDate(LocalDate movieDate) {
		this.movieDate = movieDate;
	}
	
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	
	private float computePrice() {
		int period = Period.between(bookingDate, movieDate).getDays();
		if (period >= 10) {
			price = 20.0F;
		}else {
			price = 15.0F;
		}
		return price;
	}
	
	@Override
	protected void printTicket() {
		System.out.printf("Ticket: %s, Price: %.3f", ticket, computePrice());
	}

}