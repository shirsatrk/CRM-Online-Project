package com.testPages.Service;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.LoginPages.LoginPage;
import com.pages.ServicePages.CreateCasePage;

import com.utils.utilsBaseClass;

public class CreateCaseTest extends utilsBaseClass{

	LoginPage lp;
	CreateCasePage cp;
	
	@BeforeClass
	public void setup() {
		lp = new LoginPage(driver);
		cp = lp.OpenLoginPage().OpenHomePage().navigateToServicePage().navigateToCreateCasePage();
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
	
	@Test(priority =1)
	public void validateCreateCaseTitle() {
		Assert.assertEquals(cp.verifyCreateCaseTitle(), true);
	}
	
	@Test(priority =2)
	public void validateCreateCase() {
		Assert.assertEquals(cp.VerifyCreateCases(), true);
	}
	
	@Test(priority =3)
	public void validateCreateCaseInfo() {
		Assert.assertEquals(cp.VerifyCreateCasesWithBlankInfo(), true);
	}
	
	
}
