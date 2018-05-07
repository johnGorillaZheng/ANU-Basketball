<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/bootstrap.css">
<title>ANU Basketball</title>
</head>
<body>
	<%@include file="header.jsp"%>
	<c:if test="${not empty sessionScope.user}">
	   Welcome ${sessionScope.user.username}
	</c:if>
</body>
</html>