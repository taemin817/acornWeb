package sellerServlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sellerDAO.Goods;
import sellerDAO.sellerService;

@WebServlet("/seller")
public class GoodsSellerServlet extends HttpServlet{

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html;charset=UTF-8");
	resp.setCharacterEncoding("UTF-8");
	
	sellerService s = new sellerService();
	
	ArrayList<Goods> list = s.selectAll();
	
	req.setAttribute("list", list);
	
	req.getRequestDispatcher("/WEB-INF/views/seller.jsp").forward(req, resp);
	}
}
