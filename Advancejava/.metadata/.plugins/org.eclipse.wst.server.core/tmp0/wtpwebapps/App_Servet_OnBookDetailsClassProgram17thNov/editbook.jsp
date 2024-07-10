<%@ page language="java" 
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         import="java.util.*,com.sumith.bookdetails.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
ArrayList<BookBean> al =(ArrayList<BookBean>)session.getAttribute("al");
String bcode=request.getParameter("bcode");
Iterator<BookBean> it =al.iterator();
while(it.hasNext())
{
	BookBean bb=(BookBean)it.next();
	if(bcode.equals(bb.getBcode()))
	{
		%>
		<form action="update" method="post">
		<h3>Edit book details</h3>
		<input type ="hidden" name="bcode" value=<%=bb.getBcode() %>><br><br>
		<input type ="text" name="price" value=<%=bb.getPrice() %>><br><br>
		<input type ="text" name="qty" value=<%=bb.getQty() %>><br><br>
		<button>Update</button>
		</form>
		<%
	}
}
%>

</body>
</html>