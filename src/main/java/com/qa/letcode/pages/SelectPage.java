package com.qa.letcode.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.letcode.utils.Constants;
import com.qa.letcode.utils.ElementUtil;

public class SelectPage {

	
	private ElementUtil elementUtil;
	private WebDriver driver;
	
	private By Practice = By.xpath("//button[@routerlink='/test']"); 
	private By logo = By.xpath("//img[@alt='letcode']");
	private By Label = By.xpath("//div[contains(@class,'container is-fluid')]//p");
	private By SelectLetMe = By.xpath("//p[text()='Select']//following::button[1]");
	private By FruitName = By.xpath("//select[@id='fruits']");
	private By SuperheroList =By.xpath("//select[@id='superheros']");
	private By Language = By.xpath("//select[@id='lang']");
	private By Country = By.xpath("//select[@id='country']");
	
	//private By searchField = By.name("search");
	//private By searchButton = By.cssSelector("div#search button");
	
	public SelectPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}
	
	
	public String getSelectPageTitle() {
		return elementUtil.waitForTitleIs(5, Constants.ACC_PAGE_TITLE);
	}
	
	public boolean isLogoExist() {
		return elementUtil.doIsDisplayed(logo);
	}
	
	
	
	public List<String> getAllUIElements() {
		
		List<WebElement> accList =  elementUtil.getElements(Label);
		List<String> accSectionList = new ArrayList<String>();
		for(WebElement e : accList) {
			accSectionList.add(e.getText());
			//accSectionList.add(e.c)
		}
		return accSectionList;
	}
	
	public String PickSelect()
	{
		elementUtil.doClick(Practice);
		elementUtil.doClick(SelectLetMe);
		elementUtil.doSelectByVisibleText(FruitName, "Orange");
		return null;
		
	}
	
	
	public void isMulitple()
	{
		elementUtil.doIsMultiple(FruitName, "Apple", "Banana");
	}
	
	public void SelectMultiple()
	{
		elementUtil.doSelectByVisibleText(SuperheroList, "Batman");
		elementUtil.doSelectByIndex(SuperheroList, 0);
	}
	
	public void printAllValue()
	{
		elementUtil.doSelectByTextOption(Language, "C#");
	}
	

	public void SelectedValuePrint()
	{
		elementUtil.doSelectByTextOption(Country, "India");
	}
	
	public void firstSelectedtext()
	{
		
		elementUtil.deSelectByVisibleText(SuperheroList);
		elementUtil.doSelectByVisibleText(SuperheroList, "The Avengers");
		elementUtil.doSelectByVisibleText(SuperheroList, "Aquaman");
		elementUtil.getFirstSelectedOption(SuperheroList);
		
		
	}
}
