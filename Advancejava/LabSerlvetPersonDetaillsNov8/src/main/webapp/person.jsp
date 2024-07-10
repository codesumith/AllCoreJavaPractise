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
out.println("====Person-Details====");
out.println("<br>Name-"+request.getParameter("name"));
out.println("<br>Age-"+request.getParameter("age"));
out.println("<br>Mobile-"+request.getParameter("mobile"));
out.println("<br>Gender-"+request.getParameter("gender"));
out.println("<br>Hobbies-");

for ( String hob : request.getParameterValues("hobbies"))
{
	out.print(hob+" ");
}

%>
<br>
<jsp:include page="person.html"></jsp:include>
</body>
</html>