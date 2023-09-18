package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hi3")
public class Ex01 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");	// 서버가 보내는 데이터의 형식. html임을 알려줌
		// response.setContentType("text/plain")  <html>~</html> 을 html이 아닌 텍스트 그대로 출력. 
		response.setCharacterEncoding("utf-8");	// utf-8형식으로 데이터를 보냄.
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<body>");
		out.println("<h2>hi servlet</h2>");
		out.println("</body>");
		out.println("</head>");
		out.println("</html>");
	}
}
