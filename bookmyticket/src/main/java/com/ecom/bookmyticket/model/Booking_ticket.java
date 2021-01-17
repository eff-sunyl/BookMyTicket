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

public class Booking_ticket {
	
	public String userid;
	public String movie_id;
	public Date booking_date;
	public String booked_seats;
	public int total_booked_seat;
	public String show_time;
	public String ticket_id;
	public String t_screen_name;
	public String booking_theatre_id;
	public Date movie_date;
	public Double total_price;
	public String booking_status;	

}
