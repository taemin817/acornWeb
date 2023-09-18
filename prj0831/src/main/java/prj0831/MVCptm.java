package prj0831;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bucketlist")
public class MVCptm extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Servicebucket sb = new Servicebucket();
		ArrayList<String> list = sb.getBuket();
		
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("WEB-INF/views/bucketlist.jsp").forward(request, response);
	}
	
}
