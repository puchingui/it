package net.listindiario.it.models;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
@Table(name="equipos")
public class Equipo extends Identificable {

	@Column(length=16)
	private String activo;
	
	@ManyToOne
	@DescriptionsList
	private Departamento departamento;
	
	@Stereotype("IMAGES_GALLERY")
	@Column(length=32)
	private String galeria;
	
	@Stereotype("MEMO")
	private String observacion;
	
	@ManyToMany
	@ListAction("ManyToMany.new")
	private Collection<Usuario> usuarios;
	
	@OneToMany(mappedBy="equipo")
	@ListAction("ManyToMany.new")
	private Collection<Componente> partes;
	
	/************************************/

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo.toUpperCase();
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public String getGaleria() {
		return galeria;
	}

	public void setGaleria(String galeria) {
		this.galeria = galeria;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Collection<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Collection<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Collection<Componente> getPartes() {
		return partes;
	}

	public void setPartes(Collection<Componente> partes) {
		this.partes = partes;
	}
}
