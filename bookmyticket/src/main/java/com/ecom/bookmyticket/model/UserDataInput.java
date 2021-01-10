package com.ecom.bookmyticket.model;
import com.ecom.bookmyticket.model.Booking_users;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserDataInput {
	
	private String name;
	private String gender;
	private String contact;
	private String password;
	private String email;
	private String userrole;

}
