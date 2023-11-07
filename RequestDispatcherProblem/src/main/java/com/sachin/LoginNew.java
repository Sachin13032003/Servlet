package com.sachin;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/mylogin1")
public class LoginNew extends HttpServlet{

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		String email1= arg0.getParameter("email");
		String pass1 = arg0.getParameter("pass");
		PrintWriter out = arg1.getWriter();
		if(email1.equals("Sachin") && pass1.equals("1234")) {
			//arg0.setAttribute("name", "Sachin");
			HttpSession session = arg0.getSession();
			session.setAttribute("name", "Sachin");
			RequestDispatcher rd = arg0.getRequestDispatcher("/profile.jsp");
			rd.forward(arg0, arg1);
		}
		else {
			arg1.setContentType("text/html");
			out.print("<h3> Email didn't match</h3>");
			RequestDispatcher rd = arg0.getRequestDispatcher("index.html");
			rd.include(arg0, arg1);
		}
	}

}
