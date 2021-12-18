package com.pages.ContactPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.repositories.Contact.ContactsPageReporsitory;

public class ContactsPage extends ContactsPageReporsitory{

	WebDriver driver;
	public ContactsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
}
