package com.pages.MarketingPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.repositories.Marketing.MarketingPageRepository;



public class MarketingPage extends MarketingPageRepository {

	WebDriver driver;
	public MarketingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
}
