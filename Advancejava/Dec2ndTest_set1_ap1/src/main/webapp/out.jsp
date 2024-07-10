<%@ page language="java" 
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         import="test.ResBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Your Details are....</h2>
<%HttpSession hs =request.getSession(false);
ResBean rb=(ResBean)hs.getAttribute("ResBean"); %>
<%= rb.getName() %>
<%= rb.getAge() %>
<%= rb.getMobile() %>
<%= rb.getHd() %>
<%= rb.getYop() %>
<%= rb.getUniversity() %>
</body>
</html>