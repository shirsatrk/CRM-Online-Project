package com.repositories.Service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CreateCaseRepository {
	
	WebDriver driver;


	@FindBy(xpath="//a[text()='Create Case']")
	public WebElement createcase;
	
	@FindBy(id="Services_contactId")
	public WebElement contact;
	
	@FindBy(id="Services_assignedTo")
	public WebElement assignedto;
	
	@FindBy(id = "Services_origin")
	public WebElement orgin;
	
	@FindBy(xpath="//select[@id=\"Services_impact\"]")
	public WebElement impact;
	
	@FindBy(id="Services_status")
	public WebElement status;
	
	@FindBy(id="Services_mainIssue")
	public WebElement mainissue;
	
	@FindBy(id="Services_subIssue")
	public WebElement subissue;
	
	@FindBy(id="Services_subject")
	public WebElement subject;
	
	@FindBy(id="Services_description")
	public WebElement description;
	
	@FindBy(id="Services_escalatedTo")
	public WebElement escaltedto;
	
	@FindBy(id="save-button")
	public WebElement savebutton;
	
	@FindBy(xpath="//p[text()='Please fix the following input errors:']")
	public WebElement error;
	
	
}
