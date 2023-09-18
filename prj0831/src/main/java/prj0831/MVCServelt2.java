package prj0831;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 응원메세지를 제공하는 서비스 만들기
@WebServlet("/mvc2")
public class MVCServelt2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		ServiceMVC2 service = new ServiceMVC2();
		String result = service.getMessage();
		
		// model 심기
		request.setAttribute("r", result);
		
		
		request.getRequestDispatcher("WEB-INF/views/mvc2.jsp").forward(request, response);
		
	}
}
