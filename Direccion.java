package com.api.uptap.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "direccion")

public class Direccion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_dir")
	private int id_direcc;
	
	@Column(name = "calle")
	private String calle;
	
	@Column(name = "numext")
	private String numext;
	
	@Column(name = "numint")
	private String numint;
	
	@Column(name = "colonia")
	private String colonia;
	
	@Column(name = "codigopostal")
	private String codigopostal;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "matric_fk", referencedColumnName="matricula")
	private Alumno matriculafk;

	public int getId_direcc() {
		return id_direcc;
	}

	public void setId_direcc(int id_direcc) {
		this.id_direcc = id_direcc;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumext() {
		return numext;
	}

	public void setNumext(String numext) {
		this.numext = numext;
	}

	public String getNumint() {
		return numint;
	}

	public void setNumint(String numint) {
		this.numint = numint;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getCodigopostal() {
		return codigopostal;
	}

	public void setCodigopostal(String codigopostal) {
		this.codigopostal = codigopostal;
	}

	public Alumno getMatriculafk() {
		return matriculafk;
	}

	public void setMatriculafk(Alumno matriculafk) {
		this.matriculafk = matriculafk;
	}
	
	
}
