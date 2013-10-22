package br.com.caiosousa.tenant.model;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.mongodb.core.mapping.Document;

import br.com.caiosousa.enumeration.Status;
import br.com.caiosousa.tenant.enumeration.TipoTenant;



@Document(collection = "tenants")
public class Tenant extends Key {

	private String descricao;
	private Set<String> administradores;
	private TipoTenant tipo;
	private Status status;
	private Long numeroDePessoas;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoTenant getTipo() {
		return tipo;
	}

	public void setTipo(TipoTenant tipo) {
		this.tipo = tipo;
	}

	public Set<String> getAdministradores() {
		if (administradores == null) {
			administradores = new HashSet<>();
		}
		return administradores;
	}

	public void setAdministradores(Set<String> administradores) {
		this.administradores = administradores;
	}

	public Long getNumeroDePessoas() {
		return numeroDePessoas;
	}

	public void setNumeroDePessoas(Long numeroDePessoas) {
		this.numeroDePessoas = numeroDePessoas;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}
