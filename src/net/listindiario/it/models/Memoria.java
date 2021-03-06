package net.listindiario.it.models;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
@Table(name="")
public class Memoria extends Identificable {

	@Required
	@Column(length=32, unique=true)
	private String descripcion;
	
	@OneToMany(mappedBy="memoria")
	private Collection<Componente> componentes;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Collection<Componente> getComponentes() {
		return componentes;
	}

	public void setComponentes(Collection<Componente> componentes) {
		this.componentes = componentes;
	}
}
