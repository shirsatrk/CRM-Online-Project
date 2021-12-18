package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.repositories.OpportunitiesPageRepository;

public class OpportunitiesPage extends OpportunitiesPageRepository{

	WebDriver driver;
	public OpportunitiesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
}
