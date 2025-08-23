package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.service.*;
import com.DAO.*;
/**
 * Servlet implementation class contact_servlet
 */
@WebServlet("/contact_servlet")
public class contact_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public contact_servlet() {
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

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	    //extracting data from the html 
	       String name=request.getParameter("name");
	       String email=request.getParameter("email");
	       String subject=request.getParameter("subject");
	       String message=request.getParameter("message");
	       contactService csv=new contactService(name,email,subject,message);
	       //validate then move further 
	       insertData ida=new insertData();
	        String res=ida.ins(csv);
	        if(res.equals("success")){
	             response.sendRedirect("index.html");

	        }
	            else if(res.equals("failed")){
	            response.sendRedirect("fail.html");
	        }
	}

}
