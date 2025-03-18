package com.api.uptap.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.uptap.entity.Asignatura;
import com.api.uptap.entity.AsignaturaJPA;

@Service
public class AsignaturaService implements AsignaturaServiceI{

	@Autowired
	private AsignaturaJPA repasig;
	
	@Override
	public List<Asignatura> consultarAsignatura() {
		// TODO Auto-generated method stub
		return repasig.findAll();

	}
	
	@Override
	public void registroAsignatura(Asignatura obj) {
		// TODO Auto-generated method stub
		repasig.save(obj);
		
	}
	
	@Override
	public void actualizarAsignatura(Asignatura obj, int idasig) {
		// TODO Auto-generated method stub
		obj.setIdasig(idasig);
		repasig.save(obj);  //SpringDataJPA
	}
	
	@Override
	public void eliminarAsignatura(int idasig) {
		// TODO Auto-generated method stub
		repasig.deleteById(idasig); //SpringDataJPA		
	}

	
	@Override
	public Optional<Asignatura> consultarAsignatura(int idasig) {
		// TODO Auto-generated method stub
		return repasig.findById(idasig);
	}

}
