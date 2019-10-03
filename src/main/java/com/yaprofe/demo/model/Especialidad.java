package com.yaprofe.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="Especialidad")
public class Especialidad {
	private static final long serialVersionUID= -1L;
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	@Lob
	private String nombre;
	@Lob
	private String descripcion;
	private String tituloProfesional;
	private String establecimientoEducacional;
}
