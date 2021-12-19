package com.pages.OpportunitiesPages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.repositories.Opportunities.OpportunitiesPageRepository;
import com.utils.excellRead;

public class OpportunitiesPage extends OpportunitiesPageRepository{
	WebDriver driver;
	public OpportunitiesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	

	public createOpportunityPage navigateToCreateOpportuniy() {
		createOpportunity.click(); 
		return new createOpportunityPage(driver);
		}

	public boolean checkActionsList() {
		List<WebElement> listOfActions =actions;
		
		ArrayList<String> act = new ArrayList<String>();
		for(WebElement li : listOfActions) {
			act.add(li.getText());
		}
		System.out.println(act.size());
		System.out.println(act.toString());
		
		excellRead excel = new excellRead();
		List<String> exp = excel.readMultiplePoiExcell("Sheet2", "actions");
		System.out.println(exp.toString());
		
		if (exp.equals(act)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean portletTitle() {
		String act = portletTitle.getText();
		String exp = "Actions";
		
		if(act.equals(exp)) {
			return true;
			}
		else
		{return false;
			}
		
		
		
		
	}
	
	
	
}
