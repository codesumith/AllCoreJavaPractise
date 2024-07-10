<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import ="com.sumith.register_viewid.Employee"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view</title>
</head>
<body>
<%
Employee e = (Employee)request.getAttribute("empdetails");
out.println("***Employee-Details***");
out.println("<br>Employee Id:"+e.getId());
out.println("<br>Employee Name:"+e.getName());
out.println("<br>Employee Salary:"+e.getSalary());
out.println("<br>Employee Address:"+e.getAddress());
%>
<br>
<jsp:include page="home.html"></jsp:include>
</body>
</html>