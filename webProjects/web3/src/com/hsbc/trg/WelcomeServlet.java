package com.hsbc.trg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {

	public WelcomeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet object created");
	}

	public void destroy() {
		System.out.println("servlet object destroyed");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("client");
		String details = request.getParameter("about");

		PrintWriter pw = response.getWriter();
		pw.println("<HTML>");
		pw.println("<HEAD>");
		pw.println("<TITLE>Welcome Page</TITLE>");
		pw.println("</HEAD>");
		pw.println("<BODY>");
		
		
		
		pw.println("</BODY>");
		pw.println("</HTML>");

		pw.close();

	}

}
