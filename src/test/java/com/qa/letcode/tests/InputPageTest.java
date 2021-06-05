package com.qa.letcode.tests;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.letcode.base.BaseTest;


public class InputPageTest extends BaseTest
{
SoftAssert softAssert = new SoftAssert();
	

	@BeforeClass
	public void AccSetUp() 
	{
		
		inputPage = loginPage.doLogin1(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void inputTes1() 
	{
		inputPage.PickInput();
	}
	
	@Test
	public void inputTest2()
	{
		
	}

}
