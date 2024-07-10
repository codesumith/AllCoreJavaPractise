<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*,com.sumith.employee_management.EmpBean"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
ArrayList<EmpBean> al =(ArrayList<EmpBean>)request.getAttribute("list");

Iterator<EmpBean> itr =al.iterator();

while(itr.hasNext())
{
	EmpBean eb = itr.next();
	
	String formattedOutput = String.format("<h3 style=\"color: white;\">%s&nbsp&nbsp%s&nbsp&nbsp%s&nbsp&nbsp%.2f&nbsp&nbsp%.2f",
		    eb.getId(),
		    eb.getName(),
		    eb.getDesg(),
		    eb.getBsal(),
		    eb.getTsal()
		);
		out.println(formattedOutput);
}

%>
<br>
<jsp:include page="emphm.html"></jsp:include>
</body>
</html>