package com.utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClass extends utilsBaseClass {

	private List<String> allOptions;

	public void select(WebElement Webelement, int index) {
		Select sc = new Select(Webelement);
		sc.selectByIndex(index);
	}

	public void select(WebElement Webelement, String value) {
		Select sc = new Select(Webelement);
		sc.selectByValue(value);
	}

	public void select(String text, WebElement Webelement) {
		Select sc = new Select(Webelement);
		sc.selectByVisibleText(text);
	}

	public void deselect(WebElement Webelement, int index) {
		Select sc = new Select(Webelement);
		sc.deselectByIndex(index);
	}

	public void deselect(WebElement Webelement, String value) {
		Select sc = new Select(Webelement);
		sc.deselectByValue(value);
	}

	public void deselect(String text, WebElement Webelement) {
		Select sc = new Select(Webelement);
		sc.deselectByVisibleText(text);
	}

	public void selectMultiple(WebElement Webelement, List<String> value) {
		Select sc = new Select(Webelement);
		ArrayList<String> allOptions = new ArrayList<String>();
		if (sc.isMultiple()) {
			List<WebElement> options = sc.getOptions();
			for (WebElement option : options) {
				allOptions.add(option.getText());
			}
			for (String text : allOptions) {
				for (String val : value)
					if (text.equalsIgnoreCase(val)) {
						sc.selectByVisibleText(val);
				}
			}
		}
	}

}