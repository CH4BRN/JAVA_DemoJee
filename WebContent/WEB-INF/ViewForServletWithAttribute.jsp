<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Ceci est une page g�n�r�e par une JSP.</p>
	<p>
		<%
			// On r�cup�re l'attribut
		Object attribute = request.getAttribute("message");
		// On cast l'attribut
		String message = (String) attribute;
		// On affiche l'attribut
		out.println(message);
		%>
	</p>
</body>
</html>