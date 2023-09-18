package jsondriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jsondriver.DriverMember;
import jsondriver.DriverDAO;

public class DriverDAO {
	String driver = "oracle.jdbc.driver.OracleDriver" ;
	  String url="jdbc:oracle:thin:@localhost:1521:xe";
	  String user="scott";
	  String password="tiger";	 
	
	public Connection dbcon(){	 
		Connection con =null;
		try {
			Class.forName(driver);
			con  =DriverManager.getConnection(url, user, password);
			if( con != null) System.out.println("ok");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public ArrayList<DriverMember>  getDriverList(){		
		
		 Connection con  =dbcon();		 
		 String sql=" select  * from  driver ";
		 ArrayList<DriverMember> list = new ArrayList<>();
		 
		 try {
			PreparedStatement pst  = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while( rs.next()){				
				 String name=rs.getString(1);
				 int num= rs.getInt(2);
				 String team= rs.getString(3);
				 String nationality= rs.getString(4);
				 int wins= rs.getInt(5);
				 int champ= rs.getInt(6);
				 String most_wins_circuit= rs.getString(7);
				 
				 DriverMember d = new DriverMember( name, num, team, nationality, wins, champ, most_wins_circuit );
				 list.add(d);						 
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
	
	public static void main(String[] args){
		  DriverDAO d = new DriverDAO();
		  d.dbcon();
		  ArrayList<DriverMember> list  = d.getDriverList();	  
		  System.out.println(list);
		  
	}
}
