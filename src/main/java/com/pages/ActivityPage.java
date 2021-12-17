package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.repositories.ActivityRepository;



public class ActivityPage extends ActivityRepository{
		WebDriver driver;
	
	public ActivityPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
		
	
	
}
