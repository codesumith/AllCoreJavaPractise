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

String cd= request.getParameter("pcode");
String pn= request.getParameter("pname");
float pp=Float.parseFloat(request.getParameter("pprice"));
int qty=Integer.parseInt(request.getParameter("pqty"));

out.println("<p style='font-size: 24px;'>====Product-Details====");
out.println("<p style='font-size: 24px;'><br>ProductCode:"+cd);
out.println("<p style='font-size: 24px;'><br>ProductName:"+pn);
out.println("<p style='font-size: 24px;'><br>ProductPrice:"+pp);
out.println("<p style='font-size: 24px;'><br>ProductQuantity:"+qty);

%>
<br>

</body>
</html>