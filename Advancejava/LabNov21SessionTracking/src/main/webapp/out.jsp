<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<caption>Details</caption>
<tr>
     <td>Name:</td>
     <td><%= session.getAttribute("name") %></td>
</tr>
<tr>
     <td>Age:</td>
     <td><%= session.getAttribute("age") %></td>
</tr>
<tr>
     <td>Mobile:</td>
     <td><%= session.getAttribute("mobile") %></td>
</tr>
<tr>
      <td>HighestDegree:</td>
     <td><%= request.getParameter("hd")%></td>
</tr>
<tr>
      <td>YearOfPassedOut:</td>
     <td><%= request.getParameter("yop")%></td>
</tr>
<tr>
      <td>University:</td>
     <td><%= request.getParameter("uv")%></td>
</tr>
</table>
<%HttpSession hs =request.getSession();
hs.invalidate();%>
</body>
</html>