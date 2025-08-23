<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
    <%@page import="com.model.*" %>
    
    
 <%
String adminLogin=(String)session.getAttribute("adminLogin");
if(adminLogin==null){
	response.sendRedirect("adminLogin.jsp");
	return ;
}
%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%ArrayList<ReadContacts>  al=(ArrayList<ReadContacts>) session.getAttribute("read") ;
for(ReadContacts rds:al){
%>

     id:-  <%=rds.getId()  %> <br>
     name:- <%=rds.getName() %><br>
     email:- <%=rds.getEmail() %><br>
     subject:- <%=rds.getSubject() %><br>
     message:- <%=rds.getMessage() %><br>
     <a href="<%=request.getContextPath()%>/DeleteContact?id=<%= rds.getId() %>">Delete</a>  <br>
     <% } %> 
</body>
</html>