package com.testPages.Opportunitis;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.LoginPages.LoginPage;
import com.pages.OpportunitiesPages.OpportunitiesPage;
import com.utils.utilsBaseClass;

public class OpportunitiesTestPage extends utilsBaseClass{

	LoginPage lp;
	OpportunitiesPage op;
	
	@BeforeClass
	public void setup() {
		lp = new LoginPage(driver);
		op = lp.OpenLoginPage().OpenHomePage().navigateToOpportunitiesPage();
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.close();
		
	}

	@Test
	public void Actionslist() {

		Assert.assertEquals(op.checkActionsList(), true);
		}
	
	
	@Test
	public void actionsTitle() {
		Assert.assertEquals(op.portletTitle(), true);
		}
	}
