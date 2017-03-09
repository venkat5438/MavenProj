package com.ondot.selenium;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.rmi.UnexpectedException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.ondot.tests.Hooks;
import com.ondot.utils.AutoConstants.URL;
import com.ondot.utils.PropHandlerz;

public class SeleniumMethods extends Hooks {
	@Test(dataProvider = "hardCodedBrowsers")
	public void setAllMethods(String browser, String version, String os, Method method)
			throws UnexpectedException, MalformedURLException {

		this.createDriver(browser, version, os, method.getName());
		WebDriver driver = this.getWebDriver();
		
		// 1: get() method to open URL, getCurrentUrl(),getPageSource(),...etc...
		
		driver.get(PropHandlerz.fetchProp(URL.URL));
		
		// 2: driver.navigate().refresh(),forward(),back()....etc
		

	}

}
