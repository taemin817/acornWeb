package acorn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDAO {

	// DB연결정보
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";

	// 연결하는 메서드
	public Connection dbcon() {
		Connection con = null;
		// 객체를 생성하는 코드
		try {
			Class.forName(driver); 
			con = DriverManager.getConnection(url, user, password);
		}catch (SQLException e) {
				e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}

	public String selectOne(String id) {
		String name = "";
		Connection con = dbcon();
		String sql = "select name from acorntbl where id=?";
		try {
			PreparedStatement pst= con.prepareStatement(sql);
			pst.setString(1, id);
			ResultSet rs = pst.executeQuery();
			
			// 단건조회
			if(rs.next()) {
				name = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return name;
	}
	// 연결여부 확인 메서드
	public static void main(String[] args) {
		TestDAO dao = new TestDAO();
//		Connection con = dao.dbcon()	;
//		if( con != null ) System.out.println("db ok");
		String name = dao.selectOne("sb");
		System.out.println(name);
	}
}
