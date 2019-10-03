package com.yaprofe.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="Estudiante")
public class Estudiante implements Serializable {
	private static final long serialVersionUID= -1L;
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	@Lob
	private String nombres;
	@Lob
	private String apellidos;
	@Lob
	private String email;
	@Column(name="nro_telefono")
	private int telefono;
	@Column(name="nivel_educacional")
	private NivelEducacional nivelEducacional;
	
}
