import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		
		// 세션객체 제거함
		//session.invalidate();

		// 로그아웃 누르면 5초 뒤 로그아웃 됨   그전에는 유지
		session.setMaxInactiveInterval(5);
		resp.sendRedirect("/Login0905/home");
		
	}
}
