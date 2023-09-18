package acorn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

@WebServlet("/food2")
public class FoodServlet02 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 관련 라이브러리를 통해 json으로 변환
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;characterset=utf-8");
		
		Food food = new Food("볶음밥", "8000");
		// json으로 바꿔준닷
		JSONObject o = new JSONObject();
		o.put("name", food.getName());
		o.put("price", food.getPrice());
		
		resp.getWriter().println(o);
	}
}
