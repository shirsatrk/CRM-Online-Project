package com.repositories.Service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ImportServiceRepo {

	public WebDriver driver;
	
	
	
	@FindBy(xpath="//a[text()='Import Services']")
	public WebElement importx;
	
	@FindBy(id="data")
	public WebElement choosefile;
	
	@FindBy(xpath="//h3//i[@class=\"pseudo-link fa fa-caret-down\"][1]")
	public WebElement dropdown1;
	
	@FindBy(xpath="//h3//i[@class=\"pseudo-link fa fa-caret-down\"][2]")
	public WebElement dropdown2;
	
	@FindBy(id="defaultMapOption")
	public WebElement dropdown3;
	
	@FindBy(id="mapping")
	public WebElement choosefile1;
	
	@FindBy(xpath="//input[@class=\"x2-button\"]")
	public WebElement submitbtn;
	
}

