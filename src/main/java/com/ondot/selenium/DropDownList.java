package com.ondot.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ondot.utils.AutoUtils;

public class DropDownList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\Lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		AutoUtils.setTimeOut(5);
		List<WebElement> dropdown=driver.findElements(By.xpath("//select[@id='lang-chooser']/option"));
		int count =dropdown.size();
		System.out.println(count);
		
		for (int i = 0; i <count; i++) {
			System.out.println(dropdown.get(i).getText());
			
		}
		System.out.println(driver.findElement(By.xpath("//select[@id='lang-chooser']/option[40]")).getText());
       WebElement ele=driver.findElement(By.xpath("//select[@id='lang-chooser']/option[60]"));
       ele.click();
       System.out.println("find my accnt "+ driver.findElement(By.xpath("//*[@id='gaia_firstform']/div/a")).getText());
     
	}

}
