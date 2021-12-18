package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.repositories.MarketingPageRepository;

public class MarketingPage extends MarketingPageRepository {

	WebDriver driver;
	public MarketingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
}
