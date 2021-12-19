package com.repositories.Opportunities;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utils.utilsBaseClass;

public class OpportunitiesPageRepository extends utilsBaseClass{

	@FindBy (xpath = "//span[text()='Create Opportunity']")
	public WebElement createOpportunity;
	
	@FindBy (xpath = "//div[@class='portlet-title ui-sortable-handle']")
	public WebElement portletTitle;
	
	
	
	
	
	@FindBy (xpath = "//div[@id='actions']")
	public List<WebElement> actions;
	
	
	
	
	
}
