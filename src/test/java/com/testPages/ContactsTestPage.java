package com.testPages;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.ActivityPage;
import com.pages.ContactsPage;
import com.pages.LoginPage;
import com.utils.utilsBaseClass;

public class ContactsTestPage extends utilsBaseClass{

	LoginPage lp;
	ContactsPage ap;

	@BeforeClass
	public void setup() {
		lp = new LoginPage(driver);
		ap = lp.OpenLoginPage().OpenHomePage().navigateToContactsPage();
	}

	@Test
	public void trial() {

		Assert.assertEquals(false, false);
	}
	
}
