package com.qa.letcode.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.letcode.utils.Constants;
import com.qa.letcode.utils.ElementUtil;

import io.qameta.allure.Step;

public class LoginPage 
{
	private ElementUtil elementUtil;
	private WebDriver driver;
	// Page Objects - By Locators - OR
	private By Login = By.xpath("//a[@class='button is-info']");
	private By username = By.xpath("//input[@name='email']");
	private By password = By.xpath("//input[@name='password']");
	private By loginButton = By.xpath("//button[text()='LOGIN']");
	private By forgotPwd = By.xpath("//button[text()='Forgotten password?']");
	
	
	
	// constructor:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}

	// page actions:
	@Step("getting login page title...")
	public String getLoginPageTitle() 
	{
		return elementUtil.waitForTitleIs(10, Constants.LOGIN_PAGE_TITLE);
	}

	@Step("checking forgot pwd link...")
	public boolean isForgotPwdLinkExist() 
	{
		
		elementUtil.doClick(Login);
		return elementUtil.doIsDisplayed(forgotPwd);
	}

	
	  @Step("login with username: {0} and password: {1}") 
	  public SelectPage doLogin(String un, String pwd) 
	  { 
		  
		  elementUtil.doClick(Login);
		  System.out.println("login with: " + un + " : " + pwd);
		 
		  elementUtil.doMoveToElement(username);
		  elementUtil.doSendKeys1(username, un);
		 elementUtil.doMoveToElement(password);
		 
		  elementUtil.doSendKeys(password, pwd);
		  
		  elementUtil.doClick(loginButton);
		  return new SelectPage(driver); 
	  }
	  
	  @Step("login with username: {0} and password: {1}") 
	  public InputPage doLogin1(String un, String pwd) 
	  { 
		  elementUtil.clickWhenReady(Login, 500);
		  elementUtil.doClick(Login);
		  System.out.println("login with: " + un + " : " + pwd);
		
		  elementUtil.doMoveToElement(username);
		  elementUtil.doSendKeys1(username, un);
		 elementUtil.doMoveToElement(password);
		  
		  elementUtil.doSendKeys(password, pwd);
		  
		  elementUtil.doClick(loginButton);
		  return new InputPage(driver); 
	  }
	  @Step("login with username: {0} and password: {1}") 
	  public ButtonPage doLogin2(String un, String pwd) 
	  { 
		  
		  elementUtil.doClick1(Login);
		  
		  System.out.println("login with: " + un + " : " + pwd);
		  elementUtil.doMoveToElement(username);
		  elementUtil.doSendKeys1(username, un);
		 elementUtil.doMoveToElement(password);
		  elementUtil.doSendKeys1(password, pwd);
		  
		  elementUtil.doClick1(loginButton);
		  return new ButtonPage(driver); 
	  }
	
	

}
