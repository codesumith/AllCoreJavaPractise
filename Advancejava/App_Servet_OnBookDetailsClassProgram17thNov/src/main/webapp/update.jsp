<%@ page language="java" 
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         import="com.sumith.bookdetails.AdminBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
AdminBean ab =(AdminBean)session.getAttribute("abean");
out.print("This page belongs to :"+ab.getFname());
out.print("<br>Book Details updated successfully...");
%>
<a href=book.html>Add Book</a><br><br>
<a href=view>View All Books</a><br><br>
<a href=logout>Logout</a><br><br>
</body>
</html>