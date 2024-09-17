<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Kilometer into Miles</title>
</head>
<body bgcolor="Pink">

	<%
	float km = Integer.parseInt(request.getParameter("km"));
	float x = 1.609f;
	float miles = km / x; 
	
	out.println("Value in Miles is " + miles);
	
	
	%>

</body>
</html>