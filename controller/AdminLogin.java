package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Connection.*;

/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		 System.out.println("Entered username: " + username);
	        System.out.println("Entered password: " + password);
	     try {
	    	 Connection con=Connection_Factory.getCon();
	    	 String sql="select * from portfolioDB.loginTable where username=? and `password`=? ";
	    	 PreparedStatement ps=con.prepareStatement(sql);
	    	 ps.setString(1,username);
	    	 ps.setString(2,password);
	    	 ResultSet rs=ps.executeQuery();
	    	 if (rs.next()) {
	    		 HttpSession session=request.getSession();
	    		 session.setAttribute("adminLogin",username);	    		 
	    		    System.out.println("✅ Match found in DB for " + username);
	    		    response.sendRedirect("adminPanel.jsp");
	    		} else {
	    		    System.out.println("❌ No match in DB for " + username);
	    		    request.setAttribute("errorMessage","Invalid username or password");
	    		    request.getRequestDispatcher("adminLogin.jsp").forward(request,response);
	    		    
	    		}	    	 
	     }
	     catch(Exception e){
	    	 e.printStackTrace();
	     }

		
	}

}
