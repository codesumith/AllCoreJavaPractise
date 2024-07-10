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
AdminBean ab=(AdminBean)session.getAttribute("abean");
out.println("Page belongs to :"+ab.getFname()+"<br>");
ArrayList<BookBean> al =(ArrayList<BookBean>)session.getAttribute("al");
if(al.size()==0)
{
	out.print("Books not available...<br>");
}
else{
	Iterator<BookBean> it =al.iterator();
	while(it.hasNext()){
		BookBean bb =(BookBean)it.next();
		out.println(bb.getBcode()+"&nbsp;&nbsp"+bb.getBname()+"&nbsp;&nbsp"
		+bb.getAuthor()+"&nbsp;&nbsp"+bb.getPrice()+"&nbsp;&nbsp"+bb.getQty()
		+"&nbsp;&nbsp"+"<a href='edit?bcode="+bb.getBcode()+"'>EditBook</a><br>");
	}
}
%>
<br>
<a href="book.html">AddBook</a>
<a href="logout">Logout</a>
</body>
</html>