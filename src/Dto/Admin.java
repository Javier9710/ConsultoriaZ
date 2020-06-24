package Dto;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name = "Admin")
public class Admin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@OneToOne
	@JoinColumn(name="persona")
	private Persona persona;
	
	

	private String pass;

	public Admin() {
	}

	

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Persona getPersonaBean() {
		return this.persona;
	}

	public void setPersonaBean(Persona persona) {
		this.persona = persona;
	}

}