<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.sql.*"%>
<%
 // 1.
 request.setCharacterEncoding("UTF-8");

 // 2.
 String userid = request.getParameter("userid");
 String userpw = request.getParameter("userpw");
 String usernm = request.getParameter("usernm");

 // db연결, sql update 실행
 	Connection con = null; 
	PreparedStatement st = null;
	
	try{
		String driver = "oracle.jdbc.driver.OracleDriver"; 
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
		String user = "scott";
		String password = "tiger";
		
		Class.forName(driver); 										// driver = "oracle.jdbc.driver.OracleDriver"; 
		
		con = DriverManager.getConnection(url, user, password);		// String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
																	// String user = "scott";
																	// String password = "tiger";
		
		
		String sql = "update acorntbl ";
					sql+= " set pw=? ";
					sql+= " where id=? "; 	//5. 최종적으로 실행
					
		st = con.prepareStatement(sql);
		st.setString(1, userpw); 
		st.setString(2, userid);
		// 실행
	
		st.executeUpdate();									// sql = "select * from member_tbl_11";
		
		//6. 가져온 쿼리 결과를 화면에 출력하기
	}catch(Exception e){
		e.printStackTrace();

	} finally{
					//자원의 반납
	if( st != null) st.close();
	if( con != null) con.close();
	}
	
 // response.sendRedirect("index.jsp");
 %>