package acorn;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/order.do")
public class Order extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	// 로그인 여부 확인
	// 로그인 ok : 주문정보가 보여짐, 로그인 fail: 로그인 화면으로
	/*
	HttpSession session = req.getSession();
	String id = (String) session.getAttribute("id");
	
	if( id != null) {
		// 모델,  주문목록
		req.getRequestDispatcher("WEB-INF/views/order.jsp").forward(req, resp);
	} else {
		// 로그인 되어있지 않다면
		resp.sendRedirect("/filterPrj0912/login");
	}*/
	//	req.setAttribute("list", list);
	req.getRequestDispatcher("WEB-INF/views/order.jsp").forward(req, resp);
}
}
