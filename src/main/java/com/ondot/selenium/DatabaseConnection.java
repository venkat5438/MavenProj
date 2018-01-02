package com.ondot.selenium;


import java.sql.*;

import org.testng.annotations.Test;

public class DatabaseConnection {
    @Test
    public void testDB() throws ClassNotFoundException, SQLException  {
    	
    	//if it is maven we need sql connector dependecy,if it not maven then need sql connector jar file in our project
        
        Class.forName("com.mysql.jdbc.Driver");  // Class is a feature in java and forName is a method contains database name which we need to connect
        //above we passed mysql database

        System.out.println("driver loaded");

        // below we are connecting to database
        //jdbc:mysql://hostname:port/dbname","username","password"
      Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","root","chintu");
        System.out.println("connected to mysql db");

       Statement smt= con.createStatement(); //createStatement is  an interface in java helps to execute any database query
        ResultSet rs= smt.executeQuery("select * from employee");

        while(rs.next())
        {
       String employeename= rs.getString("empname");
       String empid= rs.getString("empid");
       String empadress= rs.getString("address");
       String empcity= rs.getString("city");
       
            System.out.println("Database name   "+employeename);
            System.out.println("Database name   "+empid);
            System.out.println("Database name   "+empadress);
            System.out.println("Database name   "+empcity);


        }
    }
}
