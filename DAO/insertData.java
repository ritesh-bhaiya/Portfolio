package com.DAO;
import com.service.*;
import java.sql.*;
import com.Connection.*;


public class insertData {
	String result;
	    public String ins(contactService csv){
	     
	        try{ 
//	        CreateDB_Create_TB.createDB("portfolioDB");
//	        CreateDB_Create_TB.createTB("portfolioDB","portfolioTB");
	           Connection con=Connection_Factory.getCon();
	        String sql="insert into portfolioDB.portfolioTB(name,email,subject,message) values(?,?,?,?) ";
	        PreparedStatement ps=con.prepareStatement(sql);
	         ps.setString(1,csv.name);
	         ps.setString(2,csv.email);
	         ps.setString(3,csv.subject);
	         ps.setString(4,csv.message);
	         ps.executeUpdate();
	        result="success";
	        }
	        catch(Exception e){ 
	            result="failed";
	            e.printStackTrace();
	        }
	             return result;
	    }
	    
}
