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
String us=request.getParameter("un");
String pss=request.getParameter("pwd");
String cpass=request.getParameter("cpwd");
String add=request.getParameter("add");

if(pass.equals(cpass)){
	Connection connection = DbConnect.getConnection();
	System.out.printl(connection);
	Statement statement = connection.createStatement();
	ResultSet set = statement.executeQuery("select * from user  where user ");
	response.sendRedirect("index.html");
	
}else{
	//response.re
}
%>
</body>
</html>