package com.pages.OpportunitiesPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.repositories.Opportunities.createOpportunityRepository;

public class createOpportunityPage extends createOpportunityRepository{
	WebDriver driver;
	public createOpportunityPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}
