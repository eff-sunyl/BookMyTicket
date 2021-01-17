package com.ecom.bookmyticket.repository;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;

import com.ecom.bookmyticket.model.Booking_ticket;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class Booking_ticketRepository {
	
	@Autowired
	JdbcTemplate jdbctemplate;
	
	public int createTicket(Booking_ticket bt)
	{
		return jdbctemplate.update("insert into booking_ticket (userid,movie_id,booking_date,booked_seats,total_booked_seat,show_time,ticket_id,t_screen_name,booked_theatre_id,movie_date,total_price,booking_status) " + "values(?,?,?,?,?,?,?,?,?,?,?,?)",
				new Object[] {
					bt.getUserid(),bt.getMovie_id(),bt.getBooking_date(),bt.getBooked_seats(),bt.getTotal_booked_seat(),bt.getShow_time(),bt.getTicket_id(),bt.getT_screen_name(),bt.getBooking_theatre_id(),bt.getMovie_date(),bt.getTotal_price(),bt.getBooking_status()
				});
	}

}
