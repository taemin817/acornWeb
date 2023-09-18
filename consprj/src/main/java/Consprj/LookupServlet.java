package Consprj;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Lookup")
public class LookupServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//  모델 가져와
//		ConsService cs = new ConsService();
//		ArrayList<Member> constructor = cs.getinfo();
//		System.out.println(constructor);
		
		ConsService s = new ConsService();
		ArrayList<String> list = s.getMemberRealList();
		System.out.println(list);
		
		// 모델 심기
//		req.setAttribute("Info", constructor);
		req.setAttribute("list", list);
		
		req.getRequestDispatcher("WEB-INF/views/lookup.jsp").forward(req, resp);
	}
}
