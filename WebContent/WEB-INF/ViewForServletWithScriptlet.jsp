<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/tirage" method="post">
		<%
			for (int i = 1; i < 3; i++) {
			out.println("Numéro " + i + ": <select name=\"number" + i + "\">");
			for (int j = 1; j <= 10; j++) {
				out.println("<option value=\"" + j + "\">" + j + "</option>");
			}
			out.println("</sekect><br />");
		}
		%>
		<br /> <input type="submit" value="Valider" />
	</form>

	<% out.println("out.println(Bip bip !);"); %>
	
	<%= "Bip bip !" %>
</body>
</html>