package com.ondot.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	public static WebDriver driver; // Static Global Variable
	public String path; // Non static global variable

	@Parameters("browser")
	@BeforeClass
	public static void openBrowser(String browser) { // Static function
		if (browser.equals("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\main\\resources\\Lib\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("IE")) {
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "\\src\\main\\resources\\Lib\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else if (browser.equals("safari")) {

			driver = new SafariDriver();
		}

		else {
			System.out.println("Browser mismatch..");
		}

	}

	@AfterClass
	public static void closeBrowser() throws InterruptedException {
		driver.quit();

	}

}
