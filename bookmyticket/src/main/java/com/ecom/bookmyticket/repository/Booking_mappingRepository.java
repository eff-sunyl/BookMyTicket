package com.ecom.bookmyticket.repository;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;

import com.ecom.bookmyticket.model.Booking_mapping;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class Booking_mappingRepository {
	
	@Autowired
	JdbcTemplate jdbctemplate;
	
	public int createBooking_mapping(Booking_mapping bm)
	{
		return jdbctemplate.update("insert into booking_mapping (mapping_id,m_screen_id,from_date,to_date,m_mvi_id,ticket_price) " + "values(?,?,?,?,?,?)",
				new Object[] {
					
				});
	}
	

}
