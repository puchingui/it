package net.listindiario.it.models;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
@Table(name="categorias")
public class Categoria extends Identificable {

	@Required
	@Column(length=24, unique=true)
	private String nombre;
	
	@OneToMany(mappedBy="categoria")
	private Collection<Componente> conponentes;
	
	/******************************************/

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Collection<Componente> getConponentes() {
		return conponentes;
	}

	public void setConponentes(Collection<Componente> conponentes) {
		this.conponentes = conponentes;
	}

}