package com.ondot.tests;

import java.lang.reflect.Method;

import java.net.MalformedURLException;
import java.rmi.UnexpectedException;


import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;


import com.ondot.common.GmailPage;

import com.ondot.utils.AutoUtils;

import com.ondot.utils.PropHandlerz;


public class GmailLogin extends Hooks
 {
  
 
 @Test(dataProvider = "hardCodedBrowsers")
 
 public void loginGmailAccount(String browser, String version, String os, Method method) throws UnexpectedException, MalformedURLException, InterruptedException 
{
	  
this.createDriver(browser, version, os, method.getName());
	  
WebDriver driver = this.getWebDriver();
	  
	  
//Creating GmailPage object to supply driver instance
	  
GmailPage objLogin = new GmailPage(driver);
	  
	  
//Opening Gmail Login URL
	  
driver.get(PropHandlerz.fetchProp("gurl"));
	  
AutoUtils.setTimeOut(3000);
	  
	  
//Enter Username or email ID in username field
	  
objLogin.setUname(PropHandlerz.fetchProp("username"));
	  
	  
//Click the next button to navigate to password entry field
	  
objLogin.clickNextBtn();
	  
AutoUtils.setTimeOut(10000);
	  
	  
//Enter Password in Password field
	  
objLogin.setPassword(PropHandlerz.fetchProp("pwd"));
	  
AutoUtils.setTimeOut(2000);
	  
	  
//click SignIn button to login to Gmail Page
	  
objLogin.submitSignIn();
	  
	  
  }
}
