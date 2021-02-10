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
	<p>Ceci est une page générée depuis une JSP.</p>
	<p>
		<%
			// On récupère l'attribut
		Object attribute = request.getAttribute("attribute");
		// On cast l'attribut
		String strAttribute = (String) attribute;
		// On affiche l'attribut
		out.println(strAttribute);

		// On affiche le paramètre
		Object parameter = request.getParameter("param");
		// On cast le parametre
		String strParam = (String) parameter;
		// On affiche le paramètre
		out.print(strParam);
		%>
	</p>
</body>
</html>