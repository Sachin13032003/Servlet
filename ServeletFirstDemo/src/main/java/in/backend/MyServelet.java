package in.backend;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServelet  extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException ,IOException{
		System.out.println("I am in do get method");
	}
}
