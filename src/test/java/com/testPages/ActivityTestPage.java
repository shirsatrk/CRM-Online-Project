package com.testPages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.ActivityPage;
import com.pages.LoginPage;
import com.utils.utilsBaseClass;

public class ActivityTestPage extends utilsBaseClass{
	LoginPage lp;
	ActivityPage ap;
	
	@BeforeClass
	public void setup() {
		lp = new LoginPage(driver);
		ap = lp.OpenLoginPage().OpenActivityPage();
		}
	
	
	
	@Test
	public void trial() {
		
		Assert.assertEquals(false, false);
	}
	
}
