package com.qa.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Class {

	@Test
	@Parameters("MyParam")
	public void getName(String name)
	{
		System.out.println("My name is " + name);
	}
}
