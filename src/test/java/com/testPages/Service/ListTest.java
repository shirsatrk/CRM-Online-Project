package com.testPages.Service;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.LoginPages.LoginPage;
import com.pages.ServicePages.ListPage;
import com.utils.utilsBaseClass;

public class ListTest extends utilsBaseClass{

	LoginPage lp;
	ListPage lpt;
	
	@BeforeClass
	public void setup() {
		lp = new LoginPage(driver);
		lpt = lp.OpenLoginPage().OpenHomePage().navigateToServicePage().navigateToListPage();
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
	
	@Test(priority =1)
	public void validateListPage() {
		Assert.assertEquals(lpt.verifyListCases(), true);
	}
	
	@Test(priority =2)
	public void validateEmailError() {
		Assert.assertEquals(lpt.verifyEmailError(), true);
	}
}
