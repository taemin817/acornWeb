package cafeprj;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

@WebServlet("/total")
public class TotalServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 모델 얻기
		CafeService s = new CafeService();

		JSONArray list = s.getGoodsList();
		System.out.println(list);
		
		// 모델 심기
		request.setAttribute("list", list);
		// view 출력
		request.getRequestDispatcher("WEB-INF/views/전체조회.jsp").forward(request, response);
	}
}
