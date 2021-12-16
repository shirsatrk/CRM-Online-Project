package com.utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class checkbox {
	public void selectCheckbox(List<WebElement> checkboxes, String text) {
		for (WebElement checkbox : checkboxes) {
			if (checkbox.getAttribute("value").equals(text)) {
				checkbox.click();
				break;
			}
		}
	}

	public void selectMultipleCheckboxes(List<WebElement> checkboxes, ArrayList<String> values) {
		for (String text : values) {
			for (WebElement checkbox : checkboxes) {
				if (checkbox.getAttribute("value").equals(text)) {
					checkbox.click();
					break;
				}
			}
		}
	}
}
