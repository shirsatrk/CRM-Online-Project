package com.pages.ServicePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import com.utils.SelectClass;

public class CreateCasePage extends com.repositories.Service.CreateCaseRepository {

	WebDriver driver;
	SelectClass sc;

	public CreateCasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public boolean verifyCreateCaseTitle() {

		String title = "CRM Tech - Create Services";
		if (driver.getTitle().equals(title)) {
			return true;
		} else {
			System.out.println("Test case is failed ");
			return false;
		}
	}

	public boolean VerifyCreateCases() {
		sc=new SelectClass();
		contact.sendKeys("Gourav");
		sc.select("System Administrator", assignedto);
		sc.select("Email", orgin);
		sc.select("1 - Severe", impact);
		sc.select("New", status);
		sc.select("Hardware", mainissue);
		sc.select("Laptop", subissue);
		subject.sendKeys("Charging issue");
		
		description.sendKeys("Charging is not working properly");
		
		sc.select("System Administrator", escaltedto);
		savebutton.submit();

		String Title = driver.getTitle();
	
		if (Title.equals("CRM Tech - View Services")) {
			System.out.println("Case is save sucessfully");
			return true;
		} else {
			System.out.println("Case is failed to saved.");
		}
		return false;
	}

	
	
	public boolean VerifyCreateCasesWithBlankInfo() {
		sc=new SelectClass();
		createcase.click();
		contact.sendKeys("Gourav");
		sc.select("System Administrator", assignedto);
		sc.select("Email", orgin);
		sc.select("Hardware", mainissue);
		sc.select("Laptop", subissue);
		subject.sendKeys("Charging issue");
		description.sendKeys("Charging is not working properly");
		sc.select("System Administrator", escaltedto);
		savebutton.submit();
		
		String texter = "Please fix the following input errors:";
		String act = error.getText();
			
		if (act.equals(texter)) {
			System.out.println("error is diplayed sucessfully");
			return true;
		} else {
			System.out.println("Error is failed to display.");
		}

		return false;

	}
	
}
