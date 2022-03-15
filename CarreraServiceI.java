package com.api.uptap.service;

import java.util.List;
import java.util.Optional;

import com.api.uptap.entity.Carrera;

public interface CarreraServiceI {
	
	List<Carrera> consultarCarrera();
	Optional<Carrera> consultarCarrera(int idcarr);
	
	void actualizarCarrera(Carrera obj,int idcarr);
	void registroCarrera(Carrera obj);	
	void eliminarCarrera(int idcarr);
	

}

