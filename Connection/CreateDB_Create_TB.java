package com.Connection;
import java.sql.*;
public class CreateDB_Create_TB {
	 public static void createDB(String name) {
			try {
				Connection con=Connection_Factory.getCon();
				String sql="create database IF NOT EXISTS "+name;
				PreparedStatement ps=con.prepareStatement(sql);
		      		ps.executeUpdate();
				System.out.println("Databse created successfully");
					}
			catch(Exception e) {
				System.out.println("Databse creation failed");
				e.printStackTrace();
			}
		}
		public static void createTB(String dbname,String tbname) {
			try {
				Connection con=Connection_Factory.getCon();
		//name email subjecr message is req in the table		
		                String sql = "CREATE TABLE IF NOT EXISTS "+dbname+"."+tbname + "("  +
		              "id INT PRIMARY KEY AUTO_INCREMENT ," +
		               "name VARCHAR(30)," +
		              "email VARCHAR(50),"+         
		              "subject VARCHAR(100),"+   
		              "message VARCHAR(500))";	
		                
				PreparedStatement ps=con.prepareStatement(sql);
				ps.executeUpdate();
		                System.out.println("table created successfully");
			}
			catch(Exception e) {
				e.printStackTrace();
		                System.out.println("table creation failed");
		                
			}
		}
}
