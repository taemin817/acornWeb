package cafeprj;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

@WebServlet("/delete")
public class DelServlet extends HttpServlet {
	
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		
		String code = req.getParameter("code");
		
		CafeService s = new CafeService();
		s.deleteMember(code);
      
		resp.sendRedirect("/cafeprj/all.html");
    
}
}
