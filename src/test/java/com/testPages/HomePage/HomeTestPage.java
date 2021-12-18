package com.testPages.HomePage;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.HomePages.HomePage;
import com.pages.LoginPages.LoginPage;
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
