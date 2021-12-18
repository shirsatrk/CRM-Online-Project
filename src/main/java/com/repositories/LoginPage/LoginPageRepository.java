package com.repositories.LoginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utils.utilsBaseClass;

public class LoginPageRepository extends utilsBaseClass{

	@FindBy (id = "LoginForm_username")
	public WebElement uname;
	
	@FindBy (id = "LoginForm_password")
	public WebElement password;
	
	@FindBy (xpath = "//button")
	public WebElement loginButton;
	
	@FindBy (linkText = "Activity")
	public WebElement activiyButton;
	
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
