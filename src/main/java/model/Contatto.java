package model;

import java.util.Objects;

public class Contatto {
	private String nome;
	private String numero;
	private String email;
	private int id;
	
	public Contatto(String nome, String numero, String email) {
		this.nome = nome;
		this.numero = numero;
		this.email = email;
	}
	
	public Contatto(String nome, String numero, String email, int id) {
		this.nome = nome;
		this.numero = numero;
		this.email = email;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Contatto [nome=" + nome + ", numero=" + numero + ", email=" + email + ", id=" + id + "]";
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Contatto)) {
			return false;
		}
		Contatto other = (Contatto) obj;
		return id == other.id;
	}
	
	
}
