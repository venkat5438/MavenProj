package com.ondot.selenium;

import java.util.List;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ondot.utils.AutoUtils;
public class Log4J {
	
	public static WebDriver driver;
	//below is for which class we need logger..here LOG4J class
	private static Logger Log = Logger.getLogger(Log4J.class.getName());
	
	public static void main(String[] args) throws InterruptedException {
		
		 //System.setProperty("org.apache.logging.log4j.simplelog.StatusLogger.level", "org.apache.commons.logging.impl.Jdk14Logger");
		 //BasicConfigurator.configure();
	       Logger OurLogger = LogManager.getLogger("OurLogger");
	       PropertyConfigurator.configure("log4j.properties");
	     
	         // below is file appender
		    FileAppender fileappender=new FileAppender();
		    fileappender.setFile("E://Log4j//logfile.txt");
		    fileappender.setLayout(new SimpleLayout());
		    OurLogger.addAppender(fileappender);//OurLogger
		    fileappender.activateOptions();
		    
		    //below following code sets the logger to the info level, which means all messages with severe, warning and info will be logged.
		   // Log.setLevel(Level.INFO);
		    OurLogger.setLevel(Level.ALL);
		    
		    
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
				driver.get("https://qa-timesheets.mynisum.com");
				Thread.sleep(2000);
				Log.info("sleep applied on the driver for 5 seconds");
				List<WebElement> alllinks=driver.findElements(By.tagName("a"));
				Thread.sleep(3000);
				int count=alllinks.size();
				Log.debug("counted all links");
				System.out.println("printed count"+ count);
				Log.debug(alllinks);
				Log.debug("count printed");
				Log.info("above printed no of links count");
		     
				 for (int i = 0; i < count; i++) {
		     System.out.println(alllinks.get(i).getAttribute("href"));
		     Log.debug("href");
		     Log.debug("href");
		     Log.debug("href");
		     Log.debug("href");
		     AutoUtils.checkResponse(alllinks.get(i).getAttribute("href"));
		     Log.debug("href");
		     } 
				
				
				/*for (WebElement webElement : alllinks) 
				{
					System.out.println(webElement.getAttribute("href"));
					Log.debug("href");
					System.out.println(webElement.getTagName());
					Log.debug("href");
					System.out.println(webElement.getText());
					Log.debug("href");
					AutoUtils.checkResponse(webElement.getAttribute("href"));
					Log.debug("href");
					}*/
				driver.quit();
				Log.info("we closed the browser");
		
	}

}
