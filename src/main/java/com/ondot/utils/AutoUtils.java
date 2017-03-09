package com.ondot.utils;

import org.apache.http.client.fluent.Request;

public class AutoUtils {

 public static void setTimeOut(int seconds) throws InterruptedException{
	Thread.sleep(seconds); 
 }
 
 public static boolean checkResponse(String url){
		try {
	           int response_code= Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
	           System.out.println(response_code);
	           if(response_code==200)
	        	   return true;
	           else{
	        	   return false;
	           }
	           
			} catch (Exception e) {
	            return false;
	        }
	
}
 
}
