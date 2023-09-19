package test0911;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sellerDAO.Goods;

public class MemeberDAO {
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	
	public Connection dbcon() {		 
		Connection con = null;
		try {
			Class.forName(driver);
			con =DriverManager.getConnection(url, user, password);
			if( con != null) System.out.println( "ok");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;		 	
	}
	
	public int getTotalCnt() {
		Connection con = dbcon();
		String sql = "select count(*) from acorntbl";
		ResultSet rs=null;
		PreparedStatement pst=null;
		
		int totalCnt=0;
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			
			if(rs.next()) {
				// 1열의 갯수
				totalCnt = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		close(rs, pst, con);
		return totalCnt;
	}
	
	public ArrayList<Member> selectAll(){
		ArrayList<Member> list = new ArrayList<Member>();
		Connection con = dbcon();
		String sql = "select * from acorntbl";
		
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				Member m = new Member(id, name, pw);	
				list.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}close(rs, pst, con);
		return list;
	}
											//	현재 페이지, 페이지에 나타낼 목록의 갯수
	public ArrayList<Member> getListPage(int page, int pageSize){
		int startPage, endPage = 0;
		
		startPage = (page-1)*pageSize+1;
		endPage = page*pageSize;

		ArrayList<Member> list = new ArrayList<>();
		Connection con = dbcon();
		String sql = "select * from( select rownum num, id, pw, name from acorntbl) where num between ? and ?";
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, startPage);
			pst.setInt(2, endPage);
			rs = pst.executeQuery()	;
			
			while(rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				Member m = new Member(id, name, pw);
				list.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
			close(rs, pst, con);
			return list;
	}
	
	
	// 전체 조회 메서드
		public ArrayList<Goods> selectAll() {
			// db 연결
			Connection con = dbcon();

			// sql 작성
			String sql = "select * from goodsTbl order by goodsCode";
			PreparedStatement pst = null;
			ResultSet rs = null;

			ArrayList<Goods> goodsList = new ArrayList<>();

			// 실행
			try {
				pst = con.prepareStatement(sql);
				rs = pst.executeQuery();
				while (rs.next()) {

					String code = rs.getString(1);
					int brand = rs.getInt(2);
					String name = rs.getString(3);
					int price = rs.getInt(4);
					int stock = rs.getInt(5);

					Goods g = new Goods(code, brand, name, price, stock);
					goodsList.add(g);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			// 해제
			close(rs, pst, con);
			return goodsList;
		}
	
	public void close( AutoCloseable ...a) {
		for( AutoCloseable  item : a) {
		   try {
			item.close();
		} catch (Exception e) {
			e.printStackTrace();
			}	
		}
	}
}
