<%@ page language="java" 
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         import="test.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%UserBean ub =(UserBean)session.getAttribute("ubean");%>
<table border="1">
<caption><%= ub.getFname()+" " %>Details</caption>
<tr>
      <td>FirstName:</td>
      <td><%= ub.getFname()%></td>
</tr>

<tr>
      <td>LastName:</td>
      <td><%= ub.getLname() %></td>
</tr>

<tr>
      <td>Address:</td>
      <td><%= ub.getAdd() %></td>
</tr>
</table>
<a href="out.jsp">back</a>
<a href="logout">logout</a>
</body>
</html>