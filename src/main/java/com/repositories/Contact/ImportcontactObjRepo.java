package com.repositories.Contact;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ImportcontactObjRepo {

	
	@FindBy(linkText="Import Contacts")
	public WebElement importContactsTab;
	
	@FindBy(xpath="//h2")
	public WebElement impconTemplate;
	
	@FindBy(xpath="//h2")
	public WebElement uploadFile;

	@FindBy(xpath="//input[@type='submit']")
	public WebElement submitButton;

}
