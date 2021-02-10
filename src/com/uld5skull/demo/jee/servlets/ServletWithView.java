package com.uld5skull.demo.jee.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletWithView extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("doGet");		
		this.getServletContext().getRequestDispatcher("/WEB-INF/ViewForServlet.jsp"
		).forward(request, response);
	}
}
