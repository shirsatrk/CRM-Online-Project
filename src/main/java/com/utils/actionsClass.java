package com.utils;

import java.security.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class actionsClass extends utilsBaseClass {

	public void dragAndDrop(WebElement WebElement, WebElement targetLocation) {
		Actions act = new Actions(driver);
		act.dragAndDrop(WebElement, targetLocation);
		act.perform();
	}

	public void rightClick(WebElement WebelementLocation) {
		Actions act = new Actions(driver);
		act.contextClick(WebelementLocation);
		act.perform();
	}

	public void rightClick() {
		Actions act = new Actions(driver);
		act.contextClick();
		act.perform();
	}

	public void TypeInText(WebElement WebelementLocation, String Keys) {
		Actions act = new Actions(driver);
		act.sendKeys(WebelementLocation, Keys);
		act.perform();
	}

	public void TypeInText(String Keys) {
		Actions act = new Actions(driver);
		act.sendKeys(Keys);
		act.perform();
	}

	public void TypeInText(WebElement WebelementLocation) {
		Actions act = new Actions(driver);
		act.moveToElement(WebelementLocation);
		act.perform();
	}
	
	public void doubleClick(WebElement WebelementLocation) {
		Actions act = new Actions(driver);
		act.doubleClick(WebelementLocation);
		act.perform();
	}
	
	public void doubleClick() {
		Actions act = new Actions(driver);
		act.doubleClick();
		act.perform();
	}
	
	
}
