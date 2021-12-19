package com.testPages.Service;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.LoginPages.LoginPage;
import com.pages.ServicePages.ImportSerivcePage;
import com.utils.utilsBaseClass;

public class ImportServiceTest extends utilsBaseClass {

	LoginPage lp;
	ImportSerivcePage ip;

	@BeforeClass
	public void setup() {
		lp = new LoginPage(driver);
		ip = lp.OpenLoginPage().OpenHomePage().navigateToServicePage().navigateToImportSerivcePage();
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

	@Test(priority = 1)
	public void validateImportServicePage() {
		Assert.assertEquals(ip.verifyImportPageTitle(), true);
	}

	@Test(priority = 2)
	public void validateImportServicePageBlankDetails() {
		Assert.assertEquals(ip.verifyImportServicesBlankSubmit(), true);
	}

}
