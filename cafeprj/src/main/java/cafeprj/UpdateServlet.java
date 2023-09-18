package cafeprj;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/modifygoods")
public class UpdateServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		
		if(request.getParameter("price") !=null) {
			int price = Integer.parseInt(request.getParameter("price"));
		}
		
		CafeService s = new CafeService();
		Goods g = new Goods(id, name);
		s.modifyMember(g);

		request.getRequestDispatcher("WEB-INF/views/수정.jsp").forward(request, response);
	}
}
