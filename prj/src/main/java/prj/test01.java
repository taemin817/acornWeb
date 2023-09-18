package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pmmm")
public class test01 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String su1_ = req.getParameter("su1");
		String su2_ = req.getParameter("su2");
		
		int su1 = Integer.parseInt(su1_);
		int su2 = Integer.parseInt(su2_);
		
		int sum = su1+su2;
		int minus = su1-su2;
		int multiple = su1*su2;
		int divide = su1/su2;
		
		PrintWriter out = resp.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Insert title here</title>");
		out.println("</head>");
		out.println("<body>");
		out.println(sum);
		out.println(minus);
		out.println(multiple);
		out.println(divide);
		out.println("</body>");
		out.println("</html>");
		
	}
}
