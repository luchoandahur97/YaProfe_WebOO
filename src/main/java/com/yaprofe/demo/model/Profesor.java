package com.yaprofe.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="Profesor")
public class Profesor {
	private static final long serialVersionUID= -1L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	@Lob
	private String nombres;
	@Lob
	private String apellidos;
	private String rut;
	@Lob
	private String email;
	private String password;
	@Column(name="nro_telefono")
	private int telefono;
	private String descripcion;
	private String modalidad;
	private int tarifa;
	private String ciudad;
	@Column(name="nivel_educacional")
	private String nivelEducacional;
	
	
	public Profesor() {}

	public Profesor(int id, String nombres, String apellidos,String rut, String email, String password, int telefono,
			String descripcion, String modalidad, int tarifa, String ciudad, String nivelEducacional) {
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.rut = rut;
		this.email = email;
		this.password = password;
		this.telefono = telefono;
		this.descripcion = descripcion;
		this.modalidad = modalidad;
		this.tarifa = tarifa;
		this.ciudad = ciudad;
		this.nivelEducacional = nivelEducacional;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public int getTarifa() {
		return tarifa;
	}

	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getNivelEducacional() {
		return nivelEducacional;
	}

	public void setNivelEducacional(String nivelEducacional) {
		this.nivelEducacional = nivelEducacional;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
