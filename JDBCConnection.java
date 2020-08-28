package config;
import java.sql.*;

public class JDBCConnection {
	public static Connection getDBConnection() throws ClassNotFoundException, SQLException{
		String url="jdbc:sqlserver://DESKTOP-R1R27C4//SQLEXPRESS:1434;databaseName=PCSDB";
		String username="sa";
		String password="niit@123";
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection conn=DriverManager.getConnection(url,username,password);
		return conn;
	}
}
