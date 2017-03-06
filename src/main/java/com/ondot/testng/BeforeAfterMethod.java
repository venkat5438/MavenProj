package com.ondot.testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method is executed");
  }
  
  @Test(testName="register",description="Register a profile",priority=1,groups={"REG","SMK"})
  public void register() {
	  System.out.println("Registration is executed..");
	  Assert.assertEquals(false, true);
  }
  
  @Test(dependsOnMethods="register",enabled=true,alwaysRun=true)
  public void login() {
	  System.out.println("Login is executed..");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method is executed..");
  }

}
