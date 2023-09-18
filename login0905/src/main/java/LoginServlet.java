import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 로그인처리: 사용자인지 확인해야함(유효성체크) -> 서비스,dao 필요
		// id pw 동일하면 홈페이지로, 아니 로그인페이지로
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");

		// id pw 동일하면 정상로그인
		if(id.equals(pw)) {
			// 로그인 성공시 세션 저장소에 아이디를 저장시킴
			HttpSession session = req.getSession();
			session.setAttribute("id", id);
			
			// 메인페이지로 이동
			resp.sendRedirect("/Login0905/home");
		}else {
			resp.sendRedirect("/Login0905/login");
		}
	}
}
