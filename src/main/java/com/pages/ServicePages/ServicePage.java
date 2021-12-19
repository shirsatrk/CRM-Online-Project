package com.pages.ServicePages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.repositories.Service.ServicePageRepository;



public class ServicePage extends ServicePageRepository {
	WebDriver driver;

	public ServicePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public CreateCasePage navigateToCreateCasePage() {
		com.utils.wait wait = new com.utils.wait();
		wait.explicitWait(creatCaseButton);
		creatCaseButton.click();
		return new CreateCasePage(driver);
		
	}
	
	public ListPage navigateToListPage() {
		com.utils.wait wait = new com.utils.wait();
		wait.explicitWait(listButton);
		listButton.click();
		return new ListPage(driver);	
	}
	
	public ImportSerivcePage navigateToImportSerivcePage() {
		com.utils.wait wait = new com.utils.wait();
		wait.explicitWait(importButton);
		importButton.click();
		return new ImportSerivcePage(driver);	
	}
	
	public ExportServicePage navigateToExportServicePage() {
		com.utils.wait wait = new com.utils.wait();
		wait.explicitWait(exportButton);
		exportButton.click();
		return new ExportServicePage(driver);	
	}
	

	public boolean verifyService() {

		service.click();
		String title = "CRM Tech - Services";
		if (driver.getTitle().equals(title)) {
			return true;
		} else {
			System.out.println("Test case is failed ");
			return false;
		}
	}

	public boolean verifySerivceCase() {

		String Acttitle = Servicecases.getText();
		String Exptitle = "Service Cases";

		if (Acttitle.equals(Exptitle)) {
			return true;
		} else {
			System.out.println("Test case is failed ");
			return false;
		}
	}

	public boolean verifyServicesList() {
		checkbox1.click();
		int count = 0;
		
		List<WebElement> list = listservices;
		for (WebElement text : list) {
			text.getText();
			count++;
		}
		if (count == 5) {
			System.out.println("Total cases are " + count);
			return true;
		} else {
			System.out.println("Total cases are mistmatched");
		}
		return false;

	}

	public boolean vaerifyMoreOptions() {

		checkbox.click();

		if (morebutn.isDisplayed()) {
			System.out.println("More options are Displayed");
			return true;
		} else {
			System.out.println("No options are available for further operation");
		}
		return false;

	}
	
	
	public boolean verifyFilterCases() {
		checkbox1.click();
		checkbox2.click();
		if(caserow.isDisplayed()) {
			System.out.println("Service cases are Filtered sucessfully");
			return true;
		}else {
			System.out.println("Service cases are not filtered");
		}
		return false;
		
	}
	
}
