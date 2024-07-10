<%@ page 
language="java" 
contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*,com.sumith.library.BookBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
ArrayList<BookBean> al =(ArrayList<BookBean>)request.getAttribute("list");
if(al.size()==0)
{
	out.println("Book not Available...<br>");
}
else
{
	Iterator<BookBean> itr =al.iterator();
	while(itr.hasNext()){
		BookBean bb =itr.next();
		
		
		String formattedOutput = String.format("<h3 style=\"color: white;\">%s&nbsp&nbsp%s&nbsp&nbsp%s&nbsp&nbsp%.2f&nbsp&nbsp%d",
		    bb.getCode(),
		    bb.getName(),
		    bb.getAuthor(),
		    bb.getPrice(),
		    bb.getQty()
		);
		out.println(formattedOutput);
		

		
	}
}
%>
<br>
<jsp:include page="home.html"></jsp:include>
</body>
</html>