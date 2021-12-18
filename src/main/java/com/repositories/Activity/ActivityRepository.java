package com.repositories.Activity;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utils.utilsBaseClass;

public class ActivityRepository extends utilsBaseClass{

	@FindBy (id = "LoginForm_username")
	public WebElement uname;
	
	@FindBy (id = "LoginForm_password")
	public WebElement password;
	
	@FindBy (xpath = "//button")
	public WebElement loginButton;
	
	
}
