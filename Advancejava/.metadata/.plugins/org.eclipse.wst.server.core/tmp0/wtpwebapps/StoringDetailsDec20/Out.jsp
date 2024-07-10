<%@ page language="java" 
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         import= "data.ObjectBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
ObjectBean ob =(ObjectBean)request.getAttribute("ob"); 
out.print("FirstName :"+ob.getFirstName());
out.print("LastName :"+ob.getLastName());
out.print("PhnNo :"+ob.getPhn());
out.print("Mail-Id :"+ob.getMailId());
%>
<table border="1">


  
<tr>
<td>FirstName</td>
<td><%= ob.getFirstName()%></td>
</tr>

<tr>
<td>LastName</td>
<td><%= ob.getLastName()%></td>
</tr>

<tr>
<td>Phone</td>
<td><%= ob.getPhn()%></td>
</tr>

<tr>
<td>MailId</td>
<td><%= ob.getMailId()%></td>
</tr>
</table>
</body>
</html>