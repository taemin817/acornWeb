package prj;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Question04")
public class test04 extends HttpServlet{
	 
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/plain"); // 서버가 보내는 데이터의 형식 html형식임을 알려줌
		response.setCharacterEncoding("utf-8"); // utf-8형식으로 데이터를 보낸다는 의미
		
		test04_bookclass book = new test04_bookclass("재미있는서블릿", "lee", 25000);
		PrintWriter out = response.getWriter();
		out.println(book);
	}
	  

}

