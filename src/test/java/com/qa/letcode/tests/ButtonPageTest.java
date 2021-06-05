package com.qa.letcode.tests;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.letcode.base.BaseTest;


public class ButtonPageTest extends BaseTest
{

	@BeforeClass
	public void AccSetUp() 
	{
		
		
		buttonPage = loginPage.doLogin2(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void inputTes1() 
	{
		buttonPage.buttonEvent();
	}
	

}
