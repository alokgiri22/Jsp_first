<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="Cyan">

<%
	float kg = Integer.parseInt(request.getParameter("kg"));
	float x = 2.2046f;
	float pounds = kg / x; 
	
	out.println("Value in Miles is " + pounds);
	
	
	%>

</body>
</html>