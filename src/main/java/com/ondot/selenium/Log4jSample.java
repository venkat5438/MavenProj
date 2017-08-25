package com.ondot.selenium;

import java.io.IOException;
import java.sql.SQLException;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class Log4jSample {
	
	final static Logger logger = Logger.getLogger(Log4jSample.class.getName());
	
	  
	public static void main(String[] args)throws IOException,SQLException
		   
		   {
		   
		PropertyConfigurator.configure("log4j.properties");
		  logger.info("this is info");
		  logger.warn("this is warn");
	      logger.debug("this is debug");
	      logger.error("this is error");
	      logger.fatal("this is fatal");
	   
	      //log4j:ERROR Failed to load driver java.lang.ClassNotFoundException: com.mysql.jdbc.Driver
	      // if we see the above error need to add sql connector jar file to our project
	      }
}
