<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>order</title>
<style>

</style>
</head>
<body>
<h1>Your Order</h1>

<% 

out.print("<table border='1'>");
out.print("<tr><th>Parameter Name</th><th>Parameter Value</th></tr>");
out.print("<tr><td>Submit</td><td>Order Pizza</td></tr>");
out.print("<tr><td>Address</td><td>"+request.getParameter("add")+"</td></tr>");
out.print("<tr><td>Name</td><td>"+request.getParameter("name")+"</td></tr>");
out.print("<tr><td>Appetizer</td><td>"+request.getParameter("Appetizer")+"</td></tr>");
out.print("<tr><td>CardType</td><td>"+request.getParameter("ccd")+"</td></tr>");
out.print("<tr><td>Crust</td><td>"+request.getParameter("crust")+"</td></tr>");
out.print("<tr><td>CardNumber</td><td><ul>"+"<li>"+request.getParameter("cn")+"</li>"+"<li>"+request.getParameter("cnr")+"</li></ul></td></tr>");

String[] s = request.getParameterValues("t");
out.print("<tr><td>Toppings</td><td><ul>");
for(String t: s){
    out.print("<li>"+t + "</li>");
}
out.print("</ul></td></tr>");
out.print("</table>");
%>


</body>
</html>