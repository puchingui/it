package net.listindiario.it.models;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
@Table(name="departamentos")
public class Departamento {

	@Id
	private String nombre;
	
	@OneToMany(mappedBy="departamento")
	private Collection<Usuario> usuario;
	
	@OneToMany(mappedBy="departamento")
	@ListAction("ManyToMany.new")
	private Collection<Equipo> equipos;
	
	/*************************************/

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Collection<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(Collection<Usuario> usuario) {
		this.usuario = usuario;
	}

	public Collection<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(Collection<Equipo> equipos) {
		this.equipos = equipos;
	}
	
}
