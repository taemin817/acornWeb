package cafeprj;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/only")
public class OneServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 사용자로부터 정보 꺼내오기
				String name = request.getParameter("name");
				
				// 모델
				CafeService s = new CafeService();
				Goods g = s.getMember(name);
				
				// 모델 심기
				request.setAttribute("goods", g);
				
				request.getRequestDispatcher("WEB-INF/views/단건조회.jsp").forward(request, response);
	}
}
