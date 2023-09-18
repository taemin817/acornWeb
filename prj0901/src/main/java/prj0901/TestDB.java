package prj0901;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDB {
	// db에 접근하는 법의 코드. 제대로 출력했나를 위해 메인 내에서 작성
	public static void main(String[] args) {
		// oracle db를 사용하데 있어서 공식같은 내용
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
				Class.forName(driver);
				con = DriverManager.getConnection(url, user, password);
				// con에 주소 아이디 비번이 들어갔으니 null이 아니라 ok를 출력
				if( con != null) System.out.println("ok");
				
				// 테이블 이름을 입력
				String sql = "select name from acorntbl";
				pst = con.prepareStatement(sql);
				rs = pst.executeQuery();
				
				while( rs.next() ) {
					System.out.println( rs.getString(1));
				}
			
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} finally { // 자원반납 : 예외가 발생하든 하지않든 수행. 역순으로 close
				if(rs != null)
					try {
						rs.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				if(pst != null)
					try {
						pst.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				if(con != null)
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				
		}
		
	}

}
