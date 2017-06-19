package com.ondot.selenium;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.rmi.UnexpectedException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.ondot.tests.Hooks;
import com.ondot.utils.PropHandlerz;
import com.ondot.utils.AutoConstants.URL;
import com.ondot.utils.AutoUtils;

public class PopupAlert extends Hooks {
	
	@Test(dataProvider = "hardCodedBrowsers")
	public void popUpAlert(String browser, String version, String os, Method method)
			throws UnexpectedException, MalformedURLException, InterruptedException {

		this.createDriver(browser, version, os, method.getName());
		WebDriver driver = this.getWebDriver();
		driver.get(PropHandlerz.fetchProp(URL.PURL));
		AutoUtils.setTimeOut(5000);
		
		// below we are using set and getting the window handle id's(set wont allow duplicate records)
		Set<String> windId=driver.getWindowHandles();
		System.out.println(windId);
		
		//we are using iterator and collecting winids.are alphanumeric..since it is alpha numeric so using string
		Iterator<String> it=windId.iterator();
		System.out.println(it);
		
		// taking while
		
		while (it.hasNext()) 
			System.out.println(it.next());
			it=windId.iterator();
			String mainwindow=it.next();
			String popupwindow=it.next();
			System.out.println(mainwindow + "-->" + popupwindow);
			
			driver.switchTo().window(popupwindow);
			System.out.println("window title" + driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.close();
			
			driver.switchTo().window(mainwindow);
			
			driver.findElement(By.xpath(".//*[@id='signin_info']/a[1]")).click();
			AutoUtils.setTimeOut(4000);
			
			driver.findElement(By.xpath("//input[@name='proceed']")).click();
			
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
			
			driver.switchTo().defaultContent();
			
			driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("venkatramreddy");
			
		//	driver.quit();
			
		
		
		
		
		
		
		
	}
}
