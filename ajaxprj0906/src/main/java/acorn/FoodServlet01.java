package acorn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/food0")
public class FoodServlet01 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	resp.setCharacterEncoding("UTF-8");
	resp.setContentType("text/html;characterset=utf-8");
	PrintWriter out = resp.getWriter();
	out.println("볶음밥");
	}
}
