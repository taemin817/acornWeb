package home;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class phoneHomeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		phoneBoardService bs = new phoneBoardService();
		
		ArrayList<String> list = bs.getMemberList();		
		
		req.setAttribute("list", list);
		req.getRequestDispatcher("WEB-INF/views/phone.jsp").forward(req, resp);
		
	}
	
}
