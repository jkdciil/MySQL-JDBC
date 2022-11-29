package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SELECT {

	public static void main(String[] args) throws SQLException {
		String un="root";
		String pw="Root";
		//CREATE CONNECTION
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/vishnu",un,pw);
		//create a statement
		Statement s=con.createStatement();
		String su="SELECT * FROM GRADE";
		//EXICUTE THE QUERY and print in console
		ResultSet rs=s.executeQuery(su);
		
		while(rs.next())
		{
			int sno=rs.getInt("SNO");
			String sname=rs.getString("SNAME");
			String grade=rs.getString("grade");
			System.out.println(sno+"   "+sname+"   "+grade);
		}
		//close the connection
		con.close();

	}

}
