package pessoa.model;

import org.springframework.data.annotation.Id;

public class Key {

	@Id
	private String id;
	private Long tenantCode;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getTenantCode() {
		return tenantCode;
	}

	public void setTenantCode(Long tenantCode) {
		this.tenantCode = tenantCode;
	}

}
