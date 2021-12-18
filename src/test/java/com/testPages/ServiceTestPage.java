package com.testPages;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.ActivityPage;
import com.pages.LoginPage;
import com.pages.ServicePage;
import com.utils.utilsBaseClass;

public class ServiceTestPage extends utilsBaseClass{

	
	LoginPage lp;
	ServicePage sp;

	@BeforeClass
	public void setup() {
		lp = new LoginPage(driver);
		sp = lp.OpenLoginPage().OpenHomePage().navigateToServicePage();
	}

	@Test
	public void trial() {

		Assert.assertEquals(false, false);
	}
}
