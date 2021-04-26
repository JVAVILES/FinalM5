package cl.modulo.sesion7.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import cl.modulo.sesion7.entity.Capacitacion;
import cl.modulo.sesion7.services.ICapacitacionServ;

@Controller
@RequestMapping("/capacitacion")
public class CapacitacionCont {
		
		@Autowired
		ICapacitacionServ iCS;
		
		@GetMapping("/")
		public String listarCapacitacion(ModelMap modelmap) {
			List<Capacitacion> lista = iCS.listarCapacitaciones();
			modelmap.put("listaCapacitaciones", lista);
			return "listarCapacitaciones";
		} 
		
		@GetMapping("/crearCapacitacion")
		public String crearCapacitacion() {
			return "crearCapacitacion";
		} 
		@PostMapping("/crearCapacitacion")
		public RedirectView crearCapacitacionPost(@ModelAttribute("FormCrearCapacitacion") Capacitacion cap){
			iCS.crearCapacitacion(cap);
			return new RedirectView("/capacitacion/");
		}
		
}
