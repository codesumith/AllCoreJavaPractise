<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= "Welcome to:"+request.getAttribute("fname")%><br><br>
<a href="view">viewBio</a><br><br>
<a href="update.jsp">UpdateBio</a><br><br>
<a href="logout">Logout</a>
</body>
</html>