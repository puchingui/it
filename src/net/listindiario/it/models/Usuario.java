package net.listindiario.it.models;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
@Table(name="usuarios")
public class Usuario {

	@Id
	@Column(length=8)
	private int codigo;
	
	@Required
	@Column(length=48)
	@SearchKey
	private String nombre;
	
	@ManyToOne
	@DescriptionsList
	private Departamento departamento;
	
	@ManyToMany
	private Collection<Equipo> equipos;
	
	/****************************/

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Collection<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(Collection<Equipo> equipos) {
		this.equipos = equipos;
	}
}
