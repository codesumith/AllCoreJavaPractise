<%@ page language="java" 
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         import="test.UserBean,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>All users</h1>
<% ArrayList<UserBean> al=(ArrayList<UserBean>)request.getAttribute("al"); 
   Iterator itr =al.iterator();
   while(itr.hasNext())
   {
	   UserBean ub =(UserBean)itr.next();
	   %>
	   <br>
	   <%= ub.getUserName() %>&nbsp;
	   <%= ub.getPassword() %>&nbsp;
	   <%= ub.getAddress() %>&nbsp;
	   <%= ub.getMailId() %>&nbsp;
	   <%= ub.getPhnNO() %>&nbsp;
	   <%= ub.getState()%>&nbsp;
	   <%= ub.getCountry() %>
	   
	   
	   <% 
   }%>
</body>
</html>