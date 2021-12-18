package com.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait extends utilsBaseClass{
	WebDriverWait wait;
	
	public void explicitWait(WebElement webelement) {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(webelement));
	}
	
	
	
	
}
