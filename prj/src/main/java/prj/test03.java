package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/wantdan")
public class test03 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String su1_ = req.getParameter("su1");
		
		int su1 = Integer.parseInt(su1_);
		
		PrintWriter out = resp.getWriter();

		String dan = "";
		for (int i = 1; i < 10; i++) {
			dan = dan + su1 * i + " <br>";
		}

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Insert title here</title>");
		out.println("</head>");
		out.println("<body>");
		out.print(dan);
		out.println("</body>");
		out.println("</html>");
	}
}
