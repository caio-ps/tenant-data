package br.com.caiosousa.tenant.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "contador_tenants")
public class ContadorTenants {

	@Id
	private String id;
	private Long codigoUltimoTenant;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getCodigoUltimoTenant() {
		return codigoUltimoTenant;
	}

	public void setCodigoUltimoTenant(Long codigoUltimoTenant) {
		this.codigoUltimoTenant = codigoUltimoTenant;
	}

}
