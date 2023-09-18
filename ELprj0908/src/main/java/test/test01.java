package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

@WebServlet("/test01")
public class test01 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int[] numarr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		req.setAttribute("numArr", numarr);
		req.getRequestDispatcher("WEB-INF/testview/test01.jsp").forward(req, resp);
	}
}
