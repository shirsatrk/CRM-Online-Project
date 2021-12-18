package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.repositories.LoginPageRepository;
import com.utils.actionsClass;

public class LoginPage extends LoginPageRepository {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public LoginPage OpenLoginPage() {
		driver = initialisation("chrome");
		driver.get(readProperties("url"));
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		return new LoginPage(driver);

	}

	public HomePage OpenHomePage() {
		uname.sendKeys("admin");
		password.sendKeys("pass");
		loginButton.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loginButton.click();
		com.utils.wait wait = new com.utils.wait();
		wait.explicitWait(activiyButton);
		activiyButton.click();
		return new HomePage(driver);
	}

	
	
	
}
