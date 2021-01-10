package com.ecom.bookmyticket.service;
import com.ecom.bookmyticket.model.Booking_users;

public interface Booking_usersService {

public int createUser(Booking_users bu);
public int updateuser(Booking_users bu);
public int deleteUser(Booking_users bu);
public Booking_users getUser(String name);


}
