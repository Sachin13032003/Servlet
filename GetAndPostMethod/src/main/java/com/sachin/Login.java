package com.sachin;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/mylogin")
public class Login extends HttpServlet {

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
	String email1=arg0.getParameter("email");
	String pass1 =arg0.getParameter("pass");
	if(email1.equals("Sachin") && pass1.equals("1234")) {
		PrintWriter out = arg1.getWriter();
		out.println("Welcome :"+ email1);
	}
	else {
		System.out.println("Failed");
	}
	String search1=arg0.getParameter("sr");
	if(search1.equals("")) {
		
	}
	else {
		arg1.sendRedirect("https://www.google.com/search?q="+search1);
	}
	
	}

}
