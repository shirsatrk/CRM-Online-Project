package com.repositories.Contact;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExportcontactObjRepo {


	@FindBy(linkText="Export Contacts")
	public WebElement exportcontactTab;
	
	@FindBy(xpath="//h2")
	public WebElement exportcontact;
	
	@FindBy(xpath="//input[@id='export-button']")
	public WebElement exportButton;

}
