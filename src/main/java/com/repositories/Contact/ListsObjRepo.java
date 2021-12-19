package com.repositories.Contact;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListsObjRepo {

	@FindBy(linkText="Lists")
	public WebElement listTab;

	@FindBy(xpath="//h2[text()='Contact Lists']")
	public WebElement contactLists;
	
	@FindBy(xpath="//a[@title='Clear Filters']")
	public WebElement filter;
	
	@FindBy(xpath="//select[@name='resultsPerPage']")
	public WebElement perPageResult;
	
	@FindBy(xpath="//th")
	public List<WebElement> tableHeading;
	
	@FindBy(xpath="//td//a//following::tr")
	public List<WebElement> nameList;
	
	@FindBy(xpath="//td//span//following::tr")
	public List<WebElement> tableRows;
	
	@FindBy(xpath="//td//a[@class][1]")
	public List<WebElement> tablesearch;
	
	@FindBy(xpath="//td//a[@class][2]")
	public List<WebElement> tableEdit;
	
	@FindBy(xpath="//td//a[@class][3]")
	public List<WebElement> tableDelete;
	
	@FindBy(xpath="//span[text()='New List']")
	public WebElement newList;
	

}
