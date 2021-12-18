package com.testPages;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.ActivityPage;
import com.pages.LoginPage;
import com.pages.OpportunitiesPage;
import com.utils.utilsBaseClass;

public class OpportunitiesTestPage extends utilsBaseClass{

	LoginPage lp;
	OpportunitiesPage op;

	@BeforeClass
	public void setup() {
		lp = new LoginPage(driver);
		op = lp.OpenLoginPage().OpenHomePage().navigateToOpportunitiesPage();
	}

	@Test
	public void trial() {

		Assert.assertEquals(false, false);
	}
	
}
