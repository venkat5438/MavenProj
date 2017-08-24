package com.ondot.selenium;

import com.ondot.utils.AutoConstants;
import com.ondot.utils.AutoUtils;
import com.ondot.utils.PropHandlerz;

public class EncryptDecrypt  {
	
	public static void main(String[] args) {
		
	
		//below we are encrypting pwd
		//System.out.println(AutoUtils.pwdencrypt(PropHandlerz.fetchProp(AutoConstants.UnamePwd.PWD)));
		
		
		//below we are decrypting the encrypted pwd
		System.out.println(AutoUtils.pwdDecrypt(PropHandlerz.fetchProp(AutoConstants.UnamePwd.PWD)));
		
		
		
	
		
		
		

	
		
   
		
		
	
	}
	

}
