package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class javadatabase {
    public static void main(String args[]) {
    	try {
    	
    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
    		Statement stmt = con.createStatement();
    		ResultSet rs = stmt.executeQuery("select  now()");
    		//ResultSet rs = stmt.executeQuery("select  regno,name from stud");
    		while (rs.next())
    			System.out.println(rs.getString(1));
    		con.close();
    	}
    	catch (Exception e) {
    		System.out.println(e);
    	}
    }
}
