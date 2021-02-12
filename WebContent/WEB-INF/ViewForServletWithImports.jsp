<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Servlet with imports</title>
</head>
<body>
	Servlet with imports renvoie 42
	<br />
	<%-- Import de classes java  --%>
	<%@ page import="java.util.List, java.util.Date"%>

	<%@ include file="uneAutreJSP.jsp"%>
	<br />

	<jsp:include page="uneAutreJSP.jsp" />
	<br />
	<%-- Son equivalent en Java est :  --%>
	<%
		request.getRequestDispatcher("uneAutreJSP.jsp").include(request, response);
	%>
	<br />
</body>
</html>