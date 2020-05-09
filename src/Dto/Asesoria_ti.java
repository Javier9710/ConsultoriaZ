package Dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "asesoria_ti")
public class Asesoria_ti implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -642891227056537586L;
	@Id
	@OneToOne
	@JoinColumn(name="servicio")
	private Servicio servicio;
	private String descripcion;
	
	public Asesoria_ti() {
		
		
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
