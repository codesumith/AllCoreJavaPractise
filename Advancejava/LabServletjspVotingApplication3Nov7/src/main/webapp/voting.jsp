<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String name =request.getParameter("name");
String country =request.getParameter("country");
int age =Integer.parseInt(request.getParameter("age"));
String aadharNo =request.getParameter("aadhar");



if(country.equalsIgnoreCase("India")&&age>=18&&age<=80&&aadharNo.length()==13)
{
	out.println("<h1 style=\"color: green;\"> YOU ARE ELIGIBLE FOR VOTING</h1>");
}
else
	out.println("<h1 style=\"color: red;\">YOU ARE NOT ELIGIBLE FOR VOTING</h1>");
%>
</body>
</html>