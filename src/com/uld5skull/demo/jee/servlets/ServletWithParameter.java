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

		// On r�cup�re le param�tre
		// Le "param�tre" est une notio propre au HTTP. Ils passent directement dans l'URL. 
		String param = request.getParameter("param");
		
		// Op�ration [...]
		String message = "The parameter is : " + param;
		
		// On appelle setAttribute pour affecter le nouveau param�tre a la requete
		// L'attribut est un concept Java. On les cr�e dans l'application et on les ins�re 
		// dans la requ�te.
		request.setAttribute("attribute", message);

		this.getServletContext().getRequestDispatcher("/WEB-INF/ViewForServletWithParameter.jsp").forward(request,
				response);
	}

}
