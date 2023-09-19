package sellerServlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sellerDAO.goodsDAO;

@WebServlet("/pagetest")
public class testServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String p = req.getParameter("p");
		int currentPage = 1;	// PageHandler에 넘겨주는 값
		if( p != null) {
			currentPage = Integer.parseInt(p);		// PageHandler에 넘겨주는 값
		}
		goodsDAO dao = new goodsDAO();
		int totRedcords = dao.getTotalCnt();	// PageHandler에 넘겨주는 값
		int pageSize = 2;	// PageHandler에 넘겨주는 값
		int grpSize = 4;		// PageHandler에 넘겨주는 값
	
		// 페이징을 위한 값들
		PageHandler handler = new PageHandler(currentPage, totRedcords, pageSize, grpSize);
		ArrayList<Member> list = dao.getListPage(currentPage, pageSize);
		
		// 현재페이지에 대한 목록
		req.setAttribute("list", list);
		req.setAttribute("handler", handler);
		
		req.getRequestDispatcher("WEB-INF/views/testpage.jsp").forward(req, resp);
	}
}
