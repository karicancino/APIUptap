package com.api.uptap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "asignatura")

public class Asignatura {
	
	//llave primaria
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id_asig")
		private int id_asig;
		@Column(name = "nombre")
		private String nombre;
		
		public int getId_asig() {
			return id_asig;
		}
		public void setId_asig(int id_asig) {
			this.id_asig = id_asig;
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
		@Column(name = "creditos")
		private String creditos;

}
