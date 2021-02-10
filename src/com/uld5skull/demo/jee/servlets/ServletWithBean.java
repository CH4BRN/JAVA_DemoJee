package com.uld5skull.demo.jee.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.uld5skull.demo.jee.beans.TestBean;

public class ServletWithBean extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// [ BEAN ]
		// Creation du bean
		TestBean premierBean = new TestBean();
		// Initialisation des propriétés
		premierBean.setBoolAttribute(true);
		premierBean.setIntegerAttribute(42);
		premierBean.setStringAttribute("String value");
		
		// Stockage du bean dans la request
		request.setAttribute("bean", premierBean);

		// [ TRANSMISSION ]
		this.getServletContext().getRequestDispatcher("/WEB-INF/ViewForServletWithBean.jsp").forward(request, response);
	}

}
