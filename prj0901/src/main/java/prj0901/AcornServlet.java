package prj0901;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/acorn")
public class AcornServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 모델 얻기
		AcornService s = new AcornService();
		
//		String info = s.insertMember2("kk", "2222", "콩진호");
//		System.out.println(info);
		
		// ArrayList<String> list = s.getMemList();
		// 전체 조회
		ArrayList<String> list = s.getMemberRealList();
		System.out.println(list);
		
		// 모델 심기
		request.setAttribute("list", list);
		// view 출력
		request.getRequestDispatcher("WEB-INF/views/acorn.jsp").forward(request, response);
	}
}
