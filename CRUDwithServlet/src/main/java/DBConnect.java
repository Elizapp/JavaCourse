
public class DBConnect {
	Connection connection;
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("");
		}
	}
}
