package com.popups.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.popups.model.Brand;
import com.popups.model.User;



public class TestBoundary {
	
	 @Test
	    public void testpasswordLength()
	    {
	        User user=new User();
	        user.setUserId(1);
			user.setUserName("meghana");
			user.setInterest("Movies");
			user.setGender("Female");
			user.setAge(20);
			user.setLocation("meghana12");
			user.setFamilystatus("middle class");
			user.setPassword("meghana12");

	        int passwordLength=10;
	assertEquals(passwordLength,user.getPassword().length());


	    }
	 
	  @Test
	    public void testEmptyGender()
	    {
		  User user=new User();
	        user.setUserId(1);
			user.setUserName("meghana");
			user.setInterest("Movies");
			user.setGender("Female");
			user.setAge(20);
			user.setLocation("meghana12");
			user.setFamilystatus("middle class");
			user.setPassword("meghana12");
	        assertNotNull(user.getGender());


	    }
	  
	  @Test
	    public void testEmptyUserName()
	    {
		  User user=new User();
	        user.setUserId(1);
			user.setUserName("meghana");
			user.setInterest("Movies");
			user.setGender("Female");
			user.setAge(20);
			user.setLocation("meghana12");
			user.setFamilystatus("middle class");
			user.setPassword("meghana12");
	        assertNotNull(user.getUserName());

	    }	  
	  
}
