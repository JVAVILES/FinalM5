package cl.modulo.sesion7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import cl.modulo.sesion7.entity.Capacitacion;
import cl.modulo.sesion7.entity.Profesional;
import cl.modulo.sesion7.entity.Usuario;
import cl.modulo.sesion7.repository.IProfesionalRepo;
import cl.modulo.sesion7.services.InterfaceGenerico;
import cl.modulo.sesion7.services.ProfesionalImp;
import cl.modulo.sesion7.services.UsuarioServImp;

@Controller
@RequestMapping("/Profesional")
public class ProfesionalCont {
	
	InterfaceGenerico<Profesional> iP;
	
	/*@PostMapping("/editar")
		public RedirectView crearPost(@ModelAttribute("formActualizarUsuario") Profesional pro){
		iP.crear(pro);
		return new RedirectView("/Profesional/");
		}*/
}
