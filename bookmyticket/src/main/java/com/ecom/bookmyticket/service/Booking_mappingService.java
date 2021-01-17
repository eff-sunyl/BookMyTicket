package com.ecom.bookmyticket.service;
import java.util.List;

import com.ecom.bookmyticket.model.Booking_mapping;

public interface Booking_mappingService {
	
	public int createBooking_mapping(Booking_mapping bm);
	public int updateBooking_mapping(Booking_mapping bm);
	public int deleteBooking_mapping(Booking_mapping bm);
	public Booking_mapping getBooking_mapping(Integer mid );
	public List<Booking_mapping> findAllBooking_mapping();

}
