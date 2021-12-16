package com.utils;

import java.util.List;

import org.openqa.selenium.WebElement;

public class radioButton {

	public void selectRadioButton(List<WebElement> radios, String text) {

		for (WebElement radio : radios) {
			if (radio.getAttribute("value").equals(text)) {
				radio.click();
				break;
			}
		}
	}
}
