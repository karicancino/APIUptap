package com.api.uptap.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.api.uptap.entity.Carrera;
import com.api.uptap.service.CarreraServiceI;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,
		RequestMethod.DELETE,RequestMethod.PUT})
@RequestMapping("/api")
public class CarreraController {
	@Autowired
	private CarreraServiceI servicecarr;
	
	@GetMapping("/carrera")
	public List<Carrera> mostrarTodos(){
		return servicecarr.consultarCarrera();
	}
	
	@PostMapping("/carrera")
	public Carrera insertar(@RequestBody Carrera obj){
		servicecarr.registroCarrera(obj);
		return obj;
	}
	
	@PutMapping("/carrera/{id}")
	public Carrera actualizar(@RequestBody Carrera obj,
			@PathVariable("id") int idcarr){
		servicecarr.actualizarCarrera(obj,idcarr);
		return obj;
	}
	
	@DeleteMapping("/carrera/{id}")
	public String eliminar(@PathVariable("id") int idcarr){
		servicecarr.eliminarCarrera(idcarr);
		return "1";
	}
	
	@GetMapping("/carrera/{id}")
	public Optional<Carrera> localizar(@PathVariable("id") 
	int idcarr){
		
		return servicecarr.consultarCarrera(idcarr);
	}
}
