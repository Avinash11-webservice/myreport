package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MySecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter(); // io package

		out.print("<html>");
		out.print("<body bgcolor='light blue'");

	     String name="Avinash";
		
		out.print("<h1>hello world , my name is </h1>"+name);

	
		out.print("</body");
		out.print("</html>");

		out.close();

	}

}