package survey0905;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/result")
public class ResultServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String flower = request.getParameter("flower");

		// 좋아하는 동물 정보, 좋아하는 꽃 정보 가져오기
		HttpSession s = request.getSession();
		String animal = (String)s.getAttribute("animal");

		System.out.println(flower);
		System.out.println(animal);
		
		// 데이터 심기
		request.setAttribute("flower", flower);
		request.setAttribute("animal", animal);
		
		// 
		request.getRequestDispatcher("WEB-INF/views/result.jsp").forward(request, response);
	}
}
