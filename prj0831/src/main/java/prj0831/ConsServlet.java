package prj0831;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/constructor")
public class ConsServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServiceConstructor sc = new ServiceConstructor();
		ArrayList<constructor> cons = sc.getinfo();
		
		request.setAttribute("Cons", cons);
		
		request.getRequestDispatcher("WEB-INF/views/constructor.jsp").forward(request, response);
	}
}
