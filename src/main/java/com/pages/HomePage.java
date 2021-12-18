package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.repositories.HomePageReporsitory;

public class HomePage extends HomePageReporsitory{

	WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public ActivityPage navigateToActivityPage() {
		com.utils.wait wait = new com.utils.wait();
		wait.explicitWait(activityButton);
		activityButton.click();		
		return new ActivityPage(driver);
	}
	
	public ContactsPage navigateToContactsPage() {
		com.utils.wait wait = new com.utils.wait();
		wait.explicitWait(contactsButton);
		contactsButton.click();
		return new ContactsPage(driver);
	}	
	
	public AccountsPage navigateToAccountsPage() {
		com.utils.wait wait = new com.utils.wait();
		wait.explicitWait(contactsButton);
		accountsButton.click();
		return new AccountsPage(driver);
	}
		
	public MarketingPage navigateToMarketingPage() {
		com.utils.wait wait = new com.utils.wait();
		wait.explicitWait(marketingButton);
		marketingButton.click();
		return new MarketingPage(driver);
	}	
	
	public OpportunitiesPage navigateToOpportunitiesPage() {
		com.utils.wait wait = new com.utils.wait();
		wait.explicitWait(opportunitiesButton);
		opportunitiesButton.click();
		return new OpportunitiesPage(driver);
	}
	
	public ServicePage navigateToServicePage() {
		com.utils.wait wait = new com.utils.wait();
		wait.explicitWait(serviceButton);
		serviceButton.click();
		return new ServicePage(driver);
		
		
		
	}
	
}
