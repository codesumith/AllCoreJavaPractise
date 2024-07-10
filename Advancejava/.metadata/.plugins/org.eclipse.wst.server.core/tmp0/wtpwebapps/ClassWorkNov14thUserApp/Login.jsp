<%@ page language="java" 
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         import="com.sumith.userapp.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
<%
UserBean ub =(UserBean)application.getAttribute("ubean");
out.print("Welcome user : "+ub.getFirstName()+"<br>");
%>
<a href="view">ViewProfile</a>
<a href="edit">EditProfile</a>
<a href="logout">Logout</a>
</body>
</html>