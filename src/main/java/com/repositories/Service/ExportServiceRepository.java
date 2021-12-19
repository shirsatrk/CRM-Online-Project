package com.repositories.Service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ExportServiceRepository  {

	
   public WebDriver driver;
	
		
	
	@FindBy(xpath="//a[text()='Export Services']")
	public WebElement export;
	
	@FindBy(id="includeHidden")
	public WebElement recordcheckbox;
	
	@FindBy(id="includeTags")
	public WebElement tagscheckbox;
	
	@FindBy(xpath="//a//i[@Class=\" fa fa-caret-left\"][1]")
	public WebElement dropdown1;
	
	@FindBy(xpath="//a//i[@Class=\" fa fa-caret-left\"][2]")
	public WebElement dropdown2;
	
	@FindBy(id="export-button")
	public WebElement exportbutn; 
	
	@FindBy(id="download-link")
	public WebElement downloadbutn;
}

