 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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
<body style="font-family: Arial, sans-serif; background: #f4f6f9; margin: 0; padding: 0;"> 
<div style="max-width: 700px; margin: 80px auto; background: white; padding: 30px; border-radius: 12px; box-shadow: 0px 4px 12px rgba(0,0,0,0.15); text-align:center;">
<h1 style="color:#333; margin-bottom:20px;">Welcome, <%= adminLogin %> 👋</h1>
<a href="readContact" style="display:inline-block; padding:12px 24px; background:#007bff; color:white; 
              text-decoration:none; border-radius:8px; font-size:16px; font-weight:bold;">Read Contacts</a>  <!-- from here we will go to readcontacts servlet  -->
</div>
<div style="max-width:400px; margin: 80px auto; background: white; padding: 10px; border-radius: 10px; text-align:center;">

        <form  action="Logout" method="post">
   <button style=" padding:12px 24px; background:#007bff; color:white; 
              text-decoration:none; border-radius:8px; font-size:16px; font-weight:bold;"> Logout</button> 
             
</form>
 </div>
</body>
</html>