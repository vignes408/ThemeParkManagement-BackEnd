package com.vickee.service;
import java.util.List;
import com.vickee.model.Booking;

public interface BookingService {
	
	public void addBooking(Booking book);
	Booking getBookById(Long bookid);	
	 List<Booking> getBookingByRegid(String regid);
	 List<Booking> getAllBooking();
}
