package tw.com.msig.servlet;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHomeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setAttribute("now", LocalDateTime.now());
		
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/WEB-INF/pages/home.jsp");
		dispatcher.forward(req, resp);
	}

	
}
