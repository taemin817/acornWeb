package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test03")
public class test03 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	int i = (int)Math.random()*100;
	
	req.setAttribute("socre", i);
	req.getRequestDispatcher("WEB-INF/testview/test03.jsp").forward(req, resp);
}
}
