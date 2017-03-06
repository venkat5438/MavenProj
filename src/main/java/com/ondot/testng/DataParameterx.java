package com.ondot.testng;

import org.testng.annotations.DataProvider;

public class DataParameterx {
 

  @DataProvider
  public static Object[][] keyData() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  
  @DataProvider(name="user",parallel=true)
  public static Object[][] user() {
    return new Object[][] {
      new Object[] { "Suresh", "Test#123" },
      new Object[] { "Pallavi", "p@123" },
      new Object[] { "#$%^", "@#&*(" },
    };
  }
}
