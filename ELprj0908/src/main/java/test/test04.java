package test;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test04")
public class test04 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	ArrayList<String> favor = new ArrayList<String>();
	
	favor.add("F1");
	favor.add("드라이브");
	favor.add("무화과");
	favor.add("김치찜");
	
	req.setAttribute("list", favor);
	req.getRequestDispatcher("WEB-INF/testview/test04.jsp").forward(req, resp);
}
}
