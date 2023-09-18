package test;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test08")
public class test08 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ArrayList<CafeMenu> menu = new ArrayList<>();
		
		menu.add(new CafeMenu("c001", "에스프레소", 2500));
		menu.add(new CafeMenu("c002", "아메리카노", 3000));
		menu.add(new CafeMenu("c003", "카페라떼", 4000));
		menu.add(new CafeMenu("c004", "바닐라라떼", 4000));
		
		req.setAttribute("cmlist", menu);
		req.getRequestDispatcher("WEB-INF/testview/test08.jsp").forward(req, resp);
	}
}
