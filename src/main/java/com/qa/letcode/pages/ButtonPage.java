package com.qa.letcode.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.letcode.utils.ElementUtil;

public class ButtonPage 
{
	private ElementUtil elementUtil;
	private WebDriver driver;
	
	private By Practice = By.xpath("//button[@routerlink='/test']"); 
	
	private By ButtonLetMe = By.xpath("//p[text()='Button']//following::button[1]");
	private By goHome = By.xpath("//button[contains(text(),'Goto Home')]");
	private By getLocation = By.xpath("//button[contains(text(),'Find Location')]");
	private By buttonColor = By.xpath("//button[contains(text(),'What is my color?')]");
	private By buttonheight = By.xpath("//button[@id='property']");
	private By buttonDisable = By.xpath("//button[contains(text(),'Disabled')]");
	
	
	public ButtonPage(WebDriver driver) 
	{
		
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}
	
	public void buttonEvent()
	{
		elementUtil.doClick1(Practice);
		elementUtil.doClick1(ButtonLetMe);
		elementUtil.doClick1(goHome);
		elementUtil.navigationBack();
		elementUtil.getLocation(getLocation);
		
		elementUtil.getSize(buttonheight);
		
		elementUtil.doClick1(buttonDisable);
		elementUtil.getColor(buttonColor);
	}

}
