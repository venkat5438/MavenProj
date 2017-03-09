package com.ondot.selenium;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.rmi.UnexpectedException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ondot.tests.Hooks;
import com.ondot.utils.AutoConstants.URL;
import com.ondot.utils.PropHandlerz;

public class AllLinksInAPage extends Hooks {

	@Test(dataProvider = "hardCodedBrowsers")
	public void allLinks(String browser, String version, String os, Method method)
			throws UnexpectedException, MalformedURLException {

		this.createDriver(browser, version, os, method.getName());
		WebDriver driver = this.getWebDriver();
		driver.get(PropHandlerz.fetchProp(URL.URL));

		// creating a List element to store all the links in a page
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		// below printing the size
	int count=alllinks.size();
	System.out.println("no of links "+ count);
	for (int i = 0; i < count; i++) {
		System.out.println(alllinks.get(i).getAttribute("href"));
		
	}
	

	}

}
