package db;
import java.sql.*;

public class Connessione {
	private Connection conn;
	private static Connessione connessione;
	private String db = "jdbc:postgresql://localhost:5432/rubrica";
	private Connessione() {
		try {
			conn = DriverManager.getConnection(db,"postgres","2005");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connessione getInstance() {
		if(connessione == null) {
			connessione = new Connessione();
		}
		return connessione;
	}
	
	public Connection getConnection() throws SQLException{
		if(conn == null || conn.isClosed()) {
			conn = DriverManager.getConnection(db,"postgres","2005");
		}
		return conn;
	}
}