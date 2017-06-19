package com.ondot.sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliProject {

	public static WebDriver driver;

	public static void main(String[] args) throws FindFailed, InterruptedException {
		// driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "E://my softwares//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:1080/WebTours/index.htm");
		/*Pattern username = new Pattern("E:\\SIKULI\\seleniumsikuli\\username.PNG");
		Pattern password = new Pattern("E:\\SIKULI\\seleniumsikuli\\password.PNG");
		Pattern signin = new Pattern("E:\\SIKULI\\seleniumsikuli\\signin.PNG");
		Pattern signup= new Pattern("E:\\SIKULI\\seleniumsikuli\\signup.PNG");
     	Screen screen = new Screen();
		screen.type(username, "jojo");
		screen.type(password, "bean");
		screen.click(signin);
		Thread.sleep(5000);*/
		String[] str={"chintu","baddam","raghu","ram","gopi","praveen"};
		System.out.println(str.length);
	    Screen screen = new Screen();
	
		
		for (String string : str) {
			
			Pattern signup= new Pattern("E:\\SIKULI\\seleniumsikuli\\signup.PNG");
			screen.click(signup);
			Thread.sleep(2000);
			
			Pattern uname= new Pattern("E:\\SIKULI\\seleniumsikuli\\UNAME.PNG");
			screen.type(uname, string);
			
			Pattern pwd= new Pattern("E:\\SIKULI\\seleniumsikuli\\upwd.PNG");
			screen.type(pwd, "uname");
			
			Pattern cpwd= new Pattern("E:\\SIKULI\\seleniumsikuli\\Confpwd.PNG");
			screen.type(cpwd, "uname");
			Thread.sleep(2000);
			
			Pattern contin= new Pattern("E:\\SIKULI\\seleniumsikuli\\continue.PNG");
			screen.click(contin);
			Thread.sleep(2000);
			
			Pattern contin2= new Pattern("E:\\SIKULI\\seleniumsikuli\\continue2.PNG");
			screen.click(contin2);
			Thread.sleep(3000);

			Pattern signoff= new Pattern("E:\\SIKULI\\seleniumsikuli\\signoff.PNG");
			screen.click(signoff);
			Thread.sleep(3000);
			
			
			
		}
	    
		
		System.out.println("users created successfully");
		
		

        
		
		

	}

}
