package com.pages.ContactPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.repositories.Contact.ContactsPageReporsitory;

public class ContactsPage extends ContactsPageReporsitory {

	WebDriver driver;

	public ContactsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public ListsPage navigateToListsPage() {
		com.utils.wait wait = new com.utils.wait();
		wait.explicitWait(listbutton);
		listbutton.click();
		return new ListsPage(driver);
	}

	public CreatecontactPage navigateToCreatecontactPage() {
		com.utils.wait wait = new com.utils.wait();
		wait.explicitWait(createcontactButton);
		createcontactButton.click();
		return new CreatecontactPage(driver);
	}

	public ImportcontactPage navigateToImportcontactPage() {
		com.utils.wait wait = new com.utils.wait();
		wait.explicitWait(importcontactsButton);
		importcontactsButton.click();
		return new ImportcontactPage(driver);
	}

	public ExportcontactPage navigateToExportcontactPage() {
		com.utils.wait wait = new com.utils.wait();
		wait.explicitWait(exportcontactsButton);
		exportcontactsButton.click();
		return new ExportcontactPage(driver);
	}
	
	public void contacts() {
		contactTab.click();
		
	}
}
