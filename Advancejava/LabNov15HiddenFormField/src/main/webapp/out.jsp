<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import ="javax.servlet.*,com.sumith.registraton.EmployeeBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>output</title>
</head>
<body>
<%
ServletContext sct =this.getServletContext();
EmployeeBean eb =(EmployeeBean)sct.getAttribute("ebean");


out.println("Name-"+eb.getName()+"<br>");
out.println("Age-"+eb.getAge()+"<br>");
out.println("Mobile-"+eb.getMobile()+"<br>");
out.println("Highest-Degree-"+eb.getDegree()+"<br>");
out.println("YearOfPass-"+eb.getYop()+"<br>");
out.println("University-"+eb.getUniversity());
%>
</body>
</html>