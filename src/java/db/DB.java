package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    private static Connection con;

	public static Connection getConnection(){
		if(con==null){
			try{
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://localhost/dashboard";
				con = DriverManager.getConnection(url,"senuri","yes");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		return con;
		
	}
}
