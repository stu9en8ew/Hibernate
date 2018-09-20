package com.beije.model;

import java.io.Serializable;

public class Utente implements Serializable {
	
	private static final long serialVersionUID = 2L;
	
	private String nome;
	private String cognome;
	private Professione professione;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public Professione getProfessione() {
	return professione;
	}
	public void setProfessione(Professione professione) {
		this.professione = professione;
	}
	
	@Override
	public String toString() {
		return "Utente [nome=" + nome + ", cognome=" + cognome + ", professione=" + professione + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((professione == null) ? 0 : professione.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Utente other = (Utente) obj;
		if (cognome == null) {
			if (other.cognome != null)
				return false;
		} else if (!cognome.equals(other.cognome))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (professione == null) {
			if (other.professione != null)
				return false;
		} else if (!professione.equals(other.professione))
			return false;
		return true;
	}
	

}
