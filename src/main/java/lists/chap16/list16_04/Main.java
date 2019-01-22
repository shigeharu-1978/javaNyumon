package lists.chap16.list16_04;
import java.sql.*;
public class Main {
	public static void main(String[] args) throws Exception {
		Class.forName("org.h2.Driver");
		String dburl = "jdbc:h2:~/test";
		String sql = "INSERT INTO EMPLOYEES (name) VALUES ('iida')";
		Connection conn = DriverManager.getConnection(dburl);
		conn.createStatement().executeUpdate(sql);
		conn.close();
	}
}
