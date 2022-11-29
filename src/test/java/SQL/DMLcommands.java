package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DMLcommands {
	
	public static void main(String[]args) throws SQLException
	{
		String un="root";
		String pw="Root";
		//create connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/vishnu",un,pw);
		//create statement
		Statement stmt=con.createStatement();
		/*
		 -----------INSERT---------------- 
		 String s="INSERT INTO GRADE(SNO,SNAME,GRADE) VALUES(3,'BABA','A')";
		 */
		/*
		 -----------UPDATE----------------
		String s="UPDATE GRADE SET SNAME='VARDHAN' WHERE SNO=2";
		*/
		String s="DELETE FROM GRADE WHERE SNO=1";
		//EXICUTE THE QUERY
		stmt.execute(s);
		//close theconnection
		con.close();
		System.out.println("Query Exicuted...");
	}

}
