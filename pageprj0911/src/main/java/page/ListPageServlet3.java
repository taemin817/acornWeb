package page;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list3.page")
public class ListPageServlet3 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String p = req.getParameter("p");
		int currentPage = 1;
		if( p != null) {
			currentPage = Integer.parseInt(p);
		}
		MemberDAO2 dao = new MemberDAO2();
		int totRedcords = dao.getTotalCnt();
		int pageSize = 2;
		int grpSize = 4;
	
		// 페이징을 위한 값들
		PageHandler handler = new PageHandler(currentPage, totRedcords, pageSize, grpSize);
		ArrayList<Member> list = dao.getListPage(currentPage, pageSize);
		// 현재페이지에 대한 목록
		req.setAttribute("list", list);
		req.setAttribute("handler", handler);
		
		req.getRequestDispatcher("WEB-INF/views/listPage3.jsp").forward(req, resp);
	}
}
