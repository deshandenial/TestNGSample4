package com.qa.letcode.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.letcode.utils.ElementUtil;

public class InputPage 
{

	private ElementUtil elementUtil;
	private WebDriver driver;
	
	private By Practice = By.xpath("//button[@routerlink='/test']"); 
	
	private By InputLetMe = By.xpath("//p[text()='Input']//following::button[1]");
	private By fullName = By.xpath("//input[@id='fullName']");
	private By noEdit = By.xpath("//input[@id='noEdit']");
	
	public InputPage(WebDriver driver) 
	{
		
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}
	
	public void PickInput()
	{
		elementUtil.doClick(Practice);
		elementUtil.doClick(InputLetMe);
		elementUtil.doSendKeys1(fullName, "ABCD");
		elementUtil.doSendKeys1(noEdit, "ABCD");
		
		
	}
	
	
}
