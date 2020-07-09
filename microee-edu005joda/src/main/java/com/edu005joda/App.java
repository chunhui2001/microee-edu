package com.edu005joda;

import java.util.Date;
import org.joda.time.DateTime;

import com.edu005joda.models.User;

public class App {

	public static final String STANDARD_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";
	
    public static void main(String[] args) {
    	User u1 = new User();
		u1.setName("keesh666");
		u1.setBirthday(new Date());
		u1.setLover(new String[] {"micis", "足球"});
		System.out.println("name: " + u1.getName());
		System.out.println("gender: " + u1.getGender());
		System.out.println("age: " + u1.getAge());
		System.out.println("birthday: " + new DateTime(u1.getBirthday()).toString(STANDARD_FORMAT));
		System.out.println("phone: " + u1.getPhone());
		System.out.println("email: " + u1.getEmail());
		System.out.println("address: " + u1.getAddress());
		System.out.println("lover: " + String.join(",", u1.getLover()));
    }
}
