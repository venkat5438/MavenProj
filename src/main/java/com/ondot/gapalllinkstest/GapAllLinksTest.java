package com.ondot.gapalllinkstest;

import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.jdbc.JDBCAppender;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ondot.utils.AutoUtils;

public class GapAllLinksTest {

	 public static WebDriver driver;
	 private static Logger Log = Logger.getLogger(GapAllLinksTest.class.getName());
	 public static void main(String[] args) throws InterruptedException {
		 System.setProperty("org.apache.logging.log4j.simplelog.StatusLogger.level", "org.apache.commons.logging.impl.Jdk14Logger");
		 BasicConfigurator.configure();
	     Logger OurLogger = LogManager.getLogger("OurLogger");
	     
	     // below is file appender
	    FileAppender fileappender=new FileAppender();
	    fileappender.setFile("E://Log4j//logfile.txt");
	    fileappender.setLayout(new SimpleLayout());
	    OurLogger.addAppender(fileappender);
	    fileappender.activateOptions();
	    // below is console appender
	    ConsoleAppender ConsoleAppender = new ConsoleAppender();
	     ConsoleAppender.setLayout(new SimpleLayout());
	     OurLogger.addAppender(ConsoleAppender);
	     ConsoleAppender.activateOptions();
	     
	    /* // below is JDBC appender
	     JDBCAppender dataBaseAppender = new JDBCAppender();// create jdbc appender class instance
	   //Provide connection details to the 
	     //Database appender
	     dataBaseAppender.setURL("jdbc:mysql://localhost:3306/selenium"); //Connection url
	     dataBaseAppender.setUser("root"); //Username for the DB connection
	     dataBaseAppender.setPassword("chintu"); //Password for the DB connection
	     dataBaseAppender.setDriver("com.mysql.jdbc.Driver"); // Drivers to use to connect to DB
         //set the sql insert statement that you want to use
	     dataBaseAppender.setSql("INSERT INTO LOGS VALUES ('%x', now() ,'%C','%p','%m'");   
         //activate the new options
	     dataBaseAppender.activateOptions();
	     */
         
	    //DOMConfigurator.configure("log4j.xml");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		Log.info("New driver instantiated");
		driver.get("http://www.gap.com/");
		Thread.sleep(5000);
		Log.info("sleep applied on the driver for 5 seconds");
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		int count=alllinks.size();
		System.out.println("no of links "+ count);
		Log.info("above printed no of links count");
     /* for (int i = 0; i < count; i++) {
     System.out.println(alllinks.get(i).getAttribute("href"));
     AutoUtils.checkResponse(alllinks.get(i).getAttribute("href"));
     } */
		
		for (WebElement webElement : alllinks) 
		{
			System.out.println(webElement.getAttribute("href"));
			AutoUtils.checkResponse(webElement.getAttribute("href"));
			}
		driver.quit();
		Log.info("we closed the browser");
	}

}
