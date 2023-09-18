package elprj;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jstl2")
public class JstL2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//String[] books = {"부의 인문학", "1984", "파리대왕"};
		
		ArrayList<String> books = new ArrayList<>();
		// String s="문자열입니다";  정적(static  상수영역 )
		// String s2 = new String("문자열입니다");  heap 메모리 저장
		
		books.add("부의 인문학");
		books.add("1984");
		books.add("파리대왕");
		
		req.setAttribute("books", books);
		req.getRequestDispatcher("WEB-INF/views/jstl2.jsp").forward(req, resp);
	}
}
