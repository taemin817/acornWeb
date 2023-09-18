package acorn;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/acornRegi")
public class RegiServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("WEB-INF/views/joinus.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 사용자 정보 가져오기
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String name = req.getParameter("name");
//		PrintWriter out = resp.getWriter();
//		out.println(name);
		
		// customer 객체 만들기
		Customer c = new Customer(id, pw, name);
		
		// Service에 있는 registerCustomer() 호출하기
		AcornService s = new AcornService();
		try {
			s.registerCustomer(c);
			req.getRequestDispatcher("WEB-INF/views/regiOk.jsp").forward(req, resp);
		} catch (SQLException e) {
//			e.printStackTrace();
			req.getRequestDispatcher("WEB-INF/views/dbErr.jsp").forward(req, resp);
		}
		
		// 홈화면으로 sendReDirect()
//		req.getRequestDispatcher("WEB-INF/views/regiOk.jsp").forward(req, resp);
	}
}
