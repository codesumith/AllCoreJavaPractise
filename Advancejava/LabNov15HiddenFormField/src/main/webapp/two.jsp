 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import ="javax.servlet.*,com.sumith.registraton.EmployeeBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
<form action="two" method="post">
<% ServletContext sct =this.getServletContext();
EmployeeBean eb =(EmployeeBean)sct.getAttribute("ebean");%>
 <h2>EmployeeRegistration Form</h2>
 
<input type="hidden" name="name" value="<%= eb.getName() %>">
<input type="hidden" name="age" value="<%= eb.getAge() %>">
<input type="hidden" name="mb" value="<%= eb.getMobile() %>">
HighestDegree:<input type="text" name="hd"><br>
YearOfPassedOut:<input type="text" name="yop"><br>
University:<input type="text" name="uni"><br>
<button>submit</button>
</form>
</body>
</html>