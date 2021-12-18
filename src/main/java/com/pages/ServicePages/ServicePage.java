package com.pages.ServicePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.repositories.Service.ServicePageRepository;



public class ServicePage extends ServicePageRepository {
WebDriver driver;
public ServicePage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
	
	
}
