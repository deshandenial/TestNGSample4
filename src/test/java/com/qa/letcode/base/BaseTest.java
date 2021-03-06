package com.qa.letcode.base;


import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import com.qa.letcode.factory.DriverFactory;
import com.qa.letcode.pages.SelectPage;
import com.qa.letcode.pages.ButtonPage;
import com.qa.letcode.pages.InputPage;
import com.qa.letcode.pages.LoginPage;
import com.qa.letcode.utils.ConfigReader;

public class BaseTest {
	private WebDriver driver;
	public Properties prop;
	DriverFactory df;
	private ConfigReader configReader;
	  
	public LoginPage loginPage;
	public SelectPage accPage;
	public InputPage inputPage;
	public ButtonPage buttonPage;
	
	
	
	@BeforeTest
	public void setUp() {
		configReader =new ConfigReader();
		 prop = configReader.init_prop();
		String browser = prop.getProperty("browser");
		df = new DriverFactory();
		driver =df.init_driver(browser);
		driver.get("https://letcode.in/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		loginPage = new LoginPage(driver);
		
		 
		
	}
	
	@AfterTest
	public void tearDown() 
	{
		
	 driver.quit();	
	}
	
	

}
