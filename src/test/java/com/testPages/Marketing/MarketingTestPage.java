package com.testPages.Marketing;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.LoginPages.LoginPage;
import com.pages.MarketingPages.MarketingPage;
import com.utils.utilsBaseClass;

public class MarketingTestPage extends utilsBaseClass{

	LoginPage lp;
	MarketingPage mp;

	@BeforeClass
	public void setup() {
		lp = new LoginPage(driver);
		mp = lp.OpenLoginPage().OpenHomePage().navigateToMarketingPage();
	}

	@Test
	public void trial() {

		Assert.assertEquals(false, false);
	}
	
}
