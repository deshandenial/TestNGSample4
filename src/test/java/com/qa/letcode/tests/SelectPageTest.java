package com.qa.letcode.tests;



import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.letcode.base.BaseTest;
import com.qa.letcode.utils.Constants;
import com.qa.letcode.utils.Error;

public class SelectPageTest extends BaseTest 
{
SoftAssert softAssert = new SoftAssert();
	
	@BeforeClass
	public void AccSetUp() {
		accPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void accPageTitleTest() {
		String title = accPage.getSelectPageTitle();
		System.out.println("home page title : " + title);
		Assert.assertEquals(title, Constants.ACC_PAGE_TITLE, Error.ACC_PAGE_MISMATCHED_ERROR);
	}
	
	@Test(priority = 2)
	public void accPageLogoTest() {
		Assert.assertTrue(accPage.isLogoExist(), Error.LOGO_NOT_AVAILABLE_ERROR);
	}
	
	
	@Test(priority = 0)
	public void selectByVisibleText() 
	{
		accPage.getAllUIElements();
		accPage.PickSelect();
		
	
	}
	@Test(priority = 3)
	public void isMultiple() 
	{
		
		accPage.isMulitple();
	}
	
	@Test(priority = 5)
	public void SelectMultiple()
	{
		accPage.SelectMultiple();
	}
	
	@Test(priority = 6)
	public void printAllValues()
	{
		accPage.printAllValue();
	}
	
	
	@Test(priority = 7)
	public void printSelectedvalue()
	{
		accPage.SelectedValuePrint();
	}
	
	@Test(priority = 8)
	public void getFirstSelectedOption()
	{
		accPage.firstSelectedtext();
	}
	
	
	

}
