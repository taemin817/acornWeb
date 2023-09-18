package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/star")
public class test05 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		resp.setCharacterEncoding("utf-8");
		
		String su1_ = req.getParameter("su1");
		
		PrintWriter out = resp.getWriter();
		
		int su1 = Integer.parseInt(su1_);
		
		for(int i = 1; i<=su1; i++) {
			out.println("*");
		}

	}
}
