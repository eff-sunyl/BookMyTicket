package com.ecom.bookmyticket.repository;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;

import com.ecom.bookmyticket.model.Theatre_master;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class Theatre_masterRepository {

	@Autowired
	JdbcTemplate jdbctemplate;
	
	class TheatreMaster_RowMapper implements RowMapper<Theatre_master>{
		public Theatre_master mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
			Theatre_master t=new Theatre_master();
			t.setScreen_id(resultSet.getString("screen_id"));
			t.setTheatre_id(resultSet.getString("theatre_id"));
			t.setScreen_name(resultSet.getString("screen_name"));
			t.setTheatre_name(resultSet.getString("theatre_name"));
			t.setTheatre_location(resultSet.getString("theatre_location"));
			t.setTheatre_region(resultSet.getString("theatre_region"));	
			return t;
		}
	}
	
	public int createTheatre(Theatre_master tm)
	{
		return jdbctemplate.update("insert into theatre_master (theatre_id,screen_id,screen_name,theatre_name,theatre_location,theatre_region) " + "values(?,?,?,?,?,?)",
				new Object[] {
					tm.getTheatre_id(),tm.getScreen_id(),tm.getScreen_name(),tm.getTheatre_name(),tm.getTheatre_location(),tm.getTheatre_region()
				});
	}
	
	public List<Theatre_master> findAllTheatre_master()
	{
		return jdbctemplate.query("select * from theatre_master", new TheatreMaster_RowMapper());
	}
	
}
