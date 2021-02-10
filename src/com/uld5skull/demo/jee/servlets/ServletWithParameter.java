package com.uld5skull.demo.jee.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletWithParameter extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// On récupère le paramètre
		// Le "paramètre" est une notio propre au HTTP. Ils passent directement dans l'URL. 
		String param = request.getParameter("param");
		
		// Opération [...]
		String message = "The parameter is : " + param;
		
		// On appelle setAttribute pour affecter le nouveau paramètre a la requete
		// L'attribut est un concept Java. On les crée dans l'application et on les insère 
		// dans la requète.
		request.setAttribute("attribute", message);

		this.getServletContext().getRequestDispatcher("/WEB-INF/ViewForServletWithParameter.jsp").forward(request,
				response);
	}

}
