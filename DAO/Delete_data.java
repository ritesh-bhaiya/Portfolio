package com.DAO;
import com.Connection.*;
import java.sql.*;
public class Delete_data {
public void delete(int id) {
	Connection con=Connection_Factory.getCon();
	try {
	String sql="delete from portfolioDB.portfolioTB where id=?";	
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setInt(1, id);
	ps.executeUpdate();
	System.out.println("Data deleted successfully");
	}
	catch(Exception e) {
		System.out.println("failed to delete the data");
		e.printStackTrace();
	}
}
}
