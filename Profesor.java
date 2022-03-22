package com.api.uptap.entity;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class Profesor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idprofesor;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "genero")
	private String genero;
	
	@Column(name = "profesion")
	private String profesion;

	@ManyToMany(mappedBy = "profesorset")
	@JsonIgnore
    public Set<Asignatura> asignaturaSet;
	
	//SETTER Y GETTERS

	public int getIdprofesor() {
		return idprofesor;
	}

	public void setIdprofesor(int idprofesor) {
		this.idprofesor = idprofesor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public Set<Asignatura> getAsignaturaSet() {
		return asignaturaSet;
	}

	public void setAsignaturaSet(Set<Asignatura> asignaturaSet) {
		this.asignaturaSet = asignaturaSet;
	}
	
	

}
