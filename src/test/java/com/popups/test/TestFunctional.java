package com.popups.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.popups.model.Advertiser;
import com.popups.model.Payment;
import com.popups.model.User;
import com.popups.services.AdvertiserService;
import com.popups.services.UserService;

import junit.framework.Assert;



public class TestFunctional {

	
	@Test
	public void testRegister()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("popups-application.xml");

		User user = new User();

		user.setUserId(1);
		user.setUserName("meghana");
		user.setInterest("Movies");
		user.setGender("Female");
		user.setAge(20);
		user.setLocation("meghana12");
		user.setFamilystatus("middle class");
		user.setPassword("meghana12");
		
		UserService userservice=(UserService) context.getBean("UserService");
		userservice.register(user);
		boolean userfromdb =userservice.register(user);
		assertSame(user,userfromdb);
	}
	
	@Test
	public void testAdvertiserRegister()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("popups-application.xml");

		Advertiser advertiser = new Advertiser();
		
		advertiser.setAdvertiserId(1);
		advertiser.setUserName("chandan");
		advertiser.setEmail("chandan@gmail.com");
		advertiser.setPassword("chandan1234");
		advertiser.setBrandId(1);
	
		AdvertiserService advertiserService=(AdvertiserService) context.getBean("AdvertiserService");
		boolean advertiserfromdb =advertiserService.register(advertiser);
		assertSame(advertiser,advertiserfromdb);
	}
	

	@Test
	
	public void testSearchAllUser() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("popups-application.xml");
		User user= new User();
	Advertiser advertiser = new Advertiser();
		
	advertiser.setAdvertiserId(1);
	advertiser.setUserName("chandan");
	advertiser.setEmail("chandan@gmail.com");
	advertiser.setPassword("chandan1234");
	advertiser.setBrandId(1);
	
		AdvertiserService advertiserService=(AdvertiserService) context.getBean("AdvertiserService");
		List User = advertiserService.searchAllUsers(user.getAge(),user.getUserName(),user.getGender(),user.getInterest());
		Assert.assertNotNull(user);
	}
	
	@Test
	public void testAgreePayment()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("popups-application.xml");
		User user = new User();
		Advertiser advertiser = new Advertiser();
		Payment payment =new Payment();

		advertiser.setAdvertiserId(1);
		advertiser.setUserName("chandan");
		advertiser.setEmail("chandan@gmail.com");
		advertiser.setPassword("chandan1234");
		advertiser.setBrandId(1);
		
		AdvertiserService advertiserService=(AdvertiserService) context.getBean("AdvertiserService");
		boolean isAgreed =advertiserService.agreePayment(advertiser.getAdvertiserId(),user.getUserId(),payment);
		assertEquals("1",isAgreed);
	
}
	
	@Test
	public void testSignIn()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("popups-application.xml");

		User user = new User();

		user.setUserId(1);
		user.setUserName("meghana");
		user.setInterest("Movies");
		user.setGender("Female");
		user.setAge(20);
		user.setLocation("meghana12");
		user.setFamilystatus("middle class");
		user.setPassword("meghana12");
		
		UserService userservice=(UserService) context.getBean("UserService");
		userservice.register(user);
		boolean userfromdb =userservice.signIn(user.getUserName(),user.getPassword());
		assertSame(user,userfromdb);
	}
	
	@Test
	public void testAdvertiserSignIn()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("popups-application.xml");

		Advertiser advertiser = new Advertiser();
		advertiser.setAdvertiserId(1);
		advertiser.setUserName("chandan");
		advertiser.setEmail("chandan@gmail.com");
		advertiser.setPassword("chandan1234");
		advertiser.setBrandId(1);
		
		AdvertiserService advertiserService=(AdvertiserService) context.getBean("AdvertiserService");
		advertiserService.register(advertiser);
		boolean advertiserfromdb =advertiserService.signIn(advertiser.getUserName(),advertiser.getPassword());
		assertSame(advertiser,advertiserfromdb);
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
