package com.pages.ServicePages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class ExportServicePage extends com.repositories.Service.ExportServiceRepository {

	public ExportServicePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public boolean verifyExportPageTitle() {

		
		String title = "ExportModel Admin";

		if (driver.getTitle().equals(title)) {
			System.out.println("User on Export page ");
			return true;
		} else {
			System.out.println("User failed to reach on Export page");
		}
		return false;
	}
	
	public boolean verifyExportServices() {
		
		recordcheckbox.click();
		tagscheckbox.click();
		exportbutn.click();

		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);

		if (text.equalsIgnoreCase("Export Complete!")) {
			alert.accept();
			System.out.println("Export file sucessfully");
			return true;
		} else {
			System.out.println("Export Alert is not displayed");
		}
		return false;
	}

	public boolean verifyExportServicesBlankSubmit() {
		
		exportbutn.click();

		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);

		if (text.equalsIgnoreCase("Export Complete!")) {
			alert.accept();
			System.out.println("Export file sucessfully without error");
			return true;
		} else {
			System.out.println("file is not exported ");
		}
		return false;
	}

	public boolean verifyExportServicesDownload() {
		
		exportbutn.click();

		Alert alert = driver.switchTo().alert();
		alert.accept();
		String text = downloadbutn.getText();

		if (text.equalsIgnoreCase("Download!")) {
			downloadbutn.click();
			System.out.println("File downloaded sucessfully");
			return true;
		} else {
			System.out.println("download button is not displayed");
		}
		return false;
	}
}
