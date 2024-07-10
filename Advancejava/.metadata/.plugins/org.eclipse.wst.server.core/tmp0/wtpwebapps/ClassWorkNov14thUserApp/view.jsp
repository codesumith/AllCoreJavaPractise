<%@ page language="java" 
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         import="com.sumith.userapp.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String fName=(String) request.getAttribute("fName");
UserBean ub =(UserBean) application.getAttribute("ubean");
out.println("<h1>Page of User :"+fName+"</h1>"+"<br>");
out.println("First Name : "+ub.getFirstName()+"<br>");
out.println("Last Name : "+ub.getLastName()+"<br>");
out.println("Address : "+ub.getAddress()+"<br>");
out.println("MailId : "+ub.getMailId()+"<br>");
out.println("Phone : "+ub.getPhone()+"<br>");
%>
<a href="logout">Logout</a>
</body>
</html>