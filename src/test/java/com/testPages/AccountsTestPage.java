package com.testPages;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.AccountsPage;
import com.pages.ActivityPage;
import com.pages.LoginPage;
import com.utils.utilsBaseClass;

public class AccountsTestPage extends utilsBaseClass {

	
	LoginPage lp;
	AccountsPage ap;

	@BeforeClass
	public void setup() {
		lp = new LoginPage(driver);
		ap = lp.OpenLoginPage().OpenHomePage().navigateToAccountsPage();
	}

	@Test
	public void trial() {

		Assert.assertEquals(false, false);
	}
	
}
