package com.ecom.bookmyticket.model;
import lombok.NoArgsConstructor;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Booking_mapping {
	
	public int mapping_id;
	public String m_screen_id;
	public Date from_date;
	public Date to_date;
	public String m_mvi_id;
	public double ticket_price;
	

}
