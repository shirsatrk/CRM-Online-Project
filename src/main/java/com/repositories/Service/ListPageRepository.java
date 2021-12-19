package com.repositories.Service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ListPageRepository {

	public WebDriver driver;
	
	
	@FindBy(linkText="Lists")
	public WebElement listlink;
	
	@FindBy(id="email")
	public WebElement email;
	
	@FindBy(id="error-report-link")
	public WebElement reportlink;
	
	@FindBy(id="phpinfo")
	public WebElement checkbox;
	
	@FindBy(xpath="//span[text()='Error report sent!']")
	public WebElement emailsent;
}
