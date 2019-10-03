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
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	@Lob
	private String nombres;
	@Lob
	private String apellidos;
	private int rut;
	private char dv;
	@Lob
	private String email;
	private String password;
	@Column(name="nro_telefono")
	private int telefono;
	private String descripcion;
	private String modalidad;
	private int tarifa;
	private String ciudad;
}
