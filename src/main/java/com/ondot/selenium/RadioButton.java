package com.ondot.selenium;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.rmi.UnexpectedException;
import java.util.List;

import org.apache.http.impl.cookie.RFC2965CommentUrlAttributeHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ondot.tests.Hooks;
import com.ondot.utils.AutoConstants.URL;
import com.ondot.utils.AutoUtils;
import com.ondot.utils.PropHandlerz;

public class RadioButton extends Hooks {
	
	@Test(dataProvider = "allLinks")
	public void radioButtonMethod(String browser, String version, String os, Method method)
			throws UnexpectedException, MalformedURLException, InterruptedException {

		this.createDriver(browser, version, os, method.getName());
		WebDriver driver = this.getWebDriver();
		
		driver.get(PropHandlerz.fetchProp(URL.RURL));
	
		AutoUtils.setTimeOut(5);
		List<WebElement> radiobutton= driver.findElements(By.xpath("//input[@name='group1']"));
		int count=radiobutton.size();
		System.out.println("radio button count "+ count);
		
		driver.findElement(By.xpath("//input[@value='Milk']")).click();
		AutoUtils.setTimeOut(5);
		
		

}
	


}
