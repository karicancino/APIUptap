package com.api.uptap.service;
import java.util.List;
import java.util.Optional;

import com.api.uptap.entity.Asignatura;

public interface AsignaturaServiceI {
	List<Asignatura> consultarAsignatura();
	void registroAsignatura(Asignatura obj);
	public void actualizarAsignatura(Asignatura obj, int idasig);
	
	void eliminarAsignatura(int idasig);
	Optional<Asignatura> consultarAsignatura(int idasig);

	
	
}
