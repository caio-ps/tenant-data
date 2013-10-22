package br.com.caiosousa.tenant.model;

import org.springframework.data.annotation.Id;

public class Key {

	@Id
	private String id;
	private Long codigoTenant;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getCodigoTenant() {
		return codigoTenant;
	}

	public void setCodigoTenant(Long codigoTenant) {
		this.codigoTenant = codigoTenant;
	}
}
