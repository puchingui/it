package net.listindiario.it.models;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
@Table(name="modelos")
public class Modelo extends Identificable {
	
	@Required
	@Column(length=24)
	private String nombre;
	
	@Required
	@ManyToOne
	@DescriptionsList
	private Marca marca;
	
	/****************************************/
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
}
