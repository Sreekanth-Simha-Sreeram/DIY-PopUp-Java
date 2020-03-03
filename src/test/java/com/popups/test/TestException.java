package com.popups.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.popups.model.User;
import com.popups.services.AdvertiserService;
import com.popups.services.UserService;



public class TestException {
	
	@Test
	public void testSearchAnUser() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("popups-application.xml");
		AdvertiserService advertiserservice = (AdvertiserService) context.getBean("AdvertiserService");
		User user=new User();
		
		user.setUserId(1);
		user.setUserName("meghana");
		user.setInterest("Movies");
		user.setGender("Female");
		user.setAge(20);
		user.setLocation("meghana12");
		user.setFamilystatus("middle class");
		user.setPassword("meghana12");
		
		List <User> userFromSearch = advertiserservice.searchAllUsers(user.getAge(),user.getUserName(),user.getGender(),user.getInterest());
		Assert.assertNotNull(userFromSearch);
		
	}
	
	   @Test(expected = NullPointerException.class)
	    public void testEmptyPasswordException() 
	    {
	        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("pixogram-application.xml");
	        User user=new User();
			
			user.setUserId(1);
			user.setUserName("meghana");
			user.setInterest("Movies");
			user.setGender("Female");
			user.setAge(20);
			user.setLocation("meghana12");
			user.setFamilystatus("middle class");
			user.setPassword("meghana12");
	           Assert.assertEquals("1234",user.getPassword(),"password empty exception");
	           throw new NullPointerException();
	    }

	   @Test(expected = NullPointerException.class)
	    public void testEmptyContentException() 
	    {
	        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("pixogram-application.xml");
	           
	           User user=new User();

	           user.setUserId(1);
				user.setUserName("meghana");
				user.setInterest("Movies");
				user.setGender("Female");
				user.setAge(20);
				user.setLocation("meghana12");
				user.setFamilystatus("middle class");
				user.setPassword("meghana12");
	           UserService userservice = (UserService) context.getBean("UserService");
	    }
	   
	
}
