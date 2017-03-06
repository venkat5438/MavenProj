package com.ondot.tests;


import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.rmi.UnexpectedException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.ondot.utils.AutoConstants;
import com.ondot.utils.PropHandlerz;



public class SampleTest extends Hooks {
  
  @Test(dataProvider = "hardCodedBrowsers")
  public void openGmailUrl(String browser, String version, String os, Method method) throws UnexpectedException, MalformedURLException {
	  this.createDriver(browser, version, os, method.getName());
      WebDriver driver = this.getWebDriver(); 
      
      // Open selenium official site..
	  driver.get(PropHandlerz.fetchProp(AutoConstants.URL.URL));
  }
}
