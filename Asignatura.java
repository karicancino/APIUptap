package com.api.uptap.entity;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Asignatura {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idasig;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "creditos")
	private String creditos;
	
	@ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "asignatura_profesor",
            joinColumns = @JoinColumn(name = "idasig"),
            inverseJoinColumns = @JoinColumn(name = "idprofesor")
    )
	private Set<Profesor> profesorset;
	
	//SETTER Y GETTERS

	public int getIdasig() {
		return idasig;
	}

	public void setIdasig(int idasig) {
		this.idasig = idasig;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCreditos() {
		return creditos;
	}

	public void setCreditos(String creditos) {
		this.creditos = creditos;
	}

	public Set<Profesor> getProfesorset() {
		return profesorset;
	}

	public void setProfesorset(Set<Profesor> profesorset) {
		this.profesorset = profesorset;
	}

	
}

