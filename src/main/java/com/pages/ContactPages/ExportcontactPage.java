package com.pages.ContactPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ExportcontactPage {
	WebDriver driver;
	public ExportcontactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
