package Consprj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConDAO {
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
	//-------------------------------------------------------------------------
	public ArrayList<String> selectAll() {
		// db 연결
		Connection con = dbcon();
		
		// 테이블에서 모든 컬럼을 선택
		String sql = "select * from constructor";
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
				list.add(rs.getString(3));
				list.add(rs.getString(4));
				list.add(rs.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 해제
		close(rs, pst, con);
		return list;
	}
//-------------------------------------------------------------------------
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
}
