<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="com.sumith.employee_management.EmpBean"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
EmpBean eb =(EmpBean)request.getAttribute("ebobj");

String formattedOutput = String.format("<h3 style=\"color: white;\">%s&nbsp&nbsp%s&nbsp&nbsp%s&nbsp&nbsp%.2f&nbsp&nbsp%.2f",
	    eb.getId(),
	    eb.getName(),
	    eb.getDesg(),
	    eb.getBsal(),
	    eb.getTsal()
	);
	out.println(formattedOutput);

%>
<br>
<jsp:include page="emphm.html"></jsp:include>
</body>
</html>