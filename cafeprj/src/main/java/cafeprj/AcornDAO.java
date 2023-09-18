package cafeprj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AcornDAO {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";

//-------------------------------------------------------------------------
	// db연결
	public Connection dbcon() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			if (con != null)
				System.out.println("ok");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}

//------------------------------------------------------------------------	
	// 전체 조회
	public ArrayList<String> selectAll() {
		// db 연결
		Connection con = dbcon();

		// 테이블에서 모든 컬럼을 선택
		String sql = "select * from goodstbl";
		// sql 실행
		PreparedStatement pst = null;
		ResultSet rs = null;

		ArrayList<String> list = new ArrayList<String>();
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();

			while (rs.next()) {
				list.add(rs.getString(1));
				list.add(rs.getString(2));
				list.add(rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 해제
		close(rs, pst, con);
		return list;
	}
	
//--------------------------------------------------------------------
	// 전체조회2
	public ArrayList<Goods>  getGoodsList2(){		
		
		 Connection con  =dbcon();		 
		 String sql=" select  * from  goodstbl";
		 ArrayList<Goods> list = new ArrayList<>();
		 
		 try {
			PreparedStatement pst  = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while( rs.next()){		
				 String id = rs.getString(1);		
				 String name = rs.getString(2);
				 int price = rs.getInt(3);
				 
				 Goods menu = new Goods(id, name, price);
				 list.add(menu);						 
			   //  list.add(  new Food(rs.getString(2) , rs.getString(3), rs.getInt(4) ) );  	
			}	
			rs.close();
			pst.close();
			con.close();
						
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;	 
	}

//--------------------------------------------------------------------
	// 단건 조회
	public Goods selectOne(String name) {
		// db 연결
		Connection con = dbcon();
		// sql
		String sql = "select * from goodstbl where name=?";
		PreparedStatement pst = null;

		// sql실행
		ResultSet rs = null;
		Goods g = null;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, name);
			rs = pst.executeQuery();
			if (rs.next()) {
				String id_tmp = rs.getString(1);
				String name_tmp = rs.getString(2);
				int price_tmp = rs.getInt(3);

				// sql실행한 결과를 Customer 객체로 만들기
				g = new Goods(id_tmp, name_tmp, price_tmp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 자원해제
		close(rs, pst, con);
		return g;

	}
//------------------------------------------------------------------
	// 정보를 추가하는 메서드
	public void insert(Goods g) {// db 연결
		Connection con = dbcon();
		
		// sql 작성
		String sql = "insert into acorntbl values(?,?,?)";
		PreparedStatement pst = null;
		
		// sql 실행
		try {
			pst=con.prepareStatement(sql);
			pst.setString(1, g.getId());
			pst.setString(2, g.getName());
			pst.setInt(3, g.getPrice());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// 연결해제
		close(pst, con);
	}
//------------------------------------------------------------------
	// 정보수정하는 메서드
	public void updateMember(Goods g) {
		// 연결
		Connection con = dbcon();

		// 변경
		String sql="update goodstbl set name=? where id=?";
		PreparedStatement pst = null;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, g.getId());
			pst.setString(2, g.getName()); 
			// 실행
			pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 자원반납
		close(pst, con);
	}
	
//-----------------------------------------------------------------
	// 정보를 삭제할 수 있는 메서드	
	public void deleteOne(String id) {
		// 연결
		Connection con = dbcon();

		// sql 작성
		String sql = "delete from goodstbl where id=?";
		PreparedStatement pst = null;

		// sql 실행
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 연결해제
		close(pst, con);
	}
//---------------------------------------------------------------
	// 자원해제 메서드
	public void close(AutoCloseable... a) {
		for (AutoCloseable item : a) {
			try {
				item.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args){
		  AcornDAO a = new AcornDAO();
		  a.dbcon();
		  ArrayList<Goods> list  = a.getGoodsList2();
		  System.out.println(list);
		  
	//	  a.deleteOne("c001");
		  
	}

	public void insert(String id, String name, int price) {
		// TODO Auto-generated method stub
		
	}


}
