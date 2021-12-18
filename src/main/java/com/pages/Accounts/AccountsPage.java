package com.pages.Accounts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.repositories.Accounts.AccountsPageRepository;


public class AccountsPage extends AccountsPageRepository{
	WebDriver driver;
	public AccountsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
}
