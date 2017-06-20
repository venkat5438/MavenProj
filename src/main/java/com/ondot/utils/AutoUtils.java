package com.ondot.utils;



import org.apache.commons.codec.binary.Base64;
import org.apache.http.client.fluent.Request;

public class AutoUtils {

	public static void setTimeOut(int seconds) throws InterruptedException {
		Thread.sleep(seconds);
	}

	public static boolean checkResponse(String url) 
	{
		try {
			int response_code = Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
			System.out.println(response_code);
			if (response_code == 200)
				return true;
			else {
				return false;
			     }

		     } 
		
		catch (Exception e)
		{
			return false;
		}

	}
	
	public static byte[] pwdencrypt(String password) {

		byte[] pwd = password.getBytes();
		byte[] encodedBytes = Base64.encodeBase64(pwd);
         System.out.println("encodedBytes " + new String(encodedBytes));
		return encodedBytes;

	}

	public static byte[] pwdDecrypt(String password) {
		byte[] pwd = password.getBytes();
		byte[] decodedBytes = Base64.decodeBase64(pwd);
		System.out.println("decodedBytes " + new String(decodedBytes));
		return decodedBytes;
	}

}
