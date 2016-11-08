package br.com.coppieters.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@Column(name = "nome",length = 45, nullable = false)
	private String nome;
	
	@Column(name = "rg_ie",length = 50, nullable = false)
	private String rg_ie;
	
	@Column(name = "cpf_cnpj",length = 20, nullable = false)
	private String cpf_cnpj;
	
	@Column(name = "email",length = 500, nullable = false)
	private String email;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg_ie() {
		return rg_ie;
	}

	public void setRg_ie(String rg_ie) {
		this.rg_ie = rg_ie;
	}

	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", rg_ie=" + rg_ie + ", cpf_cnpj=" + cpf_cnpj + ", email="
				+ email + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf_cnpj == null) ? 0 : cpf_cnpj.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((rg_ie == null) ? 0 : rg_ie.hashCode());
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
		Pessoa other = (Pessoa) obj;
		if (cpf_cnpj == null) {
			if (other.cpf_cnpj != null)
				return false;
		} else if (!cpf_cnpj.equals(other.cpf_cnpj))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (rg_ie == null) {
			if (other.rg_ie != null)
				return false;
		} else if (!rg_ie.equals(other.rg_ie))
			return false;
		return true;
	}

	
}
