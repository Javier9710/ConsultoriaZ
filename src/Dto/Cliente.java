package Dto;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Cliente")
public class Cliente implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1517411724018017089L;
	@Id
	private String nit;
	private String nombre;
	private String direccion;
	private Date registro;
	private String contacto;

	
	
	public Cliente() {
			
		
		
	}


	public String getNit() {
		return nit;
	}


	public void setNit(String nit) {
		this.nit = nit;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getContacto() {
		return contacto;
	}


	public void setContacto(String contacto) {
		this.contacto = contacto;
	}


	public Date getRegistro() {
		return registro;
	}


	public void setRegistro(Date registro) {
		this.registro = registro;
	}
	
	
	
	
	
	

}
