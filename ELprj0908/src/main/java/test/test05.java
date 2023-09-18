package test;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test05")
public class test05 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	String[] bookNames = {"소설" , "역사" , "인문",  "정치" , "미술" ,"종교" ,"여행", "과학"};
	
	req.setAttribute("list", bookNames);
	req.getRequestDispatcher("WEB-INF/testview/test05.jsp").forward(req, resp);
}
}
