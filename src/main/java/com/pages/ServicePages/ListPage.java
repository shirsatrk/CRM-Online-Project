package com.pages.ServicePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class ListPage extends com.repositories.Service.ListPageRepository {

	public ListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	public boolean verifyListCases() {
		
		String title = "CRM Tech-Lists";

		if (driver.getTitle().endsWith(title)) {
			System.out.println("User Sucessfully open lists of serivces");
			return true;
		} else {
			System.out.println("User failed to open lists of serivces");
		}

		return false;

	}

	public boolean verifyEmailError() {
		email.sendKeys("grish9091@gmail.com");
		checkbox.click();
		reportlink.click();
		String Act = emailsent.getText();
		
		String text = "Error report sent!";
		
		if (Act.equals(text)) {
			System.out.println("Email sent sucessfully");
			return true;
		} else {
			System.out.println("Email failed to sent");
		}
		return false;
	}

}
