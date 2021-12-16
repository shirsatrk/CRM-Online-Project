package com.utils;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class windowHandler {

	public Set<String> getWindowHandle(WebDriver driver) {
		Set<String> WindowHandles = driver.getWindowHandles();
		return WindowHandles;
	}

	public void switchToChildWindow(WebDriver driver) {
		String parent = driver.getWindowHandle();
		Set<String> WindowHandles = driver.getWindowHandles();
		for (String allWin : WindowHandles) {
			if (!allWin.equals(parent)) {
				driver.switchTo().window(allWin);
			} else {
				System.out.println("Windows not avalaible.");
			}
		}
	}
}