<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Parameters !
	<p>Ceci est une page g�n�r�e depuis une JSP.</p>
	<p>
		<%
			// On r�cup�re l'attribut
		Object attribute = request.getAttribute("attribute");
		// On cast l'attribut
		String strAttribute = (String) attribute;
		// On affiche l'attribut
		out.println(strAttribute);

		// On affiche le param�tre
		Object parameter = request.getParameter("param");
		// On cast le parametre
		String strParam = (String) parameter;
		// On affiche le param�tre
		out.print(strParam);
		%>
	</p>
</body>
</html>