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
int v1=Integer.parseInt(request.getParameter("v1"));
int v2=Integer.parseInt(request.getParameter("v2"));
int lowest=v1;

if(v2<v1)
{
	lowest=v2;
}

out.println("<p style='font-size: 24px;'><br>Lowest :"+lowest);
%>
<br>
<jsp:include page="cal.html"></jsp:include>
</body>
</html>