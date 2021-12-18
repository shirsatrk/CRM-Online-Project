package com.repositories;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utils.utilsBaseClass;

public class HomePageReporsitory extends utilsBaseClass{

	@FindBy (linkText = "Activity")
	public WebElement activityButton;
	
	@FindBy (linkText = "Accounts")
	public WebElement accountsButton;
	
	@FindBy (linkText = "Contacts")
	public WebElement contactsButton;
	
	@FindBy (linkText = "Marketing")
	public WebElement marketingButton;
	
	@FindBy (linkText = "Opportunities")
	public WebElement opportunitiesButton;
	
	@FindBy (linkText = "Service")
	public WebElement serviceButton;
	
	@FindBy (linkText = "More")
	public WebElement moreButton;
	
	
}
