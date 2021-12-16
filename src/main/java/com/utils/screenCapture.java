package com.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class screenCapture extends utilsBaseClass {

	public String screenShot(String testName) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy, HH/mm/ss");
		String timeStamp = sdf.format(new Date());
		String name = timeStamp + testName;
		TakesScreenshot screenCapture = (TakesScreenshot) driver;
		File src = screenCapture.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir") + "/target/screenshot/" + name + ".png";
		try {
			FileUtils.copyFileToDirectory(src, new File(dest));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dest;
	}

	
	
	
}