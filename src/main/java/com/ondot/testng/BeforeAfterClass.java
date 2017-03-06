package com.ondot.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAfterClass {
  
  
  @BeforeClass
  public void browserConfig() {
	  System.out.println("Browser is triggered successfully");
  }
  
  @Test
  public void test1() {
	  System.out.println("Test 1 is executed..");
  }

  @AfterClass
  public void closeBrowser() {
	  System.out.println("Closing the browser..");
  }

}
