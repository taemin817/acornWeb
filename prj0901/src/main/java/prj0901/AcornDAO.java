package prj0901;

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
	public ArrayList<String> selectAll() {
		// db 연결
		Connection con = dbcon();
		
		// 테이블에서 name이라는 컬럼을 선택
		String sql = "select name, id from acorntbl";
		// sql 실행
		PreparedStatement pst =null;
		ResultSet rs =null;
		
		ArrayList<String> list = new ArrayList<String>();
		try {
			pst= con.prepareStatement(sql);
			rs= pst.executeQuery();
			
			while( rs.next() ) {
				list.add(rs.getString(1));
				list.add(rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 해제
		close(rs, pst, con);
		return list;
	}

//------------------------------------------------------------------------	
//	단건 조회
	public Customer selectOne(String id) {
		// db 연결
		Connection con = dbcon();
		// sql
		String sql = "select * from acorntbl where id=?";
		PreparedStatement pst = null;

		// sql실행
		ResultSet rs = null;
		Customer c = null;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			rs = pst.executeQuery();
			if( rs.next() ) {
				String id_tmp = rs.getString(1);
				String pw_tmp = rs.getString(2);
				String name_tmp = rs.getString(3);

				// sql실행한 결과를 Customer 객체로 만들기
				c = new Customer(id_tmp, pw_tmp, name_tmp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 자원해제
		close(rs, pst, con);
		return c;
		
	}
	
//------------------------------------------------------------------
// 정보를 입력할 수 있는 메서드
	public void insertMember() {
		// db 연결
		Connection con = dbcon();
		// sql 작성
		String sql = "insert into acorntbl values(?,?,?)";
		PreparedStatement pst = null;
		try {
			// sql 실행(test를 위해 데이터를 직접 입력한 코드)
			pst = con.prepareStatement(sql);
			pst.setString(1, "test9");
			pst.setString(2, "1234");
			pst.setString(3, "hong");
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// db 연결 해제
		close(pst, con);
	}
	
	
// 정보를 입력할 수 있는 메서드2
	// public void insertMember() {  매개변수를 넣어줌
	public void insertMember2(String id, String pw, String name) {
		// db 연결
		Connection con = dbcon();
		// sql 작성
		String sql = "insert into acorntbl values(?,?,?)";
		PreparedStatement pst = null;
		try {
			// sql 실행(test를 위해 데이터를 직접 입력한 코드)
			pst = con.prepareStatement(sql);

//			pst.setString(1, "test9");
//			pst.setString(2, "1234");
//			pst.setString(3, "hong");
			pst.setString(1, id);
			pst.setString(2, pw);
			pst.setString(3, name);
			
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// db 연결 해제
		close(pst, con);
	}
	
	
// 정보를 입력할 수 있는 메서드3
							//	Customer 클래스로부터 매개변수를 받음	
//	public void insertMember2(String id, String pw, String name) {
	public void insertMember3(Customer c) {
		// db 연결
		Connection con = dbcon();
		// sql 작성
		String sql = "insert into acorntbl values(?,?,?)";
		PreparedStatement pst = null;
		try {
			// sql 실행(test를 위해 데이터를 직접 입력한 코드)
			pst = con.prepareStatement(sql);
			
//			pst.setString(1, id);
//			pst.setString(2, pw);
//			pst.setString(3, name);
			
			pst.setString(1, c.getId());
			pst.setString(2, c.getPw());
			pst.setString(3, c.getName());
			
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// db 연결 해제
		close(pst, con);
	}
	
// 정보를 삭제할 수 있는 메서드	
	public void deleteOne(String id) {
		// 연결
		Connection con = dbcon();

		// sql 작성
		String sql = "delete from acorntbl where id=?";
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

// 정보를 수정/업데이트할 수 있는 메서드
	public void updateMember(Customer c) {
		// 연결
		Connection con = dbcon();

		// 변경
		String sql="update acorntbl set pw=? where id=?";
		PreparedStatement pst = null;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(2, c.getId());
			pst.setString(1, c.getPw()); 
			// 실행
			pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 자원반납
		close(pst, con);
	}
	
// 연결끝
	public void close(AutoCloseable ...a) {
		for( AutoCloseable item : a) {
			try {
				item.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	// 제대로 작성했는가 확인을 위한 main 메서드
	public static void main(String[] args) {
		
		AcornDAO dao = new AcornDAO();
		// 전체조회
		ArrayList<String> list = dao.selectAll();
		
		System.out.println(list);
		// 입력1
//		dao.insertMember();
		// 입력2
//		//dao.insertMember2("test10", "0000", "kong");
//		//Customer c = new Customer("test11", "1111", "lee");
		// 입력3
//		//dao.insertMember3(c);
		// 조회
//		Customer customer = dao.selectOne("tm");
//		System.out.println(customer);
		// 삭제
//		dao.deleteOne("tm");
//		dao.updateMember(new Customer("mg", "8888"));
	}

}
