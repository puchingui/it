package net.listindiario.it.models;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
@Table(name="inventario")
@View(members="Datos {serial; "
		+ "categoria; "
		+ "marca; "
		+ "modelo;"
		+ "procesador;"
		+ "memoria;"
		+ "almacenamiento; "
		+ "observacion};"
		+ "Foto {foto};"
		+ "Equipo {equipo}")
public class Componente extends Identificable {

	@ManyToOne
	private Equipo equipo;
	
	@Column(length=32)
	private String serial;

	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@DescriptionsList
	private Categoria categoria;
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@DescriptionsList
	private Marca marca;
	
	@ManyToOne(fetch=FetchType.LAZY, optional=true)
	@DescriptionsList(
			descriptionProperties="nombre",
			depends="this.marca",
			condition="${marca.oid} = ?")	
	private Modelo modelo;
	
	@Stereotype("PHOTO")
	private byte[] foto;
	
	@Stereotype("MEMO")
	private String observacion;
	
	@ManyToOne
	@DescriptionsList
	private Procesador procesador;
	
	@ManyToOne
	@DescriptionsList
	private Memoria memoria;
	
	@ManyToOne
	@DescriptionsList
	private Almacenamiento almacenamiento;
	
	
	/**************************************/

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial.toUpperCase();
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public Procesador getProcesador() {
		return procesador;
	}

	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	public Memoria getMemoria() {
		return memoria;
	}

	public void setMemoria(Memoria memoria) {
		this.memoria = memoria;
	}

	public Almacenamiento getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(Almacenamiento almacenamiento) {
		this.almacenamiento = almacenamiento;
	}
}
