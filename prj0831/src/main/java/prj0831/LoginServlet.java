package prj0831;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get");
		
		String method = request.getMethod();
		System.out.println(method);
		// 로그인 화면을 응답
		RequestDispatcher r = request.getRequestDispatcher("WEB-INF/views/login.jsp");
		r.forward(request, response);
		
		}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getMethod();
		System.out.println("post");
		
		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");

		// 로그인을 처리하는 응답
		System.out.println(userid);
		System.out.println(userpw);
		
		
		// id pw를 가지고 db정보를 확인 후 정상로그인(메인화면으로), 비정상로그인(로그인화면으로) 응답
		
		// id pw를 가지고 db정보를 확인하는 코드 -> 모델
		boolean result = false;
		
		if(result) {
			// 정상 로그인 : main페이지로 이동할 수 있도록t56
			request.getRequestDispatcher("WEB-INF/views/main.jsp").forward(request, response);
		} else {
			// 비정상 로그인 : 다시 login화면으로 이동할 수 있도록
			System.out.println("틀렸다");
			request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
			//response.sendRedirect("WEB-INF/views/login.jsp"); 
		}
		}
}
