package net.listindiario.it.models;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
@Table(name="marcas")
public class Marca extends Identificable {
	
	@Required
	@Column(length=24)
	private String nombre;
	
	@Stereotype("PHOTO")
	private byte[] logo;
	
	@OneToMany(mappedBy="marca")
	@ListAction("ManyToMany.new")
	private Collection<Modelo> modelos;
	
	/***********************************/

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	public Collection<Modelo> getModelos() {
		return modelos;
	}

	public void setModelos(Collection<Modelo> modelos) {
		this.modelos = modelos;
	}

}
