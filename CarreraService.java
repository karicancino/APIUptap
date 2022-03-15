package com.api.uptap.service;

import java.util.List;
import java.util.Optional;
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
		//return null;
	}

	@Override
	public void registroCarrera(Carrera obj) {
		// TODO Auto-generated method stub
		repcarrera.save(obj);
	}
	
	@Override
	public void actualizarCarrera(Carrera obj, int idcarr) {
		// TODO Auto-generated method stub
		obj.setId_carrera(idcarr);
		repcarrera.save(obj);  //SpringDataJPA
	}

	@Override
	public void eliminarCarrera(int idcarr) {
		// TODO Auto-generated method stub
		repcarrera.deleteById(idcarr); //SpringDataJPA		
	}

	@Override
	public Optional<Carrera> consultarCarrera(int idcarr) {
		// TODO Auto-generated method stub
		return repcarrera.findById(idcarr);
	}
	
}
