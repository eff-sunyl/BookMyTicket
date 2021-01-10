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

public class Booking_users {

	String name;
	String gender;
	Date createdate;
	Date updateddate;
	String contact;
	String password;
	String email;
	String userrole;
	
}
