package pessoa.model;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.mongodb.core.mapping.Document;

import tenant.enumeration.Grupo;
import tenant.enumeration.StatusPessoaTenant;

@Document(collection = "tenant_status_pessoa")
public class StatusPessoa extends Key {

	private String email;
	private StatusPessoaTenant status;
	private Set<Grupo> grupos;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Grupo> getGrupos() {
		if (this.grupos == null) {
			this.grupos = new HashSet<>();
		}
		return grupos;
	}

	public void addGrupo(Grupo grupo) {
		getGrupos().add(grupo);
	}

	public StatusPessoaTenant getStatus() {
		return status;
	}

	public void setStatus(StatusPessoaTenant status) {
		this.status = status;
	}
}
