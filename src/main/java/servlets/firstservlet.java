package servlets;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;


@WebServlet("/first")
public class firstservlet implements Servlet {

	private ServletConfig servletconfig;
	
	//Life-Cycle Methods
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void init(ServletConfig arg0) throws ServletException {
		this.servletconfig=arg0;
		System.out.println("Servlet initiated");
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("Servlet Service requested");
		
	}
	
	
	//Non-Lifecycle Methods

	@Override
	public ServletConfig getServletConfig() {


		return this.servletconfig;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "The Author of this Servlet is: Javed Akram";
	}

}
