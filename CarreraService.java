package com.api.uptap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.uptap.entity.Carrera;
import com.api.uptap.entity.CarreraJPA;

@Service
public class CarreraService implements CarreraServiceI{
	
	@Autowired
	private CarreraJPA repcarrera;

	@Override
	public List<Carrera> consultarCarrera() {
		// TODO Auto-generated method stub
		return repcarrera.findAll();
	}

	@Override
	public void actualizarCarrera(Carrera obj, int idcarr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registroCarrera(Carrera obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarCarrera(int idcarr) {
		// TODO Auto-generated method stub
		
	}

}
