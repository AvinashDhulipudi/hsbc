package com.hsbc.trg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Empservlet extends HttpServlet {

	HashMap<String, Employee> data = new HashMap<>();

	public void init(ServletConfig config) throws ServletException {
		data.put("100", new Employee(100, "suresh"));
		data.put("200", new Employee(200, "John"));

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String empId = request.getParameter("empid");
		
		Employee x= data.get(empId);
		
		PrintWriter pw = response.getWriter();
		
		response.setContentType("application/json");
	
		if(x==null) {
			pw.println("Employee Not Found");
		}
		else {
			String output="{\"empid\":"+x.getEmpId()+",";
			output=output+"\"name\":\""+x.getName()+"\"}";
		
			pw.println(output);	
		}

		
	}

}
