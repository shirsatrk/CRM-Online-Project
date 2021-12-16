package com.utils;

public class alerthandles extends utilsBaseClass {

	public void alertDismiss() {
		try {
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().dismiss();
		} catch (Exception e) {
			log.info("Alert is not present to switch.");
	}
}
	public void alertAccept() {
		try {
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			log.info("Alert is not present to switch.");
	}
}
	public void alertSendkey(String text) {
		try {
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().sendKeys(text);
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			log.info("Alert is not present to switch.");
		}
	}
}
