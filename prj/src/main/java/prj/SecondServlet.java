package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { 		
		System.out.println("second servelt");
		PrintWriter out = resp.getWriter();	// 응답할 출력스트림 얻어오기
		out.println("hi second servlet");
	}
}
