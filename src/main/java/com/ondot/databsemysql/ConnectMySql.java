package com.ondot.databsemysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectMySql {

public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");  // Class is a feature in java and forName is a method contains database name which we need to connect
        //above we passed mysql database

        System.out.println("driver loaded");

        // below we are connecting to database
        //jdbc:mysql://hostname:port/dbname","username","password"
      Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","root","chintu");
        System.out.println("connected to mysql db");

       Statement smt= con.createStatement(); //createStatement is  an interface in java helps to execute any database query
        ResultSet rs= smt.executeQuery("select * from logs");
while(rs.next())
        {
       //String employeename= rs.getString("empname");
       String itemname= rs.getString("logger");
           // System.out.println("Database names   "+employeename);
       System.out.println("department item names "+ itemname);

        }

}}


