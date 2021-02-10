package com.uld5skull.demo.jee.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletWithAttribute extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String message = "Transmission de variables : Ok ! ";

		request.setAttribute("message", message);
		this.getServletContext().getRequestDispatcher("/WEB-INF/ViewForServletWithAttribute.jsp").forward(request,
				response);

	}

}
