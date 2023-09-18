package test;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.event.AncestorEvent;

@WebServlet("/test07")
public class test07 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	int[][] gugudan= new int[8][9];
	
	for (int i = 2; i <= 9; i++) {
	    for (int j = 1; j <= 9; j++) {
	        gugudan[i - 2][j - 1] = i * j;
	    }
	}

	// 출력
//	for (int i = 2; i <= 9; i++) {
//	    for (int j = 1; j <= 9; j++) {
//	        System.out.println(i + "*" + j + "=" + gugudan[i - 2][j - 1]);
//	    }
//	    System.out.println();
//	}
	
	req.setAttribute("gugudan", gugudan);
	req.getRequestDispatcher("WEB-INF/testview/test07.jsp").forward(req, resp);
}
}
