package cl.modulo.sesion7.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.modulo.sesion7.entity.Usuario;
import cl.modulo.sesion7.services.InterfaceGenerico;

@Controller
@RequestMapping("/usuario")
public class UsuarioCont {

	@Autowired
	InterfaceGenerico<Usuario, Integer> iG;

	@GetMapping("/")
	public String listar(ModelMap modelmap) {
		List<Usuario> lista = iG.listar();
		modelmap.put("listaUsuarios", lista);
		return "listarCapacitaciones";
	} 
	
	@GetMapping("/crearUsuario")
	public String crearCapacitacion() {
		return "crearUsuario";
	} 

	@PostMapping("/crearUsuario")
	public String crearUsuarioPost(@ModelAttribute("FormCrearUsuario") Usuario usu){
		
		iG.crear(usu);
		return "listadoUsuario";
		/*String p = usu.getTipoUsuario();
		
		 * if(p==("3")) {
			Administrativo adm = new Administrativo();
			adm.get
	
		return new RedirectView("listarUsuario");
	}*/
	}
}
/*
 * @PostMapping("/redirectedPostToPost")
public ModelAndView redirectedPostToPost() {
    return new ModelAndView("redirection");
}
		@GetMapping("/")
		public String listarCapacitacion(ModelMap modelmap) {
			List<Capacitacion> lista = iCS.listarCapacitaciones();
			modelmap.put("listaCapacitaciones", lista);
			return "listarCapacitaciones";
		} 
		
		@PostMapping("/crearCapacitacion")
		public RedirectView crearCapacitacionPost(@ModelAttribute("FormCrearCapacitacion") Capacitacion cap){
			iCS.crearCapacitacion(cap);
			return new RedirectView("/capacitacion/");
		}
		
}

 */
