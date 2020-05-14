package com.qa.tests;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {

	@Test
	public void login() {
		System.out.println("I'm logged in");
	}
	
	@Test
	public void login1(){
		Assert.assertTrue(true);
		
	}
}
