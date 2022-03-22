package com.api.uptap.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.api.uptap.entity.Asignatura;
import com.api.uptap.service.AsignaturaServiceI;


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

}
