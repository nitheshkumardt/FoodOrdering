package FoodOrder.Util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	public static Connection getDBConnection()
	{
		Connection con=null;
		String url="jdbc:postgresql://localhost:5432/test";
		String uname="postgres";
		String pass="postgres";
		try {
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection(url, uname, pass);
			System.out.println("Successfull");
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("Error");
		}
		
		return con;
	}
}
