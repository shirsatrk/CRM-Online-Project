package com.repositories.Contact;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPageReporsitory {

	@FindBy(linkText="Contacts")
	public WebElement contactTab;
	
	@FindBy(xpath="//h2[text()='All Contacts']")
	public WebElement AllContacts;
	
	@FindBy(xpath="//a[@title='Clear Filters']")
	public WebElement filter;
	
	@FindBy(xpath="//a[@title='Columns']")
	public WebElement coloumnButton;

	@FindBy(xpath="//a[@class='sort-link']")
	public List<WebElement> tableContent;

	@FindBy(xpath="//select[@class='x2-minimal-select']")
	public WebElement pageResult;
	
	@FindBy(xpath="//input[@id='contactsgridC_gvCheckbox_all']")
	public WebElement Checkbox;
	
	@FindBy(xpath="//td//input[@class=\"checkbox-column-checkbox\"]")
	public List<WebElement> Checkboxes;
	
	@FindBy(xpath="//td//select[@id='Contacts_leadstatus']")
	public WebElement leadstatus;
	
	@FindBy(xpath="//td//select[@id='Contacts_leadSource']")
	public WebElement leadsource;
	
	@FindBy(linkText="Lists")
	public WebElement listbutton;
	
	@FindBy(linkText="Create Contact")
	public WebElement createcontactButton;
	
	@FindBy(linkText="Import Contacts")
	public WebElement importcontactsButton;
	
	@FindBy(linkText="Export Contacts")
	public WebElement exportcontactsButton;
	
	@FindBy(linkText="Quick Create")
	public WebElement quickcreateTab;

	@FindBy(linkText="Create List")
	public WebElement createlistTab;
	
	@FindBy(xpath="//input[@name='X2List[name]']")
	public WebElement createListName;

	

}
