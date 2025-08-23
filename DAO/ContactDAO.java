package com.DAO;
import com.model.*;
import java.util.*;
import com.Connection.*;
import java.sql.*;
public class ContactDAO {
public ArrayList<ReadContacts>  read(){
	ArrayList<ReadContacts> al=new ArrayList<>();
      
	//get the data a,b,c,d,e//from the sql table 
	try {
		Connection con=Connection_Factory.getCon();
		String sql="select * from portfolioDB.portfolioTB ";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while (rs.next()){
			int id=rs.getInt("id");
			String name=rs.getString("name");
			String email=rs.getString("email");
			String subject=rs.getString("subject");
			String message=rs.getString("message");
			ReadContacts rds=new ReadContacts(id,name,email,subject,message);
			al.add(rds);
			System.out.println("read successful");

		}
		ps.close();
		con.close();
	}
	catch(Exception e) {
		System.out.println("reading failed");
		e.printStackTrace();
		
	}
return al;
}
}
