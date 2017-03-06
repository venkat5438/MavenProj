package com.ondot.testng;

import org.testng.annotations.Test;

public class DataHandlex {
  @Test(dataProviderClass=DataParameterx.class,dataProvider = "user")
  public void userProfile(String uname, String pwd) {
	  System.out.println("Name of the candidate & Pwd:"+uname+"---"+pwd);
 }

  /*@DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Suresh", "Test@123" },
      new Object[] { "Pallavi", "p@123" },
      new Object[] { "#$%^", "@#&*(" },
    };
  }*/
}
