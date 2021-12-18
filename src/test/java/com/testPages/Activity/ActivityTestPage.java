package com.testPages.Activity;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.ActivityPages.ActivityPage;
import com.pages.LoginPages.LoginPage;
import com.utils.utilsBaseClass;

public class ActivityTestPage extends utilsBaseClass {
	LoginPage lp;
	ActivityPage ap;

	@BeforeClass
	public void setup() {
		lp = new LoginPage(driver);
		ap = lp.OpenLoginPage().OpenHomePage().navigateToActivityPage();
	}

	@Test
	public void trial() {

		Assert.assertEquals(false, false);
	}

}
