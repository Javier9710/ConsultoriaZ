package Dto;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "Persona")
public class Persona implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3332029299797149599L;
	@Id
	private String cedula;
	private String nombre;
	private int edad;
	private String telefono;
	private String foto;
	private Date ingreso;
	


	public Persona() {

	}



	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}



	public Date getIngreso() {
		return ingreso;
	}



	public void setIngreso(Date ingreso) {
		this.ingreso = ingreso;
	}
	
	

}
