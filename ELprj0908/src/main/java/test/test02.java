package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test02")
public class test02 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	String hi = "안녕하세요";
	
	for(int i = 0; i<5; i++) {
		System.out.println(hi);
	}
	
	req.setAttribute("insa", hi);
	req.getRequestDispatcher("WEB-INF/testview/test02.jsp").forward(req, resp);
}
}
