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
<form action="update" method="post">
<h3>Update Details</h3>
<%UserBean ub =(UserBean)session.getAttribute("ubean");%>
PassWord:<input type="text" name="pass" value=<%= ub.getPass() %>>
FirstName:<input type="text" name="fname" value=<%= ub.getFname() %>>
LastName:<input type="text" name="lname" value=<%= ub.getLname() %>>
Address:<input type="text" name="add" value=<%= ub.getAdd() %>>
<input type="submit" value="update">
</form>
</body>
</html>