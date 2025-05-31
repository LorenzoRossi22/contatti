package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import db.Connessione;
import model.Contatto;
public class ContattiDAOimplement implements ContattiDAO {
	
	private LinkedList<Contatto> contatti;
	@Override
	public void addContatto(Contatto c) {
		try {
			Connection conn = Connessione.getInstance().getConnection();
			String nome = c.getNome();
			String numero = c.getNumero();
			String email = c.getEmail();
			String query = "INSERT INTO dao (nome, telefono, email) VALUES (?, ?, ?)";
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, nome);
			stmt.setString(2, numero);
			stmt.setString(3, email);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public List<Contatto> getContatti(){
		contatti = new LinkedList<>();
		try {
			Connection conn = Connessione.getInstance().getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM dao");
			while(rs.next()) {
				String nome = rs.getString("nome");
				String numero = rs.getString("numero");
				String email = rs.getString("email");
				int id = rs.getInt("id");
				Contatto c = new Contatto(nome,numero,email,id);
				if(!contatti.contains(c)) {
					contatti.add(c);
				}
			}
			return contatti;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}