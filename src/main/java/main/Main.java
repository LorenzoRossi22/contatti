package main;
import db.Connessione;
import java.sql.*;
public class Main {
	public static void main(String[] args) throws SQLException{
		Connection con = Connessione.getInstance().getConnection();
		Statement st = con.createStatement();
		st.executeUpdate("INSERT INTO dao VALUES ('1234567890','giampiero',2,'giampiero@gmail.coms');");
	}
}
