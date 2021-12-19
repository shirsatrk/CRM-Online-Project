package com.testPages.Service;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.LoginPages.LoginPage;
import com.pages.ServicePages.ExportServicePage;
import com.utils.utilsBaseClass;

public class ExportServiceTest extends utilsBaseClass{

	LoginPage lp;
	ExportServicePage exp;
	
	@BeforeClass
	public void setup() {
		lp = new LoginPage(driver);
		exp = lp.OpenLoginPage().OpenHomePage().navigateToServicePage().navigateToExportServicePage();
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
	@Test(priority = 1)
	public void validateExportServicePage() {
		Assert.assertEquals(exp.verifyExportPageTitle(), true);
	}

	@Test(priority = 2)
	public void validateExportServices() {
		Assert.assertEquals(exp.verifyExportServices(), true);
	}
	
	@Test(priority = 3)
	public void validateExportServicesBlankSubmit() {
		Assert.assertEquals(exp.verifyExportServicesBlankSubmit(), true);
	}
	
	@Test(priority = 4)
	public void validateExportServicesDownload() {
		Assert.assertEquals(exp.verifyExportServicesDownload(), true);
	}
	
	
	
}
