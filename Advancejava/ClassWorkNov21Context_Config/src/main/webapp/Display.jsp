<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= "Welcome user : "+request.getParameter("uname")+"<br>" %>
<%= "*****ServletContext*****<br>" %>
<%= "Servlet info : "+application.getServerInfo()+"<br>"  %>
<%= "Context Value:"+application.getInitParameter("a")+"<br>" %>
<%= "******ServletConfig*****<br>" %>
<%= "ServletName : "+request.getAttribute("servName")+"<br>" %>
<%= "ConfigValue : "+request.getAttribute("cvalue") %>
</body>
</html>