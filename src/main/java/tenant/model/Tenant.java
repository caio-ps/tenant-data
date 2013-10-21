package tenant.model;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.mongodb.core.mapping.Document;

import tenant.enumeration.TipoTenant;

@Document(collection = "tenants")
public class Tenant extends Key {

	private String descricao;
	private Set<String> administradores;
	private TipoTenant tipo;

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
}
