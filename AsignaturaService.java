package com.api.uptap.service;

import java.util.List;

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
	

}
