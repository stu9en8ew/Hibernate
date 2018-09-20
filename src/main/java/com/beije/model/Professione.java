package com.beije.model;

import java.io.Serializable;

/**
 * @author Marcio
 *
 */
public class Professione implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome;
	//private List<Utente> utenti;
	
	public String getNome() {
		return nome;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	/*public List<Utente> getUtenti() {
		return utenti;
	}
	public void setUtenti(List<Utente> utenti) {
		this.utenti = utenti;
	}*/

	/*@Override
	public String toString() {
		return "Professione [id=" + id + ", nome=" + nome + ", utenti=" + utenti + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((utenti == null) ? 0 : utenti.hashCode());
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
		Professione other = (Professione) obj;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (utenti == null) {
			if (other.utenti != null)
				return false;
		} else if (!utenti.equals(other.utenti))
			return false;
		return true;
	}*/
	
	@Override
	public String toString() {
		return "Professione [id=" + id + ", nome=" + nome + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Professione other = (Professione) obj;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
	

}
