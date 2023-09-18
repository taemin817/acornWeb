package cafeprj;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

import oracle.jdbc.driver.json.tree.JsonpArrayImpl;

@WebServlet("/ajaxtotal")
public class ajaxTotal extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;characterset=utf-8");
		
		CafeService s = new CafeService();
		JSONArray list = s.getGoodsList2();
		System.out.println(list);
		resp.getWriter().println(list);
	}
}
