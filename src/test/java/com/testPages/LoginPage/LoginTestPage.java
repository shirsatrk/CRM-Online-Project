package com.testPages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.LoginPages.LoginPage;
import com.utils.utilsBaseClass;

public class LoginTestPage extends utilsBaseClass{

	LoginPage lp;
	
	@BeforeClass
	public void setup() {
		lp = new LoginPage(driver);
		lp = lp.OpenLoginPage();
	}

	@Test
	public void trial() {

		Assert.assertEquals(false, false);
	}
	
}
