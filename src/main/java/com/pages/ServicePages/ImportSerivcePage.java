package com.pages.ServicePages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class ImportSerivcePage extends com.repositories.Service.ImportServiceRepo {

	public ImportSerivcePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public boolean verifyImportPageTitle() {

		String title = "ImportModel Admin";

		if (driver.getTitle().equals(title)) {
			System.out.println("User on Import page ");
			return true;
		} else {
			System.out.println("User failed to reach on Import page");
		}
		return false;
	}

	public boolean verifyImportServicesBlankSubmit() {
	
		submitbtn.click();

		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);

		if (text.equalsIgnoreCase("File must be a .csv file.")) {
			alert.accept();
			System.out.println("Alert shows sucessfully");
			return true;
		} else {
			System.out.println("Alert is not displayed");
		}
		return false;
	}

}
