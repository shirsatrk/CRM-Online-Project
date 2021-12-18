package com.testPages;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.ActivityPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.utils.utilsBaseClass;

public class HomeTestPage extends utilsBaseClass{

	LoginPage lp;
	HomePage hp;

	@BeforeClass
	public void setup() {
		lp = new LoginPage(driver);
		hp = lp.OpenLoginPage().OpenHomePage();
	}

	@Test
	public void trial() {

		Assert.assertEquals(false, false);
	}
	
}
