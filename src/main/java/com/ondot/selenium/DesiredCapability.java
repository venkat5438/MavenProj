package com.ondot.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\Lib\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\Lib\\IEDriverServer.exe");
		
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(CapabilityType.BROWSER_NAME,"ie");
		capabilities.setCapability(InternetExplorerDriver.
				  INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		WebDriver driver=new InternetExplorerDriver(capabilities);
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		//driver.quit();
		
		
		
	
}
	
	
}
