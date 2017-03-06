package com.ondot.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropHandlerz {
	public static String Filepath=System.getProperty("user.dir")+"\\OR.properties";
	public static Properties OR;
	public static InputStream IO;
	
	public static String fetchProp(String key){
		OR = new Properties();
		try {
			IO = new FileInputStream(Filepath);
			OR.load(IO);
		} catch (FileNotFoundException fe) {
			// TODO Auto-generated catch block
			fe.printStackTrace();
		}catch (IOException io) {
			// TODO Auto-generated catch block
			io.printStackTrace();
		}
		// supply key to return value for respective key..
		String value= OR.getProperty(key);
		return value;
		
	}

}
