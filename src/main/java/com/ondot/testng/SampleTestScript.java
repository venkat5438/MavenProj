package com.ondot.testng;

import org.testng.annotations.Test;

import com.ondot.common.BaseClass;
import com.ondot.utils.AutoConstants;
import com.ondot.utils.AutoUtils;
import com.ondot.utils.PropHandlerz;

public class SampleTestScript extends BaseClass {
  @Test(groups="REG")
  public void openURL() {
	  driver.get(PropHandlerz.fetchProp(AutoConstants.URL.GURL));
	  AutoUtils.captureScreenShot(driver, "chitnu");
	  
	  //below we are encrypting pwd
	  //AutoUtils.pwdencrypt(AutoConstants.UnamePwd.PWD);
	  
	  //below we are decypting encrypted pwd
	  //AutoUtils.pwdDecrypt(AutoConstants.encryptPwd.encryptPWD);
	  
	  
	  
  }
}
