package test;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.event.AncestorEvent;

@WebServlet("/test06")
public class test06 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// 배열에 3단 저장
	int[] dan3 = new int[9];
	int[] up = new int[9];
	
	for(int i=0; i <dan3.length; i++) {
		dan3[i]=3*(i+1);
	}
	
	for(int i=1; i<up.length; i++) {
		up[i-1]=i;
	}
	// 배열 출력
//    for (int i = 0; i < 9; i++) {
//        System.out.println("3*" + (i+1) + "=" + dan3[i]);
//    }
	
	for(int i = 0; i <up.length; i++) {
		System.out.println(up[i]);
	}
    req.setAttribute("dan3", dan3);
    req.setAttribute("up", up);
	req.getRequestDispatcher("WEB-INF/testview/test06.jsp").forward(req, resp);
}
}
