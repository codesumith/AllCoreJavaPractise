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
int div=v1/v2;

out.println("<p style='font-size: 24px;'><br>Division :"+div);
%>
<br>
<jsp:include page="cal.html"></jsp:include>
</body>
</html>