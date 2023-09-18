package cafeprj;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insert")
public class InsertServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setCharacterEncoding("UTF-8");
	resp.setContentType("text/html;charset=utf-8");
			
			String id = req.getParameter("menuid");
			String name = req.getParameter("menuname");
			String price = req.getParameter("menuPrice");
			
			
	}
}
