package com.repositories.Contact;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatecontactObjRepo {

	
	@FindBy(linkText="Create Contact")
	public WebElement createContactTab;
	
	@FindBy(xpath="//span[text()='Contact Info']")
	public WebElement contactInfo;
	
	@FindBy(name="Contacts[firstName]")
	public WebElement firstName;
	
	@FindBy(name="Contacts[title]")
	public WebElement title;
	
	@FindBy(name="Contacts[lastName]")
	public WebElement lastName;
	
	@FindBy(name="Contacts[company]")
	public WebElement company;
	
	@FindBy(name="Contacts[phone]")
	public WebElement phone;

	@FindBy(name="Contacts[website]")
	public WebElement website;

	@FindBy(name="Contacts[phone2]")
	public WebElement phone2;

	@FindBy(name="Contacts[email]")
	public WebElement email;

	@FindBy(xpath="//span[text()='Sales & Marketing']")
	public WebElement salesMarketing;

	@FindBy(xpath="//label[text()='Lead Type']")
	public WebElement leadtype;
	
	@FindBy(name="Contacts[expectedCloseDate]")
	public WebElement expClosedate;
	
	@FindBy(name="//label[text()='Lead Source']")
	public WebElement leadSource;
	
	@FindBy(name="Contacts[closedate]")
	public WebElement closedate;
	
	@FindBy(name="Contacts[leadDate]")
	public WebElement leadDate;
	
	@FindBy(name="//label[text()='Deal Status']")
	public WebElement dealStatus;
	
	@FindBy(xpath="//input[@title='Address']")
	public WebElement address;
	
	@FindBy(xpath="//input[@title='State']")
	public WebElement state;
	
	@FindBy(xpath="//input[@title='Address 2']")
	public WebElement address2;
	
	@FindBy(xpath="//input[@title='Postal Code']")
	public WebElement postalcode;
	
	@FindBy(xpath="//input[@title='City']")
	public WebElement city;
	
	@FindBy(xpath="//input[@title='Country']")
	public WebElement country ;
	
	@FindBy(xpath="//label[text()='Assigned To']")
	public WebElement assignTo;
	
	@FindBy(xpath="//label[text()='Priority']")
	public WebElement priority;
	
	@FindBy(xpath="//label[text()='Visibility ']")
	public WebElement visibility;
	
	@FindBy(xpath="//input[@id='save-button']")
	public WebElement createButton;


}
