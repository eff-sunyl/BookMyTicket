package com.ecom.bookmyticket.repository;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.ecom.bookmyticket.model.Booking_users;

@Repository
public class Booking_usersRepository {
	
	@Autowired
	JdbcTemplate jdbctemplate;
	
	public int createUser(Booking_users bu)
	{
		return jdbctemplate.update("insert into booking_users (name,gender,contact,password,email,userrole) " + "values(?,?,?,?,?,?)",
				new Object[] {
					bu.getName(), bu.getGender(), bu.getContact(), bu.getPassword(), bu.getEmail(), bu.getUserrole()
				});
		
	}
	
	public int updateuser(Booking_users bu)
	{
		return 0;
	}
	
	

}
