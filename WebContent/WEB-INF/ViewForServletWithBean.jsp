<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Test</title>
</head>
<body>
	<p>Ceci est une page générée depuis une JSP.</p>
	<p>
		Récupération du bean :
		<%
		com.uld5skull.demo.jee.beans.TestBean notreBean = (com.uld5skull.demo.jee.beans.TestBean) request.getAttribute("bean");
	out.println("<br/>");
	out.println(notreBean.getIntegerAttribute());
	out.println("<br/>");
	out.println(notreBean.getStringAttribute());
	out.println("<br/>");
	out.println(notreBean.isBoolAttribute());
	out.println("<br/>");
	%>
	</p>
	
	<% out.println("bip bip 1"); %>
	<%= "Bip bip j'ai dit " %>
	
	
</body>
</html>