<%@ page language="java" 
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         import ="com.sumith.userapp.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit</title>
</head>
<body>
<% 
Cookie [] c=request.getCookies(); 
UserBean ub =(UserBean) application.getAttribute("ubean");
out.print("<h2>Page of user : "+c[0]+"</h2>");%>
<form action="update" method="post">
<input type=text name="add" value="<%= ub.getAddress() %>" ><br><br>
<input type=text name="mid" value="<%= ub.getMailId() %>" ><br><br>
<input type=text name="phn" value="<%= ub.getPhone() %>" ><br><br>
<input type="submit" value="UpdateProfile">
</form>
</body>
</html>