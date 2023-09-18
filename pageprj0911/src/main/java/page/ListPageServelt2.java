package page;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list2.page")
public class ListPageServelt2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int pageSize = 4;
		int grpSize = 5;
		String page = req.getParameter("p");
		int currentPage=1;
		if(page != null) {
			currentPage = Integer.parseInt(page);
		}
		MemberDAO2 dao = new MemberDAO2();
		// dao.getListPage(currentPage, pageSize) 호출
		ArrayList<Member> list = dao.getListPage(currentPage, pageSize);
		int totalCnt = dao.getTotalCnt();
		
		req.setAttribute("list", list);
		req.setAttribute("totalCnt", totalCnt);
		req.setAttribute("pageSize", pageSize);
		req.setAttribute("page", currentPage);
		req.setAttribute("grpSize", grpSize);
		
		req.getRequestDispatcher("WEB-INF/views/listPage2.jsp").forward(req, resp);
	}
}
