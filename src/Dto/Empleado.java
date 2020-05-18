package Dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Empleado")
public class Empleado implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8374843910073210378L;
	@Id
	@OneToOne
	@JoinColumn(name="persona" )
	private Persona persona;
	private String pass;
	@ManyToOne
	@JoinColumn(name="cargo")
	private Cargo cargo;
	

	public Empleado() {

	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}
