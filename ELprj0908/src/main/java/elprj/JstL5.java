package elprj;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/jstl5")
public class JstL5 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ArrayList<Book> books = new ArrayList<>();
			books.add(new Book("b001", "1984", 15000));
			books.add(new Book("b002", "멋진 신세계", 16000));
			books.add(new Book("b003", "파리대왕", 12000));
			
		req.setAttribute("books", books);
		req.getRequestDispatcher("WEB-INF/views/jstl5.jsp").forward(req, resp);
	}
}
