package cl.modulo.sesion7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping({"/","/inicio"})
public class Inicio {
	@GetMapping()
	public String inicio() {
		return "inicio";
	} 
}
