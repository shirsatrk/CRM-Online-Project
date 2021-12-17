package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class utilsBaseClass {

	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;
	
	public static Logger log = Logger.getLogger("log4j.properties");
	
	
	public String readProperties(String key) {
		FileInputStream fis;
		String value = null;
		try {
			fis = new FileInputStream("src/main/resources/config.properties");
			Properties prop = new Properties();
			prop.load(fis);
			value = prop.getProperty(key);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}

	public WebDriver initialisation(String browser) {
		String browserPath = browser.toLowerCase();
		System.out.println("Browser with name " + browser + " is opening.");

		if (browser.equalsIgnoreCase("chrome")) {
			System.out.print("i am in chrome.");
			System.setProperty("webdriver.chrome.driver", readProperties(browserPath));
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", readProperties(browserPath));
			driver = new FirefoxDriver();
		}

		else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", readProperties(browserPath));
			driver = new InternetExplorerDriver();
		} 
		return driver;
	}

	public void reportSetupInitialisation() {
		report = new ExtentReports();
		spark = new ExtentSparkReporter(System.getProperty("user,dir")+"/target/reports/report.html");
		report.attachReporter(spark);
		report.setSystemInfo("Host Name", "RKS");
		report.setSystemInfo("Plastform", "Windows");
		report.setSystemInfo("Environment", "Test Automation");
		}
	
	
	
	
}
