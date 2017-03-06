package com.ondot.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterTest {
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test is executed..");
  }
  
  @Test(groups={"REG"})
  public void function1() {
	  System.out.println("Function 1 is executed..");
  }
  
  @Test(groups={"SMOKE"})
  public void function2() {
	  System.out.println("Function 2 is executed..");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test is executed..");
  }

}
