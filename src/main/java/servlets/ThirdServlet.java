package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/third")
public class ThirdServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String message = req.getParameter("message");
		Date date = new Date();
		resp.setContentType("text/html");
		PrintWriter print =resp.getWriter();
		print.print("<h1>Thanks For Submitting form<h1>");
		print.print("<h2>Hello %s".formatted(message));
		print.print("<h3>The Date is %s<h3>".formatted(date));
		
	}

}
