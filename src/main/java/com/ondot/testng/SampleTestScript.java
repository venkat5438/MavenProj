package com.ondot.testng;

import org.testng.annotations.Test;

import com.ondot.common.BaseClass;
import com.ondot.utils.AutoConstants;
import com.ondot.utils.PropHandlerz;

public class SampleTestScript extends BaseClass {
  @Test(groups="REG")
  public void openURL() {
	  driver.get(PropHandlerz.fetchProp(AutoConstants.URL.URL));
  }
}
