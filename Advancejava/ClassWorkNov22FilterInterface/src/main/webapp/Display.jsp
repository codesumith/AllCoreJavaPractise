<%@ page language="java" 
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= "Welcome user : "+request.getParameter("uname")+"<br>" %>
<%= "*****FilterConfig*****<br>" %>
<%= "FilterName : "+request.getAttribute("filName")+"<br>" %>
<%= "Cvalue : "+request.getAttribute("cvalue")+"<br>" %>
</body>
</html>