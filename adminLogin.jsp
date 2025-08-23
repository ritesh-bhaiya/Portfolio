<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="font-family: Arial, sans-serif; background: #eef2f3; display:flex; justify-content:center; align-items:center; height:100vh; margin:0;">
<div style="width:350px;  background:white; padding:30px; border-radius:12px; box-shadow:0 4px 12px rgba(0,0,0,0.1);">
 <h2 style="text-align:center; margin-bottom:20px; color:#333;">🔐 Admin Login</h2>
 
<% 
String error=(String)request.getAttribute("errorMessage");
if(error!=null){  %>
<p style="color:#d9534f; text-align:center; margin-bottom:15px; font-weight:bold;" > <%=error %></p>
<% 
}
%>
<form action="AdminLogin" method="post" style="display:flex; flex-direction:column; gap:15px;">
 <input name="username" type="text" placeholder="enter username" style="padding:10px; border:1px solid #ccc; border-radius:8px; font-size:14px;"><br>
 <input name="password" type="password" placeholder="enter password" style="padding:10px; border:1px solid #ccc; border-radius:8px; font-size:14px;"> <br>
 <button style="padding:12px; background:#28a745; border:none; color:white; border-radius:8px; font-size:16px; font-weight:bold; cursor:pointer;">Login</button> <br> 
</form>

</div>
</body>
</html>