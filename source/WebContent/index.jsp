<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ page import=" com.pink.anubasketball.test.DBConnectionTest"
	language="java"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ANU Basketball</title>
</head>
<body>
	<p>Welcome to ANU BasketBall</p>
	<%
		DBConnectionTest dbConnectionTest = new DBConnectionTest();
		dbConnectionTest.testConnection();
	%>
</body>
</html>