
package com.api.uptap.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.api.uptap.entity.Asignatura;
import com.api.uptap.service.AsignaturaServiceI;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,
		RequestMethod.DELETE,RequestMethod.PUT})
@RequestMapping("/api")
public class AsignaturaController {
	@Autowired
	private AsignaturaServiceI serviceasig;
	
	@GetMapping("/asignatura")
	public List<Asignatura> mostrarTodos(){
		return serviceasig.consultarAsignatura();
	}

	@PostMapping("/asignatura")
	public Asignatura insertar(@RequestBody Asignatura obj){
		serviceasig.registroAsignatura(obj);
		return obj;
	}
	
	
	@PutMapping("/asignatura/{id}")
	public Asignatura actualizar(@RequestBody Asignatura obj,
			@PathVariable("id") int idasig){
		serviceasig.actualizarAsignatura(obj,idasig);
		return obj;
	}
	
	@DeleteMapping("/asignatura/{id}")
	public String eliminar(@PathVariable("id") int idasig){
		serviceasig.eliminarAsignatura(idasig);
		return "1";
	}
	
	@GetMapping("/asignatura/{id}")
	public Optional<Asignatura> localizar(@PathVariable("id") 
	int idasig){
		
		return serviceasig.consultarAsignatura(idasig);
	}
}
