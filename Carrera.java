package com.api.uptap.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "carrera")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class Carrera implements Serializable{
	
	private static final long serialVersionUID=1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_carrera")
	private int id_carrera;
	
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany(mappedBy="id_carrerafk", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Set<Alumno> alumnos;
	

	
	public Set<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Set<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	//GENERACION AUTOMATICA DE GETTERS Y SETTERS
	public int getId_carrera() {
		return id_carrera;
	}

	public void setId_carrera(int id_carrera) {
		this.id_carrera = id_carrera;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
