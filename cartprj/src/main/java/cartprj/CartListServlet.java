package cartprj;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CartList")
public class CartListServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 세션에서 장바구니목록 가져오기
		HttpSession session = req.getSession();
		ArrayList<String> list = (ArrayList<String>)session.getAttribute("CartList");
		
		req.setAttribute("CartList", list);
		req.getRequestDispatcher("WEB-INF/views/CartList.jsp").forward(req, resp);
	}
}
