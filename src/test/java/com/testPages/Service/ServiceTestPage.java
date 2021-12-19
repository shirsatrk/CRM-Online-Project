package com.testPages.Service;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.LoginPages.LoginPage;
import com.pages.ServicePages.ServicePage;
import com.utils.utilsBaseClass;

public class ServiceTestPage extends utilsBaseClass{

	
	LoginPage lp;
	ServicePage sp;

	@BeforeClass
	public void setup() {
		lp = new LoginPage(driver);
		sp = lp.OpenLoginPage().OpenHomePage().navigateToServicePage();
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

	@Test(priority =1)
	public void validateServicePage() {

		Assert.assertEquals(sp.verifyService(), true);
	}
	
	
	@Test(priority =2)
	public void validateSeriveCases() {
		Assert.assertEquals(sp.verifySerivceCase(), true);
	}
	
	
	@Test(priority =3)
	public void validateServiceList() {
		Assert.assertEquals(sp.verifyServicesList(), true);
	}
	
	@Test(priority =4)
	public void validateMoreOptions() {
		Assert.assertEquals(sp.vaerifyMoreOptions(), true);
	}
	
	@Test(priority =5)
	public void validateFilterOptions() {
		Assert.assertEquals(sp.verifyFilterCases(), true);
	}
}
