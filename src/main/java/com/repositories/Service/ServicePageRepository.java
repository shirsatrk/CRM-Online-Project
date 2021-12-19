package com.repositories.Service;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utils.utilsBaseClass;

public class ServicePageRepository extends utilsBaseClass{

public WebDriver driver;
	
	
	@FindBy(xpath="//a[text()='Create Case']")
	public WebElement creatCaseButton;
	
	@FindBy(linkText="Lists")
	public WebElement listButton;
	
	@FindBy(xpath="//a[text()='Import Services']")
	public WebElement importButton;
	
	@FindBy(xpath="//a[text()='Export Services']")
	public WebElement exportButton;
	
	@FindBy(xpath= "//a[text()='Service'][1]")
	public WebElement service;

	@FindBy(xpath="//h2[text()='Service Cases']")
	public WebElement Servicecases;
	
	@FindBy(xpath="//td[text()='New']")
	public List<WebElement> listservices;
	
	@FindBy(xpath="//span[@class=\"more-button-label\"]")
	public WebElement morebutn;
	
	@FindBy(xpath="//input[@class=\"checkbox-column-checkbox\"][1]")
	public WebElement checkbox;
	
	@FindBy(xpath="//div[@class=\"x2grid-body-container x2grid-no-pager\"]")
	public WebElement caserow;
	
	@FindBy(id="service-case-status-filter-2")
	public WebElement checkbox2;
	
	@FindBy(id="service-case-status-filter-1")
	public WebElement checkbox1;
	
	
	
	
}
